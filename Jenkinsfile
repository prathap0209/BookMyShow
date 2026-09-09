pipeline {

    agent any

 
   tools{
	maven 'MyMaven'
   }
    stages {

        stage('Checkout') {

            steps {

                checkout scm

            }

        }
        stage('Build') {

            steps {

                bat 'mvn clean compile'

            }

        }
        stage('Test') {

            steps {

                bat 'mvn test'

            }

        }

    }

}