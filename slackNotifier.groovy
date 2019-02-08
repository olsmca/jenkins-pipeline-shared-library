final TEAMDOMAIN = "negocio-eps"
final CHANNEL = "#pipeline-as-code"
final TOKEN = "kXvuJfAZwudfk6lHSxvduEaY"

def call(String buildResult) {

  if ( buildResult == "SUCCESS" ) {
    slackSend teamDomain: println TEAMDOMAIN, channel: CHANNEL, token: TOKEN,
              color: "good", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was successful"
  }
  else if( buildResult == "FAILURE" ) { 
    slackSend color: "danger", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was failed"
  }
  else if( buildResult == "UNSTABLE" ) { 
    slackSend color: "warning", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was unstable"
  }
  else {
    slackSend color: "danger", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} its resulat was unclear"	
  }
}