pipeline {
	agent {
		docker {
			image 'maven:3-alpine'
			args '-v /root/.m2:/root/.m2'
		}
	}
	stages {
		stage('Test') {
			steps {
				sh 'mvn test'
			}
		}
<<<<<<< HEAD
		stage('Build'){
			steps{
				sh 'mvn install dockerfile:build'
=======
		stage('Build') {
			steps {
			 	sh 'mvn install dockerfile:build -Dpushimage'
>>>>>>> 3fa15acf7709c6ef66d71651394eae2ad6c785d3
			}
		}
				
	}
}
