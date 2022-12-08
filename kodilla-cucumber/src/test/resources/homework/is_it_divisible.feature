Feature:  Is it divisible?

  Scenario Outline: The number is divisible by 3 or 5 or 3 and 5

    Given the number is <number>
    When  I check if number is divisible
    Then  The answer is <answer>
    Examples:
      | number |answer|
      | 3 |"Fizz"|
      | 5 |"Buzz"|
      | 7 |"None"|
      | 9 |"Fizz"|
      | 10 |"Buzz"|
      | 15 |"FizzBuzz"|
      | 17 |"None"|
      | 30 |"FizzBuzz"|