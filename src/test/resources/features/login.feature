Feature: A Test a successful login

Scenario: Logging in
  Given I access login page
  When I login with credentials "Mothupi" "Ramalepe"
  And email "mothupi.ramalepe@sqs.com"
  And password "mkr@2018"
  Then login should be successful