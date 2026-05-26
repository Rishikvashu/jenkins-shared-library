def call() {

    echo "Starting Maven Build"
    sh 'mvn clean package'
    echo "Maven Build Complete"
}
