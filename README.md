# Demo of SonarQubeCoverage

Run all tests via:
mvn verify

Push to sonar via:
mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install -Dmaven.test.failure.ignore=true sonar:sonar

# local git push target:
/Users/dickdijk/LOCAL_GIT_SERVERS/calculator

# Jenkins, admin account: dick/admin
http://localhost:9990/


