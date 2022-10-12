Feature: Entrance Exam Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create and Delete an Exam
    And Click on the element in the left Nav
      | entranceExams |
      | setupTwo      |
      | createExams   |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | tmrexam |

    And Click on thr element in the Form Content
      | academicPeriod  |
      | academicPeriod1 |
      | gradeLevel      |
      | gradeLevel1     |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    And Click on the element in the left Nav
      | exitButton |

    And User delete item from Dialog
      | tmrexam |

    Then Success message should be displayed

#    And User sending the keys in Dialog content
#      | nameInput1 | tmrexam |
#
#    And Click on the element in the Dialog
#      | searchButton       |
#      | deleteButton       |
#      | deleteDialogButton |
#
#    Then Success message should be displayed






