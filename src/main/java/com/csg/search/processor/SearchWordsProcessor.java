package com.csg.search.processor;

import com.csg.search.object.SearchCriteria;

import java.io.FileNotFoundException;
import java.util.List;

public interface SearchWordsProcessor {
    List<String> getWordsStartWithUpperCase(String filePath, SearchCriteria searchCriteria) throws FileNotFoundException;
}
