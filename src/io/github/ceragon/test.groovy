package io.github.ceragon

pipeline {
    agent none
    stages {
        stage ('first') {
            steps {
                sayHello '你好'
                script {
                    echo "project name is: ${globalParam.projectName}"
                }
            }
        }
    }
}
