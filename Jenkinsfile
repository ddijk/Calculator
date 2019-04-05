#!/usr/bin/env groovy

pipeline {
    agent any
    environment {
      //  nexusCredentialsId = 'jenkins-nexus'
        pom = readMavenPom file: 'pom.xml'
    }

    tools {
        maven 'maven_3.5.4'
        jdk 'OpenJDK10'
    }

   stage('SCM') {
       git 'https://github.com/ddijk/Calculator.git'
     }
     stage('build & SonarQube Scan') {
       withSonarQubeEnv('My SonarQube Server') {
         sh 'mvn clean package sonar:sonar'
       } // SonarQube taskId is automatically attached to the pipeline context
     }
   }

   // No need to occupy a node
   stage("Quality Gate") {
     timeout(time: 1, unit: 'HOURS') { // Just in case something goes wrong, pipeline will be killed after a timeout
       def qg = waitForQualityGate() // Reuse taskId previously collected by withSonarQubeEnv
       if (qg.status != 'OK') {
         error "Pipeline aborted due to quality gate failure: ${qg.status}"
       }
     }
}
