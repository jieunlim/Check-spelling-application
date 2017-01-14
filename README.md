# Check-spelling-application


##Background

I wanted to create an auto-grader. There are many types of students who can be applied this application.
Some are high-achieving High School students, some are Undergraduate students, and some are Graduate students. 
I created a parent (base) Class that can be extended to provide functionality for various kinds of students. 
I assumed that there will be name of the file containing a student’s essay (the student's’ ID number.txt) and depending on that, application grade the essay, by listing all the misspelled.


##Objective

•    Read in the file given
•    Store each misspelled word
•    List all misspelled words
•    Generate an output file that contains the student’s graded feedback

## Sample Files 

**Sample Essay Files (saved as 11111111.txt)**
 
Graduate Student
John Smith
11111111
Computer Science
Kyla McMullen
This esasy is not very long. I hope my advisor won’t be agnry with me.

**Sample Essay File (saved as 12345678.txt)**
 
Undergraduate Student
Jane Doe
12345678
Mechanical Engineering
Writing an essay is hard. If I had a nickel for every misspeled word in this essay I would have exactly one nickel.

**Sample Essay File (saved as 99999999.txt)**
 
HighSchool Student
Allen Anderson
99999999
Gainesville High School
Shall I compear thee to a summer day?
Thou art more lovely and more temparate:
Rough winds do shake the darling buds of May,
And summer's leese hath all too short a date

**Sample Output File (saved as 11111111_graded.txt)**
 
Graduate Student John Smith
Student ID: 11111111
Major: Computer Science
Advisor: Kyla McMullen
(1)esasy
(2)won’t
(3)agnry


Sample Output File (saved as 12345678_graded.txt)
 
Undergraduate Student Jane Doe
Student ID: 12345678
Major: Mechanical Engineering
(1)misspeled


Sample Output File (saved as 99999999_graded.txt)
 
High School Student Allen Anderson
Student ID: 99999999
School Name: Gainesville High School
(1)temparate
(2)winds
(3)buds
(4)summer's
(5)leese
