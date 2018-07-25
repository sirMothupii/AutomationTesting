Feature: Test a successful Registration

  Scenario: Successful Registration
    Given An e commerce
    When I register with "Mothupi" "Ramalepe"
    And Email "mothupi.ramalepe@sqs.com"
    And Password "mothupi@sqs"
    Then The registration should be successful