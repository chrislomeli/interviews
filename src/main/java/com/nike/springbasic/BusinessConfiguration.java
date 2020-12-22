package com.nike.springbasic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BusinessConfiguration {

    /* todo get this from the properties file */
    public String whiteList;

}
