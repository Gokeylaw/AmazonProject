Feature: Amazon website
  Scenario: Type amazon in google chrome search bar
    Given I have to launch google chrome browser
    When Type amazon in google search bar
    Then click on the first link in results page

  Scenario: Login with amazon using userid and password
    Given I have to launch amazon website
    When Enter userid and password
    Then Verify page is landed at home page

    Scenario: Get About Us text from amazon home webpage
      Given At welcome page scroll down to end
      When Click on about us link
      Then Again click on readmore and get whole text at console

