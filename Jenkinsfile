pipeline {
    agent any

    tools {
        maven "M3"
    }

    stages {
        stage('Build'){
            steps {
            //sh "mvn clean compile"
            bat "mvn clean compile"
            }
        }

        stage('Test'){
                steps {
                    //sh "mvn test"
                    bat "mvn test"
                }
        }

        stage('Deploy'){
                 steps {
                     //sh "mvn heroku:deploy"
                     bat "mvn clean heroku:deploy"
                 }
        }
    }
}