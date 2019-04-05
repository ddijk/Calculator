#!/usr/bin/env groovy

pipeline {
    agent any
    environment {
      //  nexusCredentialsId = 'jenkins-nexus'
        pom = readMavenPom file: 'pom.xml'
    }

    tools {
        maven 'maven_3.6.0'
        jdk 'OpenJDK10'
    }

    stages {
        stage('SCM') {
          steps {
               git 'https://github.com/ddijk/Calculator.git'
          }
        }

        stage('build & SonarQube Scan') {
          steps {
               withSonarQubeEnv('My SonarQube Server') {
                 sh 'mvn clean package sonar:sonar'
          }
          }
        }

        stage("Quality Gate") {
          steps {
             timeout(time: 1, unit: 'HOURS') { // Just in case something goes wrong, pipeline will be killed after a timeout
               script {
               def qg = waitForQualityGate() // Reuse taskId previously collected by withSonarQubeEnv
               if (qg.status != 'OK') {
                 error "Pipeline aborted due to quality gate failure: ${qg.status}"
               }
               }
             }
          }
        }
     }
}
