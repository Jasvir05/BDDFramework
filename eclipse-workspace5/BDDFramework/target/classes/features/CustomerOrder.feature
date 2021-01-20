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
@tag
Feature: CustomerOrder
  to cheak if the Customer order is working with given 3rdparty delivery app

  @tag1
  Scenario: Cheak Customer order with given address
    Given User Open the Url
    And User is in the Url
    When Click change your location
    And enter the zip code and hit serch
    And select set as prefered location click order McDelivery
    Then select Door Dash Delivery and click Continue
    And add the address to deliver
    Then select buttermilk chicken meal with options
    And click for cheakout

 