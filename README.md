# SauceDemo Automation Framework

This project is an end-to-end test automation framework built to validate core user journeys on the SauceDemo application.
----------------------------------------------------------------------------------------------------------------------------
## Tech Stack
- Java
- Selenium WebDriver
- Cucumber (BDD)
- Maven
- JUnit/TestNG
- GitHub

------------------------------------------------------------------------

## Prerequisites
Ensure the following are installed on your machine:
- Java JDK 11 or higher
- Maven
- Google Chrome
- Git

-----------------------------------------------------------------------------

## Setup Instructions

1. Clone the repository:
git clone https://github.com/MpilokaInno/SauceDemo_Automation.git
2.Navigate to the project directory
3.Install dependencies
4.Update test credentials

--------------------------------------------------------------------------------

## How to run tests
Run all tests:mvn test
Run specific feature:mvn test -Dcucumber.options="src/test/resources/features"

---------------------------------------------------------------------------------
## Assumptions
Tests are executed against the SauceDemo test environment
Stable internet connection is available
Chrome browser is used for execution

----------------------------------------------------------------------------------

## Possible Improvements

Add cross-browser support (Firefox, Edge)
Introduce parallel execution
Improve reporting (Allure / Extent Reports)
Externalize environment configs
Add API-level validations
