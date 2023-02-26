properties([
    parameters([
        string(name: 'country', defaultValue: 'India', description: 'Country Name'),
        booleanParam(name: 'married', defaultValue: true, description: 'Marital Status'),
        choice(name: 'gender', choices: ['Male', 'Female'], description: 'Gender')
    ])
])

node() {
    stage('Initialization Stage') {
        echo 'Initializing...'
        echo params.country
        echo "Country: ${params.country}"
        print "Are You Married: ${params.married}"
        print "Gender: ${params.gender}"
    }

    stage('Build Stage') {
        echo 'Building...'
    }

    stage('Deploy Stage') {
        echo 'Deploying...'
    }
}