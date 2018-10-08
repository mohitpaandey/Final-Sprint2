package com.matchzone.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.matchzone.model.Skills;

@Repository
public interface SkillsRepository extends MongoRepository<Skills, String>{

}
