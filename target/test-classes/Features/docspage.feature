@tag
Feature: Docspage feature
  I want to use this template for my feature file

  Scenario: verification of editing link in docs page
    Given you are on the docs page of jekyll
    When user click on improve this page link
    Then user redirects to the github login page.

  Scenario: verification of tutorial link in docs page
    Given you are on the docs page of jekyll
    When user clicks on a step by step tutorial link
    Then user redirects to the setup page.

  Scenario: verification of next button in setup page
    Given you are on the setup page of jekyll
    When user click on next button in the set up page
    Then user redirects to the Liquid page.

  Scenario: verification of back button in setup page
    Given you are on the Liquid page of jekyll
    When user click on back button in the Liquid page
    Then user redirects to the set up page.

  Scenario: verification of data file link in setup page
    Given you are on the setup page of jekyll
    When user click on data files link in the set up page
    Then user redirects to the data files page.
