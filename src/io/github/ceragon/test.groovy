package io.github.ceragon

pipeline {
    agent none
    stages {
        stage ('first') {
            steps {
                scripts {
                    echo "project name is: ${globalParam.projectName}"
                }
            }
        }
    }
}
