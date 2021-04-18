package com.couchbase.example.CouchbaseExample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Details {
   @Id
    private int id;
   @Field
    private String name;
   @Field
   private String[] address;
}
