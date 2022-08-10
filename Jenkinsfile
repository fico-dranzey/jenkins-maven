pipeline {
    agent any
    tools {
        maven '3.8.1'
    }
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
                input("do you want to package?")
                sh "mvn package"
            }
        }
    }
}
