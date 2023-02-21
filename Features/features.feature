#Author: gayatripatil596@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Calculator
Feature: Calculator Test
  I want to perform arithmetic operations.

  Background: Launch the application
    Given User launch the application

  @Multiplication
  Scenario Outline: Verify Multiplication Test
    When I enter <n1> and <n2> and perform the multiplication operation
    Then Verify the Multiplication <result>

    Examples: 
      | n1  | n2  | result |
      | 423 | 525 | 222075 |

  @Division
  Scenario Outline: Verify Division Test
    When I enter <n1> and <n2> and perform the division operation
    Then Verify the Division <result>

    Examples: 
      | n1   | n2  | result |
      | 4000 | 200 |     20 |

  @Addition
  Scenario Outline: Verify Addition Test
    When I enter <n1> and <n2> and perform the addition operation
    Then Verify the Addition <result>

    Examples: 
      | n1     | n2     | result |
      | 234234 | 345345 | 579579 |

  @Substraction
  Scenario Outline: Verify Substraction Test
    When I enter <n1> and <n2> and perform the substraction operation
    Then Verify the Multiplication <result>

    Examples: 
      | n1     | n2        | result   |
      | 234823 | -23094823 | 23329646 |
