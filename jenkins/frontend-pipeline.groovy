podTemplate(
    name: 'questcode', 
    namespace: 'devops',
    label: 'questcode',
    containers: [
        containerTemplate(alwaysPullImage: false, args: 'cat', command: '/bin/sh -c', envVars: [], image: 'docker', livenessProbe: containerLivenessProbe(execArgs:'', failureThreshold: 0, initialDelaySeconds: 0, periodSeconds: 0, sucessThreshold: 0, timeoutSeconds:0 ), name: 'docker-container', ports: [], privileged: false, resourceLimitCpu: '', resourceLimitMemory: '', resourceRequestCpu: '', resourceResquestMemory: '', shell: null, ttyEnabled: true, workingDir: '/home/jenkins')
    ], 
    volumes: [hostPathVolume(hostPath: '/var/run/docker.sock', mountPath: '/var/run/docker.sock')],
)
{
        // START PIPELINE
        node {
            stage('Checkout') {
                echo 'Iniciando Clone do Repositório'
                sh 'ls -ltra'
        }
            stage('Build') {
                echo 'Iniciando build'
                sh 'ls -ltra'
        }    
            stage('Deploy') {
                echo 'Iniciando deploy'
                sh 'ls -ltra'
        }
    } // END OF NODE        
        
}
