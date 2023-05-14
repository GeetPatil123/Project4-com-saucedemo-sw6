Feature: LoginPage Test
  As user I want to navigate to various pages of com-sauce demo website

  @smoke @regression
  Scenario: User should Login with valid credentials
    Given I am on the HomePage
    When I click on Login link
    And I enter username "standard_user"
    And I enter password "secret_sauce"
    And I click on Login Button
    Then I should Login successfully