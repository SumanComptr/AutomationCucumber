#Author: your.email@your.domain.com
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

Feature: Purchase

  Scenario: Verify user is able purchase an item
    Given User Launch Chrome Browser
    When User opens new url "https://demo.nopcommerce.com/build-your-own-computer"
    And User select Processor as "2.2 GHz Intel Pentium Dual-Core E2200"
    And User select RAM as "4GB [+$20.00]"
    And User check HDD as "320 GB"
    And User check OS as "Vista Premium [+$60.00]"
    And User check Software as "Total Commander [+$5.00]"
    And Click on AddToCart
    And Close the browser
    