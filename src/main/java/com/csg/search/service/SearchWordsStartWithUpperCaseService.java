package com.csg.search.service;

import com.csg.search.object.SearchCriteria;
import com.csg.search.processor.SearchWordsProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service("searchWordsStartWithUpperCaseService")
public class SearchWordsStartWithUpperCaseService implements SearchWordsService {

    private SearchWordsProcessor searchWordsProcessor;

    @Autowired
    public SearchWordsStartWithUpperCaseService(@Qualifier("searchWordsStartWithUpperCaseProcessor") SearchWordsProcessor searchWordsProcessor) {
        this.searchWordsProcessor = searchWordsProcessor;
    }

    @Override
    public void searchWords(SearchCriteria searchCriteria, String... filePaths) {
        System.out.println("# Number of words that start with upper case letter in each file");

        for(String filePath : filePaths){
            try {
                List<String> searchResult = searchWordsProcessor.getWordsStartWithUpperCase(filePath, searchCriteria);

                System.out.println("=========");
                System.out.println("File " + filePath + " : " + searchResult.size());
                System.out.println("=========");

            } catch (IOException e) {
                System.out.println("File " + filePath + " is not found or invalid");
            }

        }
    }
}
