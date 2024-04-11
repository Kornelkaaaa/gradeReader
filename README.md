# gradeReader

While I was studying programming at Lindenwood University, we were given an assignment that will probably someday be related to my future work. It was all based on reading .txt files through the Java programming language.

We received Student.java from the Professor and had to create a complementary class to it called Lab6_initials.java with a program based on this pseudo code:
- File Dialogue handling GUI with Try/Catch
- Instantiate/Construct a new student called maxStudent
- Declare another student called minStudent = maxStudent 
- Declare an integer called sum, give it the value from the getScore method in
Student.
- Declare an integer called numStudents, initialize to 1
- In a while loop (while(scanner.hasNext()))
  - Read in a student Student current = new Student(scanner);
  - Check scores and set minStudent and maxStudent accordingly.
  - Add to the sum
  - Increment numStudents
- Outside the while loop calculate the average and print min and max students
- Close scanner and dispose file dialogue

When using or testing the code, you need to be careful about 
File myFile = new File("C:\\Users\\User\\Downloads\\Lab6in7.txt");
Please remember to change the location of the file
