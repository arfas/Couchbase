package com.couchbase.example.CouchbaseExample;

import com.couchbase.example.CouchbaseExample.model.Details;
import com.couchbase.example.CouchbaseExample.repository.CustRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//@EntityScan("com.couchbase.example.CouchbaseExample")
@SpringBootApplication
@RestController
@RequestMapping("/enter")
public class CouchbaseExampleApplication {
@Autowired
private CustRepository repository;


	@GetMapping("/fetchAllCustomers")
	public void print(){
	System.out.println("ENtered");
//	public Iterable<Details> getAll() {
//		return repository.findAll();
	}

	@PostConstruct
	private void initCustRepo(){
		repository.saveAll(Stream
				.of(new Details(111, "John", new String[] { "Bangalore", "Marathali" }),
						new Details(222, "Pitter", new String[] { "Hyderabad", "SR Nagar" }))
				.collect(Collectors.toList()));
	}


	public static void main(String[] args) {
		SpringApplication.run(CouchbaseExampleApplication.class, args);
		Logger logger = LoggerFactory.getLogger(CouchbaseExampleApplication.class);
		logger.info("Application is UP");
	}

}
