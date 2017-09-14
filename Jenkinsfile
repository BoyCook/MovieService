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
                sh 'mvn org.jacoco:jacoco-maven-plugin:prepare-agent'
                sh "mvn cobertura:cobertura"
                withSonarQubeEnv('SonarQube Server') {
                  sh 'mvn sonar:sonar'
                }
                jacoco(execPattern: 'target/jacoco.exec')
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
                    reportName: "Cobertura Coverage Report"
                ])
                publishHTML (target: [
                    allowMissing: false,
                    alwaysLinkToLastBuild: false,
                    keepAll: true,
                    reportDir: 'target/site/jacoco',
                    reportFiles: 'index.html,**',
                    reportName: "JaCoCo Coverage Report"
                ])
                step( [ $class: 'JacocoPublisher' ] )
            }
        }
    }
}
