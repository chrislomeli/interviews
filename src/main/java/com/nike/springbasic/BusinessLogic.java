package com.nike.springbasic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class BusinessLogic {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private BusinessData dataStore;

	public void parseMapString(String commaSeparated){

		/* todo parse the input to a map -using split commands or other method Arays.stream() and store it to the Database */

		/* todo Store the elements to the Database */

		/* todo print the database */
		logger.info(dataStore.toString());
	}

	public void printWhitelisted() {

		/* todo get the white listed database elements */
		Map<String, String> m = dataStore.getWhitelisted();

		/* todo print the whitelisted elements in the Database - just use toString() */
		logger.info(m.toString());
	}
}
