## Food Truck Project - Week 2 Skill Distillery

### Overview
This project will ask the user to input up to 5 different food trucks. The catch is, they might choose to enter less and enter the menu with an array of less than 5 food trucks. A Food Truck is an object and the program is just a workaround to manipulate the information in an array of Food Trucks.

### User Stories
-User Story #1
The user is prompted to input the name, food type, and rating for up to five food trucks. For each set of input, a FoodTruck object is created, its fields set to the user's input, and it is added to the array. The truck id is not input by the user, but instead assigned automatically in the FoodTruck constructor from a static field that is incremented as each truck is created.

-User Story #2
If the user inputs quit for the food truck name, input ends immediately and the program continues.

-User Story #3
After input is complete, the user sees a menu from which they can choose to:

List all existing food trucks.
See the average rating of food trucks.
Display the highest-rated food truck.
Quit the program.

-User Story #4
After choosing a menu item, the user sees the menu again and can choose another item until the choose to quit.


### Technologies Used
- Eclipse
- Java
- Terminal Commands
- Github/Git
- JUnit
- Atom

### Lessons Learned
- How to avoid null pointer exceptions in a semi-built array of Objects
- How to run JUnit for TDD
- toString() returns a string, it doesn't print out the string, that's separate.
- While loops are messier when dealing with arrays and null checking
- Create the local repository before the remote repository for easier integration
- README is better to be created in Eclipse than Atom