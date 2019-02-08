
def call(String buildResult) {

  if ( buildResult == "SUCCESS" ) {
    slackSend teamDomain: "${params.teamDomain}", channel: "${params.channel}", token: "${params.token}",
              color: "good", message: "${currentBuild.fullDisplayName} completado con exito"
  }
  else if( buildResult == "FAILURE" ) { 
    slackSend teamDomain: "${params.teamDomain}", channel: "${params.channel}", token: "${params.token}",
              color: "danger", message: "${currentBuild.fullDisplayName} esta Fallando"
  }
  else if( buildResult == "UNSTABLE" ) { 
    slackSend teamDomain: "${params.teamDomain}", channel: "${params.channel}", token: "${params.token}",
              color: "warning", message: "${currentBuild.fullDisplayName} esta inestable"
  }
  else {
    slackSend teamDomain: "${params.teamDomain}", channel: "${params.channel}", token: "${params.token}",
              color: "danger", message: "${currentBuild.fullDisplayName} el resultado es inesperado"	
  }
}