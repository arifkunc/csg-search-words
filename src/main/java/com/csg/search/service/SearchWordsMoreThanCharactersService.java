package com.csg.search.service;

import com.csg.search.object.SearchCriteria;
import com.csg.search.processor.SearchWordsProcessor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


@Service("searchWordsMoreThanCharactersService")
public class SearchWordsMoreThanCharactersService implements SearchWordsService {

    private SearchWordsProcessor searchWordsProcessor;

    public SearchWordsMoreThanCharactersService(@Qualifier("searchWordsMoreThanCharactersProcessor") SearchWordsProcessor searchWordsProcessor) {
        this.searchWordsProcessor = searchWordsProcessor;
    }

    @Override
    public void searchWords(SearchCriteria searchCriteria, String... filePaths) {
        System.out.println("# List all the words that are longer than 5 characters long in each file");

        for(String filePath : filePaths){
            try {
                List<String> searchResult = searchWordsProcessor.getWordsStartWithUpperCase(filePath, searchCriteria);

                System.out.println("=========");
                System.out.println("# File " + filePath + " : ");
                printListOfString(searchResult);
                System.out.println("=========");

            } catch (IOException e) {
                System.out.println("File " + filePath + " is not found or invalid");
            }
        }
    }

    private void printListOfString(List<String> listOfString){
        for(String str : listOfString){
            System.out.println(str);
        }
    }
}
