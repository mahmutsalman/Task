# NGSS Task

This project is a Java application that simulates a store where some discounts are made based on this situation
of the customer like having a gold or silver card or if he/she is a affiliate customer.

## Prerequisites

Before running the application and tests, make sure you have the following software installed:

- Java Development Kit (JDK) [11 +]
- Maven [3+]

## Installation

1. Clone or download the repository to your local machine:

   ```shell
   git clone https://github.com/mahmutsalman/Task
2. Navigate to ..\Task\src\main\java\org\example
3. Open the command line
4. Run this command: **javac App.java Card.java Calculator.java Person.java**
5. To run the application first navigate to ..\Task\src\main\java\ run this command:  **java org.example.App**
Then the application will start and wait for user input


## Maven scripts

1. **mvn package**

2. **java -cp target/Task3-1.0-SNAPSHOT.jar org.example.App** 

3. **mvn checkstyle:checkstyle** 

4. **mvn clean test jacoco:report**

## Unit test and coverage
For unit test org/example/CalculatorTest.java class can be run (In IntelliJ Run with Coverage option)

## UML Diagram 

![UML diagram](https://github.com/mahmutsalman/Task/assets/74365527/074075ca-620f-4607-b4f5-a165f3f70a1e)


