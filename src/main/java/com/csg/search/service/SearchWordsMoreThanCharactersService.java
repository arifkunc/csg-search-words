package com.csg.search.service;

import com.csg.search.object.SearchCriteria;
import org.springframework.stereotype.Service;


@Service("searchWordsMoreThanCharactersService")
public class SearchWordsMoreThanCharactersService implements SearchWordsService {

    @Override
    public void searchWords(SearchCriteria searchCriteria, String... filePaths) {
        System.out.println("searchWordsMoreThanCharactersService run");
    }
}
