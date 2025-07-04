def call(String imageName, String imageTag, String dockerHubUser){
    withCredentials([usernamePassword(credentialsId: 'dockerHubCred', usernameVariable: 'dockerHubUser', passwordVariable: 'dockerHubPass')]){
        sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
    }
    sh "docker push ${dockerHubUser}/${imageName}:${imageTag}"
}
