pipeline {
    agent any
  
    tools {
        maven "M3"
    }
    
    stages {

        stage('Build') {
            steps {
                sh "mvn clean package"
            }
        }

        stage('Code Quality') {
            steps {
                sh "mvn cobertura:cobertura"
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
