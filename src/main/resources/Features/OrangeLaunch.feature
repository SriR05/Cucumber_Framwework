@tag
Feature: Orange Launch Page
  @tag1
  Scenario: Launch page
    Given User opens the browser
    And Enters OrangeHRM url
    Then Application launches
  @tag2
  Scenario: Social media Applications and Orangeinc
    When User clicks f logo And navigates to Orange facebook page
    When User clicks t logo And navigates to Orange twitter page
    When User clicks you tube logo And navigates to Orange you tube channel
    When User clicks in logo And navigates to Orange linkdin page
    When User clicks all rights serverd link
    Then Orange launch build features are perfomring

  