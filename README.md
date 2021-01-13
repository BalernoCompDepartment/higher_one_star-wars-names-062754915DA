# HigherStarwarsTask

A persons Star Wars name (an early internet personal information grab) is created by joining together substrings of there details as follows

### First Name

this is created by joining the first three letters of surname and first two letters of forename

eg James Smith would be Smija

### Second Name

this is created by joining the first three letters of the mothers maiden name and first two letters of where you were born

eg MacGregor born in Liverpool would be Macli

#### the full name would be Smija Macli

this program makes use of two string predefined functions the first is substring(firstAppear, firstNotAppear) the second is toLowerCase()

**example of uses**

Stirng forname = "James";/

String nameSection = forename.substring(0,2); // this would store the value "Ja" as letter 0 is J, letter 1 is a, and letter 2 is the first to not appear

nameSection = forename.substring(3); // with just one parameter it would store the characters from index 3 to the end in this case "es"

String littleName = forename.toLowerCase(); this will store "james" as all letters are made lowercase

String littleFirstLetter = forename.substring(0,1).toLowerCase(); these can be combined as such this will store "j".

## Your Task

Write the Java in main to create someones Star Wars name when they type in the first name, secon name, mothers maiden name, and there city of birth

## The Algorithm Design

**Step 1:** ask user for firstname\
**Step 2:**	ask user for surname\
**Step 3:**	ask user for mothers maiden name\
**Step 4:**	ask user for city in which they were born\
**Step 5:**	starwarsname = first 3 letter of surname + first 2 letters of first name + " " + first 3 letters of motehrs maiden name + first 2 letters of town you **were born in\
**Step 6:**	display "your star wars name is " + starwarsname\
\
Test your program and submitt through a version control commit!
