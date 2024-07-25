package com.csg.search.processor;

import com.csg.search.object.SearchCriteria;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

@Service("searchWordsStartWithUpperCaseProcessor")
public class SearchWordsStartWithUpperCaseProcessor implements SearchWordsProcessor{
    @Override
    public List<String> getWordsStartWithUpperCase(String filePath, SearchCriteria searchCriteria) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filePath);

        return null;
    }
}
