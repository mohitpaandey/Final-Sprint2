package com.matchzone.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.matchzone.model.Location;

@Repository
public interface LocationRepository extends MongoRepository<Location, String>{

}
