node {
    stage('Preparation') {
        bat 'echo Hello Pipeline!'
        git '/d/Documents/scripts'
    }
}
