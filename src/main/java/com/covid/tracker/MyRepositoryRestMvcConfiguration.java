package com.covid.tracker;

import java.util.List;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.data.rest.webmvc.mapping.LinkCollector;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Links;

@Configuration
public class MyRepositoryRestMvcConfiguration extends RepositoryRestMvcConfiguration {
	public MyRepositoryRestMvcConfiguration(ApplicationContext context,
			ObjectFactory<ConversionService> conversionService) {
		super(context, conversionService);
	}

	@Bean
	protected LinkCollector linkCollector() {
		return new LinkCollector(persistentEntities(), selfLinkProvider(), associationLinks()) {
			public Links getLinksFor(Object object, List<Link> existingLinks) {
				return null;
			}
		};
	}
}