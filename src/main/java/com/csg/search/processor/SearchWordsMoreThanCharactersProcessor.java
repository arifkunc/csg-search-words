package com.csg.search.processor;

import com.csg.search.object.SearchCriteria;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service("searchWordsMoreThanCharactersProcessor")
public class SearchWordsMoreThanCharactersProcessor implements SearchWordsProcessor {
    @Override
    public List<String> getWordsStartWithUpperCase(InputStream inputStream, SearchCriteria searchCriteria) {
        return null;
    }
}
