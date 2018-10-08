package com.matchzone.repository;

//import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.matchzone.relationship.CertifiedIn;


@Repository
public interface CertifiedInRepository extends Neo4jRepository<CertifiedIn,Long>{
//	@Query(",fsajssbdgj")
//	public String save();

}
