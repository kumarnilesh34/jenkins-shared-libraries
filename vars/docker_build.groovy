def call(String projectName, String imageTag, String D=dockerHubUser) {
    sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
}
