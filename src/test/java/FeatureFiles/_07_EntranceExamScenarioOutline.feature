Feature: Entrance Exam Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Create and Delete an Exam
    And Click on the element in the left Nav
      | entranceExams |
      | setupTwo      |
      | createExams   |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | <ExamName> |

    And Click on the element in the Form Content
      | academicPeriod         |
      | <AcademicPeriodOption> |
      | gradeLevel             |
      | <GradeLevelOption>     |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    And Click on the element in the left Nav
      | exitButton |

    And User delete item from Dialog
      | <ExamName> |

    Then Success message should be displayed

    Examples:
      | ExamName | AcademicPeriodOption | GradeLevelOption |
      | tmrex    | academicPeriod1      | gradeLevel1      |
      | mslex    | academicPeriod1      | gradeLevel1      |
      | hrex     | academicPeriod1      | gradeLevel1      |
      | mnex     | academicPeriod1      | gradeLevel1      |
