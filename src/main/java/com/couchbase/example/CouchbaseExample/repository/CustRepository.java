package com.couchbase.example.CouchbaseExample.repository;

import com.couchbase.example.CouchbaseExample.model.Details;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "details",viewName = "all")
public interface CustRepository extends CouchbaseRepository<Details,Integer> {


}
