package io.github.ceragon
@Library('utils') _

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
