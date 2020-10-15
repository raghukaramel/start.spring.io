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

package io.spring.start.site.extension.amwell.sample.bamboo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import io.spring.initializr.generator.project.ProjectDescription;
import io.spring.initializr.generator.project.contributor.ProjectContributor;
import org.apache.commons.io.FileUtils;

/**
 * Amwell Bamboo Contributor.
 *
 * @author Raghu Karamel
 */
public class BambooContributor implements ProjectContributor {

	private final ProjectDescription description;

	public BambooContributor(ProjectDescription description) {
		this.description = description;
	}

	@Override
	public void contribute(Path projectRoot) throws IOException {
		// String packageName = this.description.getPackageName().replaceAll("\\.", "/");
		// String bambooFileName = packageName+"/bamboo.txt";
		// SourceStructure structure = this.description.getBuildSystem().getMainSource(
		// projectRoot, this.description.getLanguage());
		// Path sourceDir = structure.getSourcesDirectory();
		// Path bambooPath = sourceDir.resolve(bambooFileName);
		// Files.createDirectories(bambooPath.getParent().getParent());
		// Path file = Files.createFile(bambooPath);
		// try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(file))) {
		// writer.println("Bamboo Code / Configuration Generator");
		// }

		File source = new File("/Users/amwell/Documents/playground/soa_starter_service/bamboo-specs");
		File destination = new File(projectRoot.toString() + "/bamboo-specs");
		FileUtils.copyDirectory(source, destination);
	}

}
