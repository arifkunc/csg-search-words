package com.csg.search.processor;

import com.csg.search.object.SearchCriteria;

import java.io.InputStream;
import java.util.List;

public interface SearchWordsProcessor {
    List<String> getWordsStartWithUpperCase(InputStream inputStream, SearchCriteria searchCriteria);
}
