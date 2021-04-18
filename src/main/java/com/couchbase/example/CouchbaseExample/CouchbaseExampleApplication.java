package com.couchbase.example.CouchbaseExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.couchbase.example.CouchbaseExample")
@SpringBootApplication
public class CouchbaseExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouchbaseExampleApplication.class, args);
		Logger logger = LoggerFactory.getLogger(CouchbaseExampleApplication.class);
		logger.info("Application is UP");
	}

}
