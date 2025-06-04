Feature: The navigation bar allows the user to navigate through the app
    to see the pages of the app
    the user can do click on the links
# Scenario Outline: The user can access the subpages through the navigation bar
#     Given I navigate to www.freerangetesters.com
#     When I go to <section> using the navigation bar 
#     Examples:
#         | section          |
#         | Cursos             |
#         | Recursos            |
#         | Udemy         |
#         | Mentorías          |

Scenario: Users can select a plan when signing up
    Given I navigate to www.freerangetesters.com
    When I select Elegir Plan
    Then I can validate the options in the checkout page  