package com.matchzone.repository;

//import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.matchzone.relationship.WorkedOn;

@Repository
public interface WorkedOnRepository extends Neo4jRepository<WorkedOn,Long>{
//	@Query("jkdsjkbds,")
//	public String save();

}
