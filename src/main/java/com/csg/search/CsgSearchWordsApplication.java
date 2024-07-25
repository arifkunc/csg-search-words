package com.csg.search;

import com.csg.search.object.SearchCriteria;
import com.csg.search.service.SearchWordsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class CsgSearchWordsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(CsgSearchWordsApplication.class, args);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please select option");
		System.out.println("1 : Output the number of words that start with upper case letter in each file");
		System.out.println("2 : List all the words that are longer than 5 characters long in each file");
		System.out.print("Your option : ");
		int option = scanner.nextInt();

		switch (option){
			case 1 :
			{
				SearchWordsService searchWordsService = appContext.getBean("searchWordsStartWithUpperCaseService", SearchWordsService.class);

				SearchCriteria searchCriteria = SearchCriteria.builder()
						.startWithUpperCase(Boolean.TRUE)
						.build();

				searchWordsService.searchWords(searchCriteria);
			}
			break;
			case 2 :
			{
				SearchWordsService searchWordsService = appContext.getBean("searchWordsMoreThanCharactersService", SearchWordsService.class);

				SearchCriteria searchCriteria = SearchCriteria.builder()
						.minWordLength(6)
						.build();

				searchWordsService.searchWords(searchCriteria, args);
			}
			break;
			default:
				System.out.println("Sorry, it is invalid option");
				break;
		}

		appContext.close();
	}

}
