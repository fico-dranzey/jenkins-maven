pipeline {
    agent any
    stages {
        stage('cleaning') {
            steps {
                sh "mvn clean"
            }
        }
        stage('testing') {
            steps {
                sh "mvn test"
            }
        }
        stage('packaging') {
            steps {
                sh "mvn package"
            }
        }
    }
}
