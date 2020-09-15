pipeline {
    agent any
    environment {
        NAME = "TimeSheet"
        kubeConfigPath = "C:\\Users\\Admin\\.kube"
        registry = "skolich/spring"
        name = "skolich/react"
        registryCredential = 'docker-login'
        dockerImage = ''
        kubectlPath = 'C:\\Program Files\\Kubectl'
        mysql = "timesheet"
        react = "react"
        spring = "spring"
        MYSQL_ROOT_PASSWORD="MYSQL_PASSWORD"
        network = "timesheet"
        MYSQL_USER = "admin"
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
                bat 'yarn build'
            }
        }
        stage ('Create Mysql Image'){
            steps{
                bat "docker pull mysql"
                bat "docker run --name ${mysql} -e MYSQL_ROOT_PASSWORD=${MYSQL_ROOT_PASSWORD} -d mysql:latest"
            }
        }
        stage ('Docker Build Spring App'){
            steps {
                bat "docker build -t ${registry} ."
                bat "docker tag ${registry}:latest ${registry}:$BUILD_NUMBER"
                bat "docker run --publish 8090:8090 --detach --name ${spring} ${registry}:$BUILD_NUMBER"    
                
            }
        }
        stage ('Docker Build React App'){
            steps {
                bat "docker build -t ${name} ."
                bat "docker tag ${name}:latest ${registry}:$BUILD_NUMBER"
                bat "docker run --publish 8095:8095 --detach --name ${react} ${name}:$BUILD_NUMBER"    
                
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

