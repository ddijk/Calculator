# Demo of SonarQubeCoverage

Run all tests via:
mvn verify

Push to sonar via:
from Working Dir: 
mvn clean -Dsonar.token=sqa_5929128053fa35ae55a6f67d9d1fe67f3a56bd2f org.jacoco:jacoco-maven-plugin:prepare-agent verify sonar:sonar
or
build job in Jenkins

# local git push target:
/Users/dickdijk/LOCAL_GIT_SERVERS/calculator

# Jenkins, admin account: dick/admin
http://localhost:9990/

# Sonar : 
http://localhost:9000/
