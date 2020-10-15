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

package io.spring.start.site.extension.amwell.condition;

import io.spring.initializr.generator.condition.ProjectGenerationCondition;
import io.spring.initializr.generator.project.ProjectDescription;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Amwell Postgres DB Condition.
 *
 * @author Raghu Karamel
 */
public class OnAmwellPostgresDbCondition extends ProjectGenerationCondition {

	@Override
	protected boolean matches(ProjectDescription description, ConditionContext context,
			AnnotatedTypeMetadata metadata) {
		return (description.getRequestedDependencies().containsKey("amwellpostgresdb")) ? true : false;
	}

}
