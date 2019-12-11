package com.repository;


import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.domain.Domain;
public interface DomainRepository extends ElasticsearchRepository<Domain, String>{


	
	
	
}
