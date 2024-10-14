# Magento Web Test Automation Project
Welcome to the **Magento E-commerce Test Automation** repository.This project is a web test automation framework for testing the [Magento](https://magento.softwaretestingboard.com/)
e-commerce platform using Java, Selenium WebDriver, Cucumber, and the Page Object Model (POM) design pattern. It
incorporates TestNG’s `DataProvider` for parameterized testing and is designed to enhance test coverage and identify
critical defects early by automating core user workflows.

## Technologies Used

![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF6F00?style=for-the-badge&logo=testng&logoColor=white)
![Page Object Model](https://img.shields.io/badge/Page%20Object%20Model-POM-blue?style=for-the-badge)
![DataProvider](https://img.shields.io/badge/DataProvider-TestNG-blue?style=for-the-badge&logo=testng)
![Cucumber](https://img.shields.io/badge/Cucumber-23D96C?style=for-the-badge&logo=cucumber&logoColor=white)
![Allure Reports](https://img.shields.io/badge/Allure_Reports-23D96C?style=for-the-badge&logo=allure&logoColor=white)


## Project Overview

This project automates key workflows on a real-world e-commerce
website, [Magento](https://magento.softwaretestingboard.com/), to ensure a seamless user experience. The automation
includes:

- **Create account functionality**: Automates the process of registering a new user account.
- **Sign in functionality**: Automates user login validation and session handling.
- **Product search**: Tests the search functionality by simulating keyword queries and filtering results.
- **Adding products to wish list**: Ensures users can save items to their wish list for future reference.
- **Adding products to the cart**: Verifies the functionality of adding items to the shopping cart.
- **An E2E use case**: Provides a complete end-to-end user journey for core functionalities.

### Core Framework Features:

- **IntelliJ IDEA**: The development environment for building and maintaining the framework.
- **Maven**: For managing project dependencies and build automation.
- **Selenium WebDriver**: To interact with web elements and perform browser automation.
- **Page Object Model (POM)**: To create a maintainable and reusable object-oriented framework.
- **TestNG DataProvider**: For parameterized, data-driven testing that allows testing multiple data sets.
- **Java Faker lib**:A library used to generate fake data for testing purposes (e.g., names, addresses, emails), helping to simulate real-world scenarios without hardcoding test data.
- **Cucumber**: For Behavior-Driven Development (BDD) and writing human-readable test cases.
- **Allure Reports**: Produces comprehensive and visually appealing reports.
  
### Framework Objective:

The goal is to create a robust test framework that increases test coverage and helps in early detection of critical
defects, providing a maintainable and scalable testing solution.



## Setup Instructions

To set up the project locally, follow these steps:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/AbdallahALBanna/Web_Automation_With_Selenium.git
   ```

2. **Open the project in your IDE** and make sure Maven is configured to handle project dependencies.

3. **Install dependencies**:
   Navigate to the project root and run:
   ```bash
   mvn clean install
   ```

## Project Structure

The project is organized into the following structure:

- `src/main/java`: Contains page classes and methods.
- `src/test/java`: Contains test scripts for automating various website features.

## Executing Tests

To run the automated tests:

**Run all tests**:
```bash
mvn test
```
   
## Viewing Reports

After test execution, you can generate and view the Allure report:

Generate and serve the Allure report locally:
```bash
allure serve allure-results
```

## Conclusion

This README provides detailed guidance on setting up and running automated tests for the Magento website. By following the instructions, you can easily execute the automation tests and generate comprehensive reports for different test cases.

Feel free to contribute, explore, and expand this project to cover more testing scenarios.

## Contact Information

If you have any questions 
or need further assistance, please contact me at:

**Email**: Abdallah.albanna333@gamil.com






