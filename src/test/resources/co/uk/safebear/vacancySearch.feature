Feature: Vacancy Search

  Acceptance Criteria:
  Users must be able to search for vacancies on the Bristol Airport website
  User must be informed of any jobs
  User must be informed if there are no jobs

  Scenario: A user searches for a job that exists
    When a user searches for a job called "cleaner"
    Then all job results containing the word "cleaner" are returned