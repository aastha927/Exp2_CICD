pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from your version control system (e.g., Git)
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                // Build your project. Replace 'npm install' with your build commands.
                sh 'npm install' // Replace with your build command
            }
        }
        
        stage('Test') {
            steps {
                // Run tests for your project. Replace 'npm test' with your test commands.
                sh 'npm test' // Replace with your test command
            }
        }
        
        stage('Deploy') {
            when {
                // You can specify conditions for when to deploy, e.g., only on the 'main' branch
                expression { currentBuild.branch == 'main' }
            }
            steps {
                // Deploy your project to the designated environment. Replace 'deploy.sh' with your deployment script.
                sh './deploy.sh' // Replace with your deployment script or commands
            }
        }
    }
    
    post {
        success {
            // Notify on successful deployment
            echo 'Deployment successful!'
        }
        failure {
            // Notify on deployment failure
            echo 'Deployment failed!'
        }
    }
}
