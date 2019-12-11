package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Domain;
import com.repository.DomainRepository;
@RestController
@RequestMapping("/test")
public class EsCurdTest {

	@Autowired
	private DomainRepository domainRepository;
	@Autowired
	private ElasticsearchTemplate esTemplate;
	
	@PostMapping("/creatIndex")
	public boolean creatIndex() {
		boolean flag = esTemplate.createIndex(Domain.class);
		return flag;
	}
	
	@PostMapping("/creatDoc")
	public Domain creatDoc(Domain domain) {
		Domain save = (Domain) domainRepository.save(domain);
		return save;
	}
	
	@PostMapping("/findDoc")
	public Iterable<Domain> findDoc() {
		Iterable<Domain> all = domainRepository.findAll();
		return all;
	}

	
	
	
	
}
