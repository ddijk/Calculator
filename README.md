# SonarQubeCoverage

Run all test via:
mvn verify

Push to sonar via:
mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install -Dmaven.test.failure.ignore=true sonar:sonar


