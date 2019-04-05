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

        stage('build it') {
          steps {
             sh 'mvn clean package'
          }
        }
     }
}
