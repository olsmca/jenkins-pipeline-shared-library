
def call(String buildResult) {

    slackSend teamDomain: 'negocio-eps', channel: '#pipeline-as-code', token: 'kXvuJfAZwudfk6lHSxvduEaY',
              color: "good", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was successful"
  
}