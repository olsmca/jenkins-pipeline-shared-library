
def call(String buildResult) {

  println buildResult

  slackSend teamDomain: 'negocio-eps', channel: "${params.channel}", token: "${params.token}",
              color: "good", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was successful"
  
}