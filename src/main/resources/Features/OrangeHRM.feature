Feature: OrangeHrm Recruitment Functionality

  @Page1
  Scenario Outline: Login Functionality
    Given Application Launch
    When Enters Username in "<username>" field
    When Enters Password in "<password>"field
    When Click login button
    Then Validate OrangeHrm Homepage

    Examples: 
      |username | password |
      | Admin   | admin123 |

  @Page2
  Scenario: Recruitment Functionality
    When Mouse-hover on Recruitment Functionality
    And Recruitment features displays
    When Clicks on Recruitment Functionality
    And Navigates to Candidates feature page
    Then Validate Candidate feature page

@Page3
  Scenario Outline: Add Candidate Functionality
    When Clicks on First Name"<firstname>"field and enters valid "<firstname>"
    When Clicks on Middle Name"<middlename>"field and enters valid "<middlename>"
    When Clicks on Last Name"<lastname>"field and enters valid "<lastname>"
    Then Validate Fullname field is entered with Valid "<firstname>""<middlename>""<lastname>"
    When Clicks on Email field and enters Valid "<emailid>"
    Then Validate Valid "<emailid>" in the email field
    When Clicks on Contact No field and enters valid contactno
    Then Validate Contact No field 
	  When Clicks on Job Vacancy drop-down field and select job position from the drop-down list
    Then Validate Job Vacany field is selected
    When Clicks on Keywords field and enters keywords
    Then Validate keywords written in the Keywords field
    When Clicks on Comment field and enters comments
    Then Validate comments written in the Comment field
    When Clicks on Date of Application field and enters DOA
    Then Validate DOA in the Date of Application field
    When Clicks on Consent to keep data radio box
    Then Validate radio box selected in the Consent to keep data
    When Clicks on Save button
    Then Validate datas are saved
    When Add three candidates through Add feature
    Then Validate added candidates

    Examples: 
      | firstname | middlename | lastname  | emailid       |
      | Eren      | Aot        | Yeager   | eren@yegar.com |
      | Mikasa    | Aot        | Ackerman | mikasa@ack.com |
      | Armin     | Aot        | Arlert   | armin@aler.com |

  @Page4
  Scenario: Delete Two Candidates in Candidate Functionality
    When Two candidates are selected through tick box
    Then Validate delete feature

  @Page5
  Scenario: Sorting Order feature in Candidate Functionality
    When Clicks on the Sorting order feature
    Then Validate ascending and descending order
