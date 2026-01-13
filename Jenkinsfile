pipeline {
    agent any 
        tools {
        // Ce nom doit correspondre au nom que vous avez donné à Maven dans la Configuration globale des outils
        maven 'maven3' 
    }
    stages {

        stage('Build') { 
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') { 
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') { 
            steps {
                sh 'mvn package'
            }
        }
    }
}
