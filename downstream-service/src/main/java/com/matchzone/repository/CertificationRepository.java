package com.matchzone.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.matchzone.model.Certification;

@Repository
public interface CertificationRepository extends MongoRepository<Certification, String>{

}
