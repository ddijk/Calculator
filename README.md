# push scan to server

# SoJava
mvn clean verify sonar:sonar -Dsonar.token=$SQ_TOKEN_OCT_26 -Dsonar.host.url=http://localhost:9000 -Dsonar.projectKey=sonar.dijkrosoft.nl:calculator -Dsonar.projectName=Calculator
mvn sonar:sonar -Dsonar.token=$SQ_TOKEN_OCT_26 -Dsonar.host.url=http://localhost:9000 -Dsonar.projectKey=sonar.dijkrosoft.nl:calculator -Dsonar.projectName=Calculator

# Calculator, Sonar Cloud
#mvn clean verify sonar:sonar -Dsonar.token=$SQ_TOKEN_CLOUD -Dsonar.projectKey=sonar.dijkrosoft.nl:calculator -Dsonar.projectName=Calculator
#mvn sonar:sonar -Dsonar.token=$SQ_TOKEN_CLOUD -Dsonar.projectKey=sonar.dijkrosoft.nl:calculator -Dsonar.projectName=Calculator -Dsonar.organization=ddijk
mvn clean verify sonar:sonar -Dsonar.token=$SQ_TOKEN_CLOUD -Dsonar.projectKey=ddijk_Calculator -Dsonar.organization=ddijk
mvn sonar:sonar -Dsonar.token=$SQ_TOKEN_CLOUD -Dsonar.projectKey=ddijk_Calculator -Dsonar.organization=ddijk

# copied from SQ UI, after creating a project there:
mvn clean verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar \
  -Dsonar.projectKey=sonar.dijkrosoft.nl:calculator \
  -Dsonar.projectName='Calculator' \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.token=$SQ_TOKEN_OCT_26


