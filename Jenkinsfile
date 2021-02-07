pipeline {
    agent any

    tools {
        jdk 'jdk-12.0.2'
    }

    stages {
        stage('Build & test my code! 🚀') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true clean test-compile test'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
