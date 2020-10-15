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

package io.spring.start.site.extension.amwell.sample.docker;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import io.spring.initializr.generator.project.contributor.ProjectContributor;
import org.apache.commons.io.FileUtils;

/**
 * Amwell Docker Contributor.
 *
 * @author Raghu Karamel
 */
public class DockerContributor implements ProjectContributor {

	@Override
	public void contribute(Path projectRoot) throws IOException {
		String sourceBaseDir = "/Users/amwell/Documents/playground/soa_starter_service";

		// Dockerfile
		String dockerFileName = "/Dockerfile";
		File dSource = new File(sourceBaseDir + dockerFileName);
		File dDestination = new File(projectRoot.toString() + dockerFileName);
		FileUtils.copyFile(dSource, dDestination);

		// Docker-compose.yml
		String dockerComposeFileName = "/docker-compose.yml";
		File dcSource = new File(sourceBaseDir + dockerComposeFileName);
		File dcDestination = new File(projectRoot.toString() + dockerComposeFileName);
		FileUtils.copyFile(dcSource, dcDestination);

		// documentation
		String documentationDir = "/documentation";
		File docSource = new File(sourceBaseDir + documentationDir);
		File docDestination = new File(projectRoot.toString() + documentationDir);
		FileUtils.copyDirectory(docSource, docDestination);

		// formatter.xml
		String formatterFileName = "/formatter.xml";
		File fSource = new File(sourceBaseDir + formatterFileName);
		File fDestination = new File(projectRoot.toString() + formatterFileName);
		FileUtils.copyFile(fSource, fDestination);

		// formatter.xml
		String lombakFileName = "/lombok.config";
		File lSource = new File(sourceBaseDir + lombakFileName);
		File lDestination = new File(projectRoot.toString() + lombakFileName);
		FileUtils.copyFile(lSource, lDestination);
	}

}
