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
        mysqlUser="mysqlPassword"
        network = "timesheet"
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
                bat "docker run --name ${mysql} -e MYSQL_ROOT_PASSWORD=${mysqlUser} -d mysql:latest"
                bat "docker run -it --network ${network} --rm mysql mysql -h ${mysql} -u ${mysqlUser} -p"
            }
        }
        stage ('Docker Build Spring App'){
            steps {
                bat "docker build -t ${registry} ."
                bat "docker tag ${registry}:latest ${registry}:$BUILD_NUMBER"
                bat "docker run --publish 8090:8090 --detach --name runnable ${registry}:$BUILD_NUMBER"    
                
            }
        }
        stage ('Docker Build React App'){
            steps {
                bat "docker build -t ${name} ."
                bat "docker tag ${name}:latest ${registry}:$BUILD_NUMBER"
                bat "docker run --publish 8095:8095 --detach --name runnable ${name}:$BUILD_NUMBER"    
                
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

