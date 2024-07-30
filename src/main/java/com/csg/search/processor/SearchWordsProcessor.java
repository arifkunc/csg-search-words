package com.csg.search.processor;

import com.csg.search.object.SearchCriteria;

import java.io.IOException;
import java.util.List;

public interface SearchWordsProcessor {
    List<String> searchWords(String filePath, SearchCriteria searchCriteria) throws IOException;
}
