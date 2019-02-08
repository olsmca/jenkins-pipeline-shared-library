
def call(String buildResult) {

    slackSend teamDomain: "${params.teamDomain}", channel: "${params.channel}", token: "${params.token}",
              color: "good", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was successful " buildResult

}