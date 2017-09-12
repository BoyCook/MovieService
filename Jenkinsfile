pipeline {
    agent any
  
    stages {
        stage('Initialize') {
            steps {
                mvnHome = tool 'M3'
            }
        }

        stage('Build') {
            steps {
                sh "'${mvnHome}/bin/mvn' clean package"
            }
        }

        stage('Code Quality') {
            steps {
                sh "'${mvnHome}/bin/mvn' cobertura:cobertura"
            }
        }
  
        stage('Report') {
            steps {
                junit '**/target/surefire-reports/TEST-*.xml'
                archive 'target/*.jar'

                publishHTML (target: [
                    allowMissing: false,
                    alwaysLinkToLastBuild: false,
                    keepAll: true,
                    reportDir: 'target/site/cobertura',
                    reportFiles: 'index.html,**',
                    reportName: "Coverage Report"
                ])
            }
        }
    }
}
