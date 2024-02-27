package com.HSproject.Movies_Api;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepo extends MongoRepository<Movie,ObjectId>{
    
    
}
