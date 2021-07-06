pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withGradle {
                    bat './gradlew clean build'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withGradle {
                    bat 'gradle test'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withGradle {
                    bat 'gradle deploy'
                }
            }
        }
    }
}
