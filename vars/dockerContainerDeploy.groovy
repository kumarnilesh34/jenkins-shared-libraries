def call(String containerName, String dockerHubUser, String imageName, String imageTag, String portMapping){
}
    sh "docker stop ${containerName} || true"
    sh "docker rm ${containerName} || true"
    sh "docker run -itd --name ${containerName} -p ${portMapping} $dockerHubUser/${imageName}:$imageTag"
}
