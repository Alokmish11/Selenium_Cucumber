
Feature: Form Functionality
  
  Scenario: Fill out and submit the form
  Given navigate to the form
  When enter "John" in the first name field
  And enter "Doe" in the last name field
  And enter "Engineer" in the job title field
  And select "2-4" years of experience
  And select the "Male" radio button
  And check the "Accept terms and conditions" checkbox
  And pick a date
  And click the submit button
  Then should see a success message
