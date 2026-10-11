# Do local build & scan and push to SonarQube 
mvn clean verify sonar:sonar -Dsonar.token=$SQ_TOKEN_OCT_26 -Dsonar.host.url=http://localhost:9000 -Dsonar.projectKey=sonar.dijkrosoft.nl:calculator -Dsonar.projectName=Calculator
mvn sonar:sonar -Dsonar.token=$SQ_TOKEN_OCT_26 -Dsonar.host.url=http://localhost:9000 -Dsonar.projectKey=sonar.dijkrosoft.nl:calculator -Dsonar.projectName=Calculator

# Calculator, Sonar Cloud
mvn clean verify sonar:sonar -Dsonar.token=$SQ_TOKEN_CLOUD -Dsonar.projectKey=ddijk_Calculator -Dsonar.organization=ddijk
mvn sonar:sonar -Dsonar.token=$SQ_TOKEN_CLOUD -Dsonar.projectKey=ddijk_Calculator -Dsonar.organization=ddijk

# Calcualtor, Sonar Community Edition
mvn clean verify sonar:sonar -Dsonar.token=$SQ_TOKEN_CLOUD -Dsonar.projectKey=sonar.dijkrosoft.nl:calculator -Dsonar.projectName=Calculator
mvn sonar:sonar -Dsonar.token=$SQ_TOKEN_CLOUD -Dsonar.projectKey=sonar.dijkrosoft.nl:calculator -Dsonar.projectName=Calculator -Dsonar.organization=ddijk


