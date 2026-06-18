/*
 * SonarQube MCP Server
 * Copyright (C) SonarSource
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the Sonar Source-Available License Version 1, as published by SonarSource Sàrl.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the Sonar Source-Available License for more details.
 *
 * You should have received a copy of the Sonar Source-Available License
 * along with this program; if not, see https://sonarsource.com/license/ssal/
 */
package org.sonarsource.sonarqube.mcp.transport;

import java.nio.file.Path;

/**
 * Groups HTTPS/SSL configuration parameters for the HTTP server transport.
 */
public record HttpsConfiguration(
  boolean enabled,
  Path keystorePath,
  String keystorePassword,
  String keystoreType,
  Path truststorePath,
  String truststorePassword,
  String truststoreType
) {
}
