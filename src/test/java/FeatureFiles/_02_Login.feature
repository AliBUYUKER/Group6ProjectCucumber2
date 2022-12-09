Feature: Login Functionality

  Background:
    Given Naviagate to Website
    When Click the Sign in button.

  @Regression
  Scenario Outline: Negatif Case

    And User sending the keys in Dialog content
      | emailInput   | <email>    |
      | passworInput | <password> |

    And And Click on the element in the Dialog
      | submitLogin |

    Then Login unsuccessfuly

    Examples:
      | email              | password       |
      | lkdmvl@mail.com    | Group1256      |
      | Group666@gmail.com | Passwdfwerword |

  Scenario Outline: Pozitif case

    And User sending the keys in Dialog content
      | emailInput   | <email>    |
      | passworInput | <password> |

    And And Click on the element in the Dialog
      | submitLogin |

    Then User should login successfuly
    Examples:
      | email              | password  |
      | Group666@gmail.com | Group1256 |