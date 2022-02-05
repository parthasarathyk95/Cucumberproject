Feature: to validate the functionality to project login page

  Background: 
   Given user need to be in project login page
  Scenario: to validate the project login with invalid username and invalid password
    
    When user should enter the invalid Username
     # Without header ----->1D List
      | username@gmail.com | abi | balu | chandru |
    When user should enter the invalid Password
     # Without header ----->2D List
      | pass@123    | abi@456     | balu@789    |
      | chandru@012 | daniel@123  | edwin@456   |
      | Balu@789    | chandru@012 | pass@1234   |
      | abi@456     | balu@789    | chandru@012 |
    And user clicks to login the project page
    Then user will navigate to invalid credential page

  Scenario Outline: to validate the project login with valid username and invalid password
    
    When user should enter the "<Username>" valid username
    When user should enter the  "<Password>" invalid password
    And user clicks to login the project page
    Then user will navigate to valid credential page
Examples: 
      | Username  | Password  |
      | Java@gmail.com      | java      |
 
    