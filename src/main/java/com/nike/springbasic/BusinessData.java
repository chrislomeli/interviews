package com.nike.springbasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class BusinessData {

	@Autowired
    BusinessConfiguration businessConfiguration; // get the whitelisted elements from the business configuration

	// create a static map that we can perform key, value searches on
	static final Map<String, String> data = new HashMap<>();

	public Map<String, String> getData() {
		return data;
	}

	public Map<String, String> getWhitelisted() {
		/* todo filter out just the whitelisted elements and return them */
		Map<String,String> placeholder = new HashMap<>();

		return placeholder;
	}


}
