pipeline {
    agent any
    
    stages {
      stage('Git Checkout') {
            steps {
                script {
                    git url: 'https://github.com/Darren-Antony/testRepos'
                      echo 'git checkout is done code pulled from github to jenkins workspace'
                }
            }
        }
        stage('Mvn Build') {
            steps {
                script {
                    sh 'mvn clean install'
                      echo 'maven build is done'
                }
            }
        }
        stage('docker image'){
            steps{
             
                sh 'docker build -t 9894851315/testRepo1:${BUILD_NUMBER} -f Dockerfile .'
                echo 'docker image is created'
            }
        }
        stage('docker deploy'){
            steps{
                sh 'docker container rm -f testRepo1'
                sh 'docker run --name testRepo1 -itd -p 9393:9393  9894851315/testRepo1:${BUILD_NUMBER}'
                echo 'docker container is created'
                echo 'docker container is running'
            }
        }
        
    }
 }



