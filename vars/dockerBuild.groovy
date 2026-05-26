def call() {

    echo "Building docker image"
    sh 'docker build -t employee-service:latest .'
    echo "Docker Build Complete"
}
