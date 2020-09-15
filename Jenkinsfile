pipeline {
    agent any
    environment {
        NAME = "TimeSheet"
        kubeConfigPath = "C:\\Users\\Admin\\.kube"
        registry = "skolich/timesheet"
        registryCredential = 'docker-login'
        dockerImage = ''
        kubectlPath = 'C:\\Program Files\\Kubectl'
    }

    tools {
        maven 'maven'
        jdk 'jdk'
        nodejs 'nodejs'
    }

    stages {
        stage ('Build Spring Boot App'){
            steps {
                bat 'mvn install'
            }
        }
        stage ('Build React App'){
            steps{
                bat 'yarn install'
        }
        }
        stage ('Docker Build'){
            steps {
                script {
                 sh "docker build -t ${registry}:$BUILD_NUMBER"
                    
                }
            }
        }
        stage ('DockerHub Deploy'){
            steps {
                echo 'deploy docker'
            }
        }
        stage ('Kubernetes Deploy'){
            steps {
                echo 'deploy kubernetes'
            }
        }
        stage ('Remove Unused Images'){
            steps{
                echo 'remove images'
            }
        }


    }
}

