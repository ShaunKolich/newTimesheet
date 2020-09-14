pipeline {
    agent any
    enviornment {
        NAME = "TimeSheet"
        kubeConfigPath = "C:\Users\Admin\.kube"
        registry = "skolich/timesheet"
        registryCredential = 'docker-login'
        dockerImage = ''
        kubectlPath = '/usr/local/bin/kubectl'
    }

    tools {
        maven 'maven'
        jdk 'jdk8'

    }

    stages {
        stage ('Build App'){
            steps {
                bat 'mvn install'
                bat 'yarn start'

            }
        }
        stage ('Docker Build'){
            steps {
                echo 'build docker'
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