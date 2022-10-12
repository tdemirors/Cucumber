# Employee menüsü için Create-Exist-Delete bölümleri olan senaryoyu yazınız
# Daha sonra aynı senaryoyu 5 farklı değerler için çalıştırınız.

Feature: Employee Fuctionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Create an Employee , Delete an Employee
    And Click on the element in the left Nav
      | humanResources |
      | employees      |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | firstName | <FirstName> |
      | lastName  | <LastName>  |


    And Click on the element in the Form Content
      | gender         |
      | <GenderSelect> |
      | employeeType   |
      | <JobSelect>    |

    And User sending the keys in Dialog content
      | employeeId | <EmployeeId> |

    And Click on the element in the Dialog
      | generalInfo |

    And Click on the element in the Form Content
      | qualification         |
      | <QualificationSelect> |
      | documentType          |
      | <DocumetType>         |

    And User sending the keys in Dialog content
      | documentNumber | <DocumentNumber> |


    Examples:
      | FirstName | LastName | GenderSelect | JobSelect | EmployeeId | QualificationSelect | DocumetType | DocumentNumber |
      | george    | hagi     | male         | teacher   | 321321     | secondaryTechnical  | passport    | 852258         |
