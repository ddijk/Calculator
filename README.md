# Demo of SonarQubeCoverage

Run all tests via:
mvn verify

Push to SonarQube via:
from Working Dir: mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent verify sonar:sonar
or
build job in Jenkins

# local git push target:
/Users/dickdijk/LOCAL_GIT_SERVERS/calculator

# Jenkins, admin account: dick/admin
http://localhost:9990/

# SonarQube : 
http://localhost:9000/
