package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
//基础包的注释驱动配置，配置自动扫描的repositories根目录
@EnableElasticsearchRepositories(basePackages = "com.repository")
public interface Config {
}
