## Jets Application Project

### Week 3 Homework Project for Skill Distillery

### Overview
This week's project had student build in application that creates a fleet of jets and allows users to view details about them as well as give them commands. The details to be displayed throughout the menu options are a Jets model, speed, range, and price. The program also compares the jets with each other to find out, which one is the fastest or has the longest range. Some commands that can be given by the user are flying all jets, loading Cargo Planes, and readying Fighter Jets for a dogfight. The user may also add or remove jets to the fleet.

The grading criteria for the Project:
- The initial list of Jets must be loaded from a text file.
- When menu option 1 is pressed all Jets in the fleet are displayed to the user.
- When menu option 2 is selected, fly() is executed on all Jets.
- When menu option 3 is selected, the fastest jet from the list of Jets should be displayed to the user.
- When menu option 4 is selected, the jet with the longest range should be displayed to the user.
- Choosing type-specific behavior calls the interface method for those Jets.
- When the user chooses to add a Jet, you are prompted to enter the model, speed (in MPH), range, and price. This Jet should be added to the list of Jets so that when the user again selects menu option 1, that custom jet is included.
- If you implement the option to choose Jet type, this menu displays before entering Jet data.
- When the user chooses to remove a Jet, the user is presented a menu for selecting the jet to remove.
- The final menu option should exit the program.

### How to run
The user navigates through the menu and presses a number to choose their option. Option 1 will list the entire fleet with updated list whether jets are added or removed. Option 2 will initiate the fly method on all the jets. Option 3 compares the jets speeds and prints the fastest one with model name. Option 4 compares jets range and prints out longest with model name. Option 5 will initiate all Cargo Planes to use their load method. Option 6 will initiate all Fighter Jets to use their fight method. Option 7 has the Fighter Jets and Jet Regulars do a barrel roll. Option 8 will add a jet to the fleet and Jet list with user input on model, speed, range, and price. Option 9 will remove a from the fleet by giving the user a number to choose from using a newly printed list. Option 10 will allow users to exit the menu.

### Technologies/Topics Applied
The technologies and topics used in this project are: ArrayLists, BufferReader, FileReader, abstract classes, interfaces, instanceof, List capabilities, downcasting, polymorphism, wrapper classes, FileIO, Scanner, split, IOException, and implements.

### Lessons Learned
There was a lot of trial and error in this project, but I believed it really helped me instill the material and topics covered in the project. I spent lots of time on reworking different methods for reading the list, adding them to the list, and creating the different Jet objects. The topic instance of and downcasting were also hard for me to understand and get to work correctly.   Despite my struggle I found this to be a really cool project and enjoyed the challenge.
