/*
 * semanticcms-autogit-all - Convenience POM to include most SemanticCMS AutoGit features, not including documentation or examples.
 * Copyright (C) 2021  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of semanticcms-autogit-all.
 *
 * semanticcms-autogit-all is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * semanticcms-autogit-all is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with semanticcms-autogit-all.  If not, see <http://www.gnu.org/licenses/>.
 */
module com.semanticcms.autogit.all {
	// Direct
	requires transitive com.semanticcms.autogit.model; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-model</artifactId>
	requires transitive com.semanticcms.autogit.servlet; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-servlet</artifactId>
	requires transitive com.semanticcms.autogit.taglib; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-taglib</artifactId>
}
