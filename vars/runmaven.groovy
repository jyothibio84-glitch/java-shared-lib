def call(Map config = [:]) {
    sh "mvn clean ${config.goal}"
}
