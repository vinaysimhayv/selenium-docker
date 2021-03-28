node {
   def commit_id
   stage('Clone') {
     checkout scm
     sh "git rev-parse --short HEAD > .git/commit-id"                        
     commit_id = readFile('.git/commit-id').trim()
   }
   stage('install') {
     mvnOnJenkins() {
       sh 'mvn install'
       sh 'npm test'
     }
   }
 stage('test') {
     mvnOnJenkins() {
       sh 'mvn test'
     }
   }
   stage('publish') {
     docker.withRegistry('https://index.docker.io/v1/', 'dockerhub') {
       def app = docker.build("suresh10/docker-nodejs-demo:${commit_id}", '.').push()
     }
   }
}
