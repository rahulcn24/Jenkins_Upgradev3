pipeline {
	agent any
	stages{
		stage('init'){
			steps{
				echo 'Hi, this is Anshul from LevelUp360'
                echo 'We are Starting the Testing'
			}
		}
		stage('build'){
			steps{
				echo 'Building Sample Maven Project'
			}
		}
		stage('Deploy') {
			  steps {
					echo "Deploying in Staging Area"
			  }
		}
	}
}