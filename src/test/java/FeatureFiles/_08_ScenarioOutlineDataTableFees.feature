#  Daha önceki Create a Fee, delete Fee Senaryosunu
#  Aşağıdaki 5 farklı değerler için çalıştırınız.
Feature: Fee Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Create a Fee, delete the Fee
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fees       |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput       | <FeeName>         |
      | codeInput       | <CodeName>        |
      | integrationCode | <IntegrationName> |
      | priorityInput   | <PriorityName>    |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | <FeeName> |

    And Success message should be displayed
    Examples:
      | FeeName | CodeName | IntegrationName | PriorityName |
      | tmrfee  | 151515   | tmrint          | 150          |
      | mslfee  | 454545   | mslint          | 450          |
      | hrfee   | 202020   | hrint           | 200          |
      | mnfee   | 070707   | mnint           | 700          |
      | tmhm    | 484848   | tmhmint         | 480          |