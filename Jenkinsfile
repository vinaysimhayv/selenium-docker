node {
   def commit_id
   stage('Clone') {
     sh sudo 'apt install git-all'
     Sh 'git clone https://github.com/vinaysimhayv/selenium-docker.git'
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