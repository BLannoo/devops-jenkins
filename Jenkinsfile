stage('compile') {
    ./gradlew classes
}
stage('test') {
    ./gradlew test
}
stage('Proceed?') {
    input message: 'Proceed?'
}
stage('deploy') {
    echo "deploy"
}