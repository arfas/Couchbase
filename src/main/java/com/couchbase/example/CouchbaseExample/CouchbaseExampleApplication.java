package com.couchbase.example.CouchbaseExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.couchbase.example.CouchbaseExample")
@SpringBootApplication
public class CouchbaseExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouchbaseExampleApplication.class, args);
	}

}
