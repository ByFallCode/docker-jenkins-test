pipeline {
    agent any
    tools {
        maven 'maven385'
    }
    stages {
        stage('Get maven version') {
            steps {
                sh 'mvn --version'
            }
        }
        stage('Maven clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('Maven test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Maven package') {
            steps {
                sh 'mvn package'
            }
        }
    }
}
