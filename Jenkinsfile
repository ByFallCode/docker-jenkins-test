pipeline {
    agent any
    tools {
        maven 'maven385'
    }
    stages {
        stage('Get maven version') {
            steps {
                echo 'affichage version mvn'
                sh 'mvn --version'
            }
        }
        stage('Maven clean') {
            steps {
                echo 'mvn clean'
                sh 'mvn clean'
            }
        }
        stage('Maven test') {
            steps {
                echo 'mvn test'
                sh 'mvn test'
            }
        }
        stage('Maven package') {
            steps {
                echo 'mv package '
                sh 'mvn package -DskipTests'
            }
        }
    }
}
