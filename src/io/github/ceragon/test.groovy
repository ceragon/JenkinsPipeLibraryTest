package io.github.ceragon

pipeline {
    agent none
    stages {
        stage ('first') {
            steps {
                script {
                    echo "project name is: ${globalParam.projectName}"
                }
            }
        }
    }
}
