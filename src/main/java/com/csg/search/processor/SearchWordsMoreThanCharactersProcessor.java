package com.csg.search.processor;

import com.csg.search.object.SearchCriteria;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service("searchWordsMoreThanCharactersProcessor")
public class SearchWordsMoreThanCharactersProcessor implements SearchWordsProcessor {
    @Override
    public List<String> searchWords(String filePath, SearchCriteria searchCriteria) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String> searchResult = new ArrayList<>();
        String line;
        while((line = bufferedReader.readLine()) != null){
            String[] words = line.replaceAll("\\s+"," ")
                    .trim()
                    .split(" ");

            List<String> wordList = Arrays.asList(words);

            wordList = wordList.stream()
                    .filter(word -> word.length() >= searchCriteria.getMinWordLength())
                    .collect(Collectors.toList());

            searchResult.addAll(wordList);
        }

        bufferedReader.close();
        fileReader.close();

        return searchResult;
    }
}
