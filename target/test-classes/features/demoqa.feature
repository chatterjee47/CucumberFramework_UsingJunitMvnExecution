Feature: Verifying features for demoqa.com

  @Wrong
  Scenario Outline: Wrong data provision On Practice Form
    Given I go to the Practice Form page
    When I type in Name as a numeric value "<First Name>"
    And I type in Last Name "<Last Name>"
    And I type in wrong Email Id "<Email Id>"
    And I select Gender Male
    And I type in wrong mobile number with less that ten numbers "<Mobile Number>"
    And I click submit button
    Then there shall appear on the places a red highlight where the incorrect data is provided

    Examples: 
      | First Name | Last Name  | Email Id          | Mobile Number |
      |     796543 | Chatterjee | ssl-27hotmail.com |        074244 |

  @Correct
  Scenario Outline: Correct data provision On Practice Form
    Given that I go to the Practice Form page
    When I type in Name "<First Name>"
    And I typed Last Name "<Last Name>"
    And I type in Email "<Email Id>"
    And I select Gender as Male
    And I type in mobile "<Mobile Number>"
    And I select from the calendar date of birth
    And I type in Subjects "<Subject>"
    And I select Hobbies Sports
    And I select Hobbies Reading
    And I upload a png file
    And I type in Current Adress "<Current Adress>"
    And I select NCR as state
    And I select Noida as city
    And I click Submit button
    Then there shall appear a message Thanks for submitting the form
    And I verify on the result view that Student name matches with the provided name
    And I verify on the result view email matches with the provided email
    And I verify on the result view Gender matches with the provided data
    And I verify on the result view Mobile name matches with the provided number
    And I verify on the result view Date of birth name matches with the provided date
    And I verify on the result view Subjects matches with the provided data
    And I verify on the result view Hobbies matches with the provided data
    And I verify on the result view Uploaded png name matches with the provided png name
    And I verify on the result view Address matches with the provided address
    And I verify on the result view State matches with the provided state name
    And I verify on the result view City matches with the provided city name
    And I click close

    Examples: 
      | First Name | Last Name  | Email Id           | Mobile Number | Subject | Current Adress |
      | Amit       | Chatterjee | ssl-27@hotmail.com |   07424499936 | Testing | Hydearbad      |

  @AlertButton
  Scenario: To verify Alert button
    Given that I am on the Alerts page
    When I click On the second button
    Then after five seconds a message shall appear This alert appeared after five seconds
    And I click Ok

  @ToolTips
  Scenario: To verify Hovering over
    Given that I am on the Tool Tips page
    When I hover over the Hover me to see green button
    And I hover over the input space Hover me to see
    Then the hover over messages should display

  @Draganddrop
  Scenario: To verify Drag and drop
    Given that I am on the Droppable page
    When I drag and drop the Drag me object to the Drop here area
    Then the Drop here area shall change into Dropped
    And I verify that on the page that the result is showing as Dropped!

  @Smallmodal
  Scenario: To verify Small modal
    Given that I am on the Modal Dialogs page
    And I click on the Small modal button
    When the Small modal appears and I press Close
    Then the small modal should get closed

  @DateCalculation
  Scenario: To verify Date calculation and selection
    Given that I am on the Date Picker page
    When calculate the date exactly a month from today date
    And I select the correct year using the date picker
    And I select the correct month using the date picker
    And I select the correct day using the date picker
    Then the chosen date shall be shown on the Select Date section
