# NGSS Task

This project is a Java application that simulates a store where some discounts are made based on this situation
of the customer like having a gold or silver card or if he/she is a affiliate customer.

## Prerequisites

Before running the application and tests, make sure you have the following software installed:

- Java Development Kit (JDK) [11 +]
-

## Installation

1. Clone or download the repository to your local machine:

   ```shell
   git clone [[repository URL]](https://github.com/mahmutsalman/Task)https://github.com/mahmutsalman/Task
2. Navigate to ..\Task\src\main\java and make sure you find **org** folder
3. Open the command line
4. Run this command: **javac App.java Card.java Calculator.java Person.java**
5. To run the application run this command:  **java org.example.App**
Then the application will start and wait for user input


# Maven scripts

# Package the project
mvn package

# Run the code in the command line
java -cp target/Task3-1.0-SNAPSHOT.jar org.example.App

# Run Checkstyle
mvn checkstyle:checkstyle

# Run the tests and generate a JaCoCo report
mvn clean test jacoco:report




