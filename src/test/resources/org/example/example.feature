Feature: An example

  Scenario: Positive email address EN
    Given I am on the main page
    When the email with value of "tester@test.com"
    And the submit button is clicked
    Then the newsletter pop-up appears

  Scenario: Positive email address GOV UK
    Given I am on the main page
    When the email with value of "tester@test.co.uk"
    And the submit button is clicked
    Then the newsletter pop-up appears

  Scenario: Start the Enrollment
    Given I am on the main page
    When the start the enrollment button is clicked
    Then I am taken to the "Software Testing | Enrollment" page

  Scenario: Read  More for virtual
    Given I am on the main page
    When the read more for virtual is clicked
    Then I am taken to the "Virtual" page

  Scenario: Read More for hybrid
    Given I am on the main page
    When the read more for hybrid is clicked
    Then I am taken to the "Hybrid" page

  Scenario: Read More in person
    Given I am on the main page
    When the read more for in person is clicked
    Then I am taken to the "In Person" page
    
  Scenario: Personal Information
    Given I am on Personal information page
    When the first name is inserted as "Gigi"
    And the last name is inserted as "Gicu"
    * the username is inserted as "Pisicutza"
    * the password is inserted as "lala"
    * the confirmed passsword is inserted as "lala"
    * the next button is clicked for personal information
    Then I am taken to the contact information page

  Scenario: Personal Information
    Given I am on Personal information page
    When the first name is inserted as "Gigi"
    And the last name is inserted as "Gicu"
    * the username is inserted as ""
    * the password is inserted as "lala"
    * the confirmed passsword is inserted as "lala"
    * the next button is clicked for personal information
    Then I am taken to the personal information page


  Scenario: Contact Information
    Given I am on the Contact Information page
    When the email value of "pisi123@yahoo.com" is inputted
    And the phone field is inserted as  "0766666666"
    * the country field is inserted as "Romania"
    * the city field is inserted as "Brasov"
    * the post code is inserted as "502704"
    * the next button is clicked for contact information
    Then I am taken to the course options page


    Scenario: Course Options
      Given I am on the course options page
      When I click on the first course
      And I click on the next button
      Then I am taken to the payment information page



