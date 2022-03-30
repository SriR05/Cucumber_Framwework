@tag
Feature: OrangeHrm Recruitment Functionality

  @tag1
    Scenario Outline:Login Functionality
    Given Application Launch
    And Login using "<username>" and "<password>"
    When Click login button
    And Navigates to OrangeHrm homepage
    Then Validate OrangeHrm Homepage
    Examples:
|username|paswword|
|Admin|admin123|		
  @tag2
  Scenario: Recruitment Functionality	with Mouse-hover function
    When Mouse-hover on Recruitment Functionality
    And Recruitment features displays
    Then Clicks on Candidates feature

  @tag3
  Scenario: Recruitment Functionality	with click function
    When Clicks on Recruitment Functionality
    And Candidates feature page gets displayed
    Then Validate Candidate feature page

  @tag4
  Scenario: Fullname feature in Add Candidate functionality
    When Clicks on First Name"<firstname>"field and enters valid "<firstname>"
    When Clicks on Middle Name"<middlename>"field and enters valid "<middlename>"
    When Clicks on Last Name"<lastname>"field and enters valid "<lastname>"
    Then Validate Fullname field is entered with Valid "<firstname>""<middlename>""<lastname>"

  @tag5
  Scenario: Fullname feature without entering the fields
    When Fullname fields are not entered with <firstname><middlename><lastname>
    Then Validate the popup error message displays under <firstname> and <lastname> fields

  @tag6
  Scenario: Email feature in Add Candidate Functionality
    When Clicks on Email field
    And Enters email field with Valid "<emailid>"
    Then Validate Valid "<emailid>" in the email field

  @tag7
  Scenario: Email id in Email feature without '@'symbol
    When Clicks on Email field
    And Enters email field with <emailid> without '@' symbol
    Then Validate the popup error message displays under <emailid> field

  @tag8
  Scenario: Email feature without entering the field
    When Email field is not entered with <emailid>
    Then Validate the popup error message displays under <emailid> field

  @tag9
  Scenario: Email id in Email feature without domian
    When Enters email field with <emailid>  without domain
    Then Validate the popup error message displays under <emailid> field

  @tag10
  Scenario: Email id in Email feature without symbol
    When Clicks on Email field
    And Enters email field with <emailid> without . symbol
    Then Validate the popup error message displays under <emailid> field

  @tag11
  Scenario: Email id in Email feature with Numeric domian
    When Enters email field with <emailid>  with Numeric domain
    Then Validate the popup error message displays under <emailid> field

  @tag12
  Scenario: Contact No feature in Add Candidate functionality
    When Clicks on Contact No field
    And enters valid <contactno>
    Then Validate Contact No field is entered with Valid <contactno>

  @tag13
  Scenario: Contact No feature entered with Alphabates
    When Clicks on Contact No field
    And enters alphabets as <contactno>
    Then Validate the popup error message displays under <contactno> field

  @tag14
  Scenario: Contact No feature entered with more than 30 digits
    When Clicks on Contact No field
    And enters more than 30 digit numbers as <contactno>
    Then Validate the popup error message displays under <contactno> field

  @tag15
  Scenario: Job Vacancy feature in Add Candidate functionality
    When Clicks on Job Vacancy drop-down field
    And select job position from the drop-down list
    Then Validate Job Vacany field is selected

  @tag16
  Scenario: Select more than one job in Job Vacancy feature
    When Clicks on Job Vacancy drop-down field
    And selects more than one job position from the drop-down list
    Then Validate is the Job Vacancy field is enabled to choose more than one job position

  @tag17
  Scenario: Keywords feature in Add Candidate functionality
    When Clicks on Keywords field
    And enters keywords
    Then Validate keywords written in the Keywords field

  @tag18
  Scenario: Exceeding 250 words in Keywords feature
    When Clicks on Keywords field
    And enters keywords more than 250 words
    Then Validate the popup error message displays under Keywords field

  @tag19
  Scenario: Comment feature in Add Candidate functionality
    When Clicks on Comment field
    And enters comments
    Then Validate comments written in the Comment field

  @tag20
  Scenario: Exceeding 250 words in Comment feature
    When Clicks on Comment field
    And enters comments more than 250 words
    Then Validate the popup error message displays under Comment field

  @tag21
  Scenario: Date of Application feature in Add Candidate functionality
    When Clicks on Date of Application field
    And selects <date> <month> and <year> from the calender icon
    Then Validate <date><month><year> in the Date of Application field
  @tag22
  Scenario: Invalid entry in Date of Application feature
    When Clicks on Date of Application field
    And selects invalid <date> <month> and <year> from the calender icon
    Then Validate the popup error message displays under Date of Application field

  @tag23
  Scenario: Current date entry in Date of Application feature
    When Clicks on Date of Application field
    And selects current <date> <month> and <year> from the calender icon
    Then Validate the popup error message displays under Date of Application field

  @tag24
  Scenario: Consent to keep data feature in Add Candidate functionality
    When Clicks on Consent to keep data radio box
    Then Validate radio box selected in the Consent to keep data

  @tag25
  Scenario: Save feature in Add Candidate functionality
    When Clicks on Save button
    Then Validate datas are saved

  @tag26
  Scenario Outline: Three Candidates added in Add feature
    When Add three candidates through Add feature
    Then Validate added candidates
    Examples:
		|firstname|middlename|lastname|emailid|
		|Eren|Aot|Yeager|eren@yegar.com|
		|Mikasa|Aot|Ackerman|mikasa@ack.com|
		|Armin|Aot|Arlert|armin@aler.com|

  @tag27
  Scenario: Delete Two Candidates in Candidate Functionality
    When Two candidates are selected through tick box
    Then Validate delete feature

  @tag28
  Scenario: Sorting Order feature in Candidate Functionality
    When Clicks on the Sorting order feature
    Then Validate ascending and descending order
