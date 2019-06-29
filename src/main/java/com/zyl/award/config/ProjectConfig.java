package com.zyl.award.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@ConfigurationProperties(prefix = "project.config")
@Configuration
public class ProjectConfig {
	/**
	 * 导入核心包依赖
	 */
	private List<String> anonymousApi;

	public List<String> getAnonymousApi() {
		return anonymousApi;
	}

	public void setAnonymousApi(List<String> anonymousApi) {
		this.anonymousApi = anonymousApi;
	}
}
