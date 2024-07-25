package com.csg.search.service;

import com.csg.search.object.SearchCriteria;
import org.springframework.stereotype.Service;

@Service("searchWordsStartWithUpperCaseService")
public class SearchWordsStartWithUpperCaseService implements SearchWordsService {

    @Override
    public void searchWords(SearchCriteria searchCriteria, String... filePaths) {
        System.out.println("searchWordsStartWithUpperCaseService run");
    }
}
