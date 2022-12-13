Feature: Validate Landing page functions

  #@Regression
  Scenario: Validate buttons on Landing page
    Given User is on the Landing page
    Then Verify that navigation logo button is clickable in top navigation panel
    Then Verify that Home button is clickable in top navigation panel
    Then Verify that Student button is clickable in top navigation panel
    Then Verify that Eductors button is clickable in top navigation panel
    Then Verify that About us button is clickable in top navigation panel
    Then Verify that Contact us button is clickable in top navigation panel
    Then Verify that Sign up and take the quiz button is clickable in top navigation panel
    Then Verify that main Flag is clickable in top navigation panel
    Then Verify that Flag into United Kingdom Flag is clickable in top navigation panel
    Then Verify that Flag into United States Flag is clickable in top navigation panel
    Then Verify that Flag into Canada Flag is clickable in top navigation panel
    Then Verify that Flag into India Flag is clickable in top navigation panel
    Then Verify that Sign In button is clickable in top navigation panel
    Then Verify that Sign In into students button is clickable in top navigation panel
    Then Verify that Sign In into School or Consortium button is clickable in top navigation panel
    Then Verify that Sign In into Employers button is clickable in top navigation panel
    Then Verify that Sign In into College button is clickable in top navigation panel
    Then Verify that Sign In into VICTAR Code button is clickable in top navigation panel
    Then Verify that firstname user field is clickable
    Then Verify that lastname user field is clickable
    Then verify that Sign up and take the quiz button is clickable
    Then Verify that Sign In into students button is clickable
    Then Verify that Sign In into School or Consortium button is clickable
    Then Verify that Sign In into Employers button is clickable
    Then Verify that Sign In into College button is clickable
    Then Verify that Sign In into VICTAR Code button is clickable
    Then Verify that dropdown arrow is clickable
    Then Verify that Im student Lets go button is clickable
    Then Verify that Im an eductor Lets go button is clickable
    Then Verify that Launch Your Career student button is clickable in footer
    Then verify that Launch Your Career educator button is clickable in footer
    Then Verify that Get in touch about us button is clickable in footer
    Then Verify that Get in touch conatct us button is clickable in footer
    Then Verify that Privacy & Cookie Policy button is clickable in footer
    Then Verify that Back to Top button is clickable is clickable in footer
    Then Verify that Keep up with all things careers Facebook button is clickable
    Then Verify that Keep up with all things careers Twitter button is clickable
    Then Verify that Keep up with all things careers Instagram button is clickable
    Then Verify that Keep up with all things careers LinkedIn button is clickable
    
    #@Regression
    Scenario: Validate working of an elements from landing page
    Given User is on the Landing page
    When User click on the home function in top naviagation panel
    Then verify that Home button working as Expected "Launch Your Career"
    When User click on student function in top naviagation panel
    Then verify that Students button working as Expected "Students | Launch Your Career"
    
