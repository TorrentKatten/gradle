/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.quality.integtest.fixtures

import org.gradle.api.plugins.quality.CheckstylePlugin
import org.gradle.util.VersionNumber

class CheckstyleCoverage {
    final static List<VersionNumber> ALL_VERSIONS = ALL.collect { VersionNumber.parse(it) }
    // JDK6 support was dropped in 6.2
    final static List<String> JDK6_SUPPORTED = ALL_VERSIONS.findAll { it.major < 6 || (it.major == 6 && it.minor < 2) }
    final static List<String> ALL = ['6.9', '6.8', '6.5', '6.0', '5.5', CheckstylePlugin.DEFAULT_CHECKSTYLE_VERSION]
}