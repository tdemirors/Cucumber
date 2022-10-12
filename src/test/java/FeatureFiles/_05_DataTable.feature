
  #    Senaryo Outline da verilen değerler için tüm senaryo her satır kadar tekrar çalıştırılıyordu.
  #    DataTable da ise, sadece ilgili step için toplu veri gönderme imkanı oluşuyor.


  Feature: Datatable Functionality

    Background:
      Given Navigate to basqar
      When Enter username and password and click login button
      Then User should login successfully


    Scenario: Create Country
        And Click on the element in the left Nav
        | setupOne |
        | parameters |
        | countries |

        And Click on the element in the Dialog
        | addButton |

        And User sending the keys in Dialog content
        | nameInput | timurCountry1 |
        | codeInput | 151515 |

        And Click on the element in the Dialog
        | saveButton |

        And Success message should be displayed

        And User delete item from Dialog
        | timurCountry1 |

        And Success message should be displayed

    Scenario: Create a Nationality
        And Click on the element in the left Nav
        | setupOne |
        | parameters |
        | nationalities |

        And Click on the element in the Dialog
        | addButton |

        And User sending the keys in Dialog content
        | nameInput | timurNat15 |

        And Click on the element in the Dialog
        | saveButton |

        And Success message should be displayed

        And User delete item from Dialog
        | timurNat15 |

        And Success message should be displayed

    Scenario: Create a Fee, delete the Fee
         And Click on the element in the left Nav
          | setupOne |
          | parameters |
          | fees |

         And Click on the element in the Dialog
          | addButton |

         And User sending the keys in Dialog content
          | nameInput | timurFee |
          | codeInput | 1515 |
          | integrationCode | 0707 |
          | priorityInput   | 150   |

         And Click on the element in the Dialog
          | saveButton |

         And Success message should be displayed

         And User delete item from Dialog
         | timurFee |

         And Success message should be displayed
