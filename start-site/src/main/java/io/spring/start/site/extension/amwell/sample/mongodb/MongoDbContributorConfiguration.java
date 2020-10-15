/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.spring.start.site.extension.amwell.sample.mongodb;

import io.spring.initializr.generator.project.ProjectGenerationConfiguration;
import io.spring.start.site.extension.amwell.condition.ConditionalOnAmwellMongoDb;

import org.springframework.context.annotation.Bean;

/**
 * Amwell Mongo DB Sample Code Contributor Configuration.
 *
 * @author Raghu Karamel
 */
@ProjectGenerationConfiguration
@ConditionalOnAmwellMongoDb("sample")
class MongoDbContributorConfiguration {

	@Bean
	MongoDbContributor mongoDbContributor() {
		return new MongoDbContributor();
	}

}
