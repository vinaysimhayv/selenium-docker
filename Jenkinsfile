node {
   def commit_id
   stage('Clone') {
   	 checkout scm
     sh 'sudo apt-get update'
     sh 'sudo apt-get install git-all'
     sh 'git status'
     sh "git rev-parse --short HEAD > .git/commit-id"                        
     commit_id = readFile('.git/commit-id').trim()
   }
   stage('install') {
     maven() {
       sh 'sudo mvn -f selenium-docker/pom.xml install'
     }
   }
 stage('test') {
     maven() {
      def myTestContainer = docker.image('suresh10/newrepvinv')
      myTestContainer.pull()
       myTestContainer.inside {
       sh 'sudo mvn -f selenium-docker/pom.xml test'
     }
  
     }
   }
   stage('publish') {
     docker.withRegistry('https://index.docker.io/v1/', 'dockerhub') {
       def app = docker.build("suresh10/sample:999", '.').push()
     }
   }
}