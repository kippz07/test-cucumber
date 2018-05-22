#Author: jenny.johnson
#Keywords Summary :
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
@tag
Feature: Hello name
  Code returns Hello + name

  @tag1
  Scenario: Bob returns Hello Bob
    Given My name is Bob
    When I enter the name Bob
    Then I should be greated with "Hello Bob"
