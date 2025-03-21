def call(String dockerHubUser, String ProjectName, String ImageName){

  withCredentials([usernamePassword(credentialsId: "dockerHubCred", usernameVariable: "dockerHubUser", passwordVariable: "dockerHubPass" )]){

    sh "docker login -u ${dockerHubUSer} -p ${dockerHubPass}"
  }
    sh "docker push ${dockerHubUser}/${ProjectName}:${ImageName}"
}
