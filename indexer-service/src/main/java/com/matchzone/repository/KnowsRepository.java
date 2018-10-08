package com.matchzone.repository;

//import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.matchzone.relationship.Knows;

@Repository
public interface KnowsRepository extends Neo4jRepository<Knows,String> {
//	
//	@Query("")
//	public String save();

}
