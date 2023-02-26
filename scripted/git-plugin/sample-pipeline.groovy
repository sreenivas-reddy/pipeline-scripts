node {
    stage('Clone from GitHub') {
        echo 'Cloning from GitHub...'
        git branch: 'main',
            url: 'https://github.com/sreenivas-reddy/sample-java-project.git'
    }
}