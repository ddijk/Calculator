# push scan to server
mvn clean verify sonar:sonar -Dsonar.token=$SQ_TOKEN_CALC -Dsonar.url=http://localhost:9000 -Dsonar.projectKey=sonar.dijkrosoft.nl:calculator 
mvn sonar:sonar -Dsonar.token=$SQ_TOKEN_CALC -Dsonar.url=http://localhost:9000 -Dsonar.projectKey=sonar.dijkrosoft.nl:calculator 

