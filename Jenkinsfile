// Jenkinsfile (Declarative Pipeline)
pipeline {
    // Specifies that this pipeline can run on any available agent
    agent any

    // Defines tools required (configured in Manage Jenkins > Global Tool Configuration)
    tools {
        // Replace 'JDK-17' and 'Maven-3.9.1' with your configured names
        jdk 'JDK-21.0.10'
        maven 'Maven-3.9.12'
    }

    stages {
        stage('Checkout Code') {
            steps {
                // Checkout the source code from your Git repository
                git url: 'https://github.com/Saiferkhan/Ducat-Training-Project,
                    branch: 'main' // Specify your branch name
            }
        }

        stage('Build and Test') {
            steps {
                // Execute Maven goals to clean the project and run tests
                // 'clean test' command runs the tests using the surefire plugin
                bat 'mvn clean test'
            }
        }
    }

    post {
        // Actions to run after the pipeline finishes, regardless of the outcome
        always {
            // Publish TestNG/JUnit test results for visualization in Jenkins UI
            // Ensure you have the JUnit or TestNG Results Plugin installed
            publishTestReport() // Placeholder, the exact step name depends on the plugin and configuration
            // You can also archive artifacts like screenshots or HTML reports
            archiveArtifacts artifacts: 'target/surefire-reports/*.xml, target/surefire-reports/*.html', onlyIfSuccessful: false
        }
        failure {
            // Actions to take if the build fails, e.g., send a Slack/email notification
            echo 'Tests failed! Check console output for details.'
        }
    }
}