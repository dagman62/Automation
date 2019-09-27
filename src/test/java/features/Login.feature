Feature: Application Login

Scenario: Home page default login
Given User is on landing page
When User login into application with username "Gaetano" and password "Giacalone"
Then Browse all blogs
And Blogs are displayed

Scenario: Home page default login
Given User is on landing page
When User login into application with username "Leda" and password "Giarratano"
Then Browse all blogs
And Blogs are displayed