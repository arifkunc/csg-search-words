package com.csg.search.service;

import com.csg.search.object.SearchCriteria;

public interface SearchWordsService {
    void searchWords(SearchCriteria searchCriteria, String... filePaths);
}
