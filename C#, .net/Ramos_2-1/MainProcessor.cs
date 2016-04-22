// Programmer: Ramonier Ramos
// Filename: MainProcessor.cs
// Due Date: 02/27/2015
// Description: Individual Assignment #2 - MainProcessor class.
//              Class to calculate certification exam numeric scores and grades.
using System;

public class MainProcessor
{

    // Declare class-level variables
    static string name;                       // The first and last name of the employee
    static string date;                        // Date of exam
    static string input;                        // Input from user
    static int numberOfQuestions = 0;       // The number of questions on the exam
    static int numberOfMissed = 0;           // Number of missed questions on the exam
    static int counter = 0;                 // Accumulator for the number of times the program runs
    static double totalScore;               // The total scores for all employee exams      
    static string grade;                    // The grade for the employee
    static double averageScore;               // The average score of all employee exams
    static int totalPassPlus = 0;               // Total Pass plus grades
    static int totalPass = 0;                  // Total Pass grades
    static int totalFail = 0;                  // Total Fail grades

    // Main method begins program execution
    public static void Main(string[] args)
    {
        // Declare variables
        char repeatCode = ' ';

        // Call the method to display the instructions to the user
        DisplayInstructions();

        // Prompt the user to enter the date of the exam
        Console.Write("Enter the date of the exam: ");
        date = Console.ReadLine();
        Console.WriteLine(); // Blank line

        // Handle null input for date
        while (date.Length == 0)
        {
            Console.Write("No date was entered. Please enter the date for the exam: ");
            date = Console.ReadLine();
            Console.WriteLine(); // Blank line
        }// End while

        do
        {
            // Prompt the user to enter the employee's first and last name as a single data entry
            Console.Write("Enter the employee's first and last name: ");
            name = Console.ReadLine();
            Console.WriteLine(); // Blank line

            // Handle null input for name
            while (name.Length == 0)
            {
                Console.Write("No name was entered. Please enter the name for the employee: ");
                name = Console.ReadLine();
                Console.WriteLine(); // Blank line
            }// End while

            // Prompt the user to enter the number of questions on the exam
            Console.Write("Enter the number of questions on the exam: ");
            input = Console.ReadLine();

            if (!input.Equals(""))
            {
                numberOfQuestions = int.Parse(input); // Converts the input to integer
            }
            Console.WriteLine(); // Blank line

            // Handle null input for the number of questions
            while (numberOfQuestions < 1)
            {
                Console.Write("Please enter the number of questions on the exam: ");
                input = Console.ReadLine();

                if (!input.Equals(""))
                {
                    numberOfQuestions = int.Parse(input); // Converts the input to integer
                    Console.WriteLine();  // Blank line
                }
            }//End while

            // Prompt the user to enter the number of missed questions on that exam
            Console.Write("Enter the number of questions missed on the exam: ");
            input = Console.ReadLine();

            if (!input.Equals(""))
            {
                numberOfMissed = int.Parse(input); // Converts input to integer
                Console.WriteLine();
            }
            Console.WriteLine(); // Blank line

            // Handle null input and make sure the number is between
            // zero and the number of questions on the test
            while (numberOfMissed < 1 || numberOfMissed > numberOfQuestions)
            {
                Console.Write("Please enter the number of questions missed on the exam: ");
                input = Console.ReadLine();
                Console.WriteLine(); // Blank line

                if (!input.Equals(""))
                {
                    numberOfMissed = int.Parse(input); // Converts input to integer
                    Console.WriteLine(); // Blank line
                }
            }// End while

            // Call method DisplayEmployeeSummary to handle the display
            // of an individual employee's test results
            DisplayEmployeeSummary();

            // Create ExamGrader class object's using the numberOfQuestions and numberOfMissed values
            ExamGrader examgrader = new ExamGrader(numberOfQuestions, numberOfMissed);

            // Call ExamGrader class to get the CalculateScore method
            examgrader.CalculateScore();

            // Call ExamGrader class to get the DetermineGrade method
            examgrader.DetermineGrade();

            totalScore += examgrader.Score; // Total Score accumulator
            grade = examgrader.Grade;

            // Handles the grade given on the exam
            if (grade.Equals("Pass Plus"))
            {
                totalPassPlus++;
            }
            else if (grade.Equals("Pass"))
            {
                totalPass++;
            }
            else if (grade.Equals("Fail"))
            {
                totalFail++;
            }
            Console.WriteLine(); // Blank line

            // Prompt the user to in indicate if there are any more exams
            // to process that day.
            Console.WriteLine("Do you want to enter another employee? ");
            Console.Write("Enter Y for Yes, or N for No: ");
            input = Console.ReadLine();
            Console.WriteLine(); // Blank line

            while (input.Length == 0)
            {
                Console.WriteLine("Please decide if you want to enter another employee.");
                Console.Write("Enter Y for yes, or N for No: ");
                input = Console.ReadLine();
                Console.WriteLine(); //Blank line
            }
            input = input.ToUpper();     // Converts the input to upper case
            repeatCode = Char.Parse(input); // Converts the input to char
            repeatCode = input[0]; // Takes the first character from input

            counter++; // Total counter for employee exams
            averageScore = totalScore / counter; // The average score of all employees who took the exam

        }

        while (repeatCode == 'Y');

        // Call method DisplayDailySummary to display the daily summary
        DisplayDailySummary();

    }// End main method

    // Method to display instructions to user
    public static void DisplayInstructions()
    {
        Console.WriteLine("Welcome to the Alexander Medical Laboratory System!");
        Console.WriteLine("---------------------------------------------------");
        Console.WriteLine("This program allows you to calculate exam scores earned ");
        Console.WriteLine("by each employee that has taken a certification exam, ");
        Console.WriteLine("as well as the grade category assigned to that exam score.");
        Console.WriteLine("The system also runs a daily summary for the average ");
        Console.WriteLine("score of all exams taken that day along with the count of ");
        Console.WriteLine("how many employees scored in each of the three possible ");
        Console.WriteLine("grade categories. ");
        Console.WriteLine(); // Blank line to make it easier to read
    } // End DisplayInstructions method



    // Method to display the employee summary to user
    public static void DisplayEmployeeSummary()
    {
        // Create ExamGrader class object's using the numberOfQuestions and numberOfMissed values
        ExamGrader examgrader = new ExamGrader(numberOfQuestions, numberOfMissed);

        // Call ExamGrader class to get the CalculateScore method
        examgrader.CalculateScore();

        // Call ExamGrader class to get the DetermineGrade method
        examgrader.DetermineGrade();

        Console.WriteLine("EMPLOYEE EXAM SUMMARY");
        Console.WriteLine("Employee Name: {0}", name);
        Console.WriteLine("Number Attempted: {0}", examgrader.NumberQuestions);
        Console.WriteLine("Number Missed: {0}", examgrader.NumberMissed);
        Console.WriteLine("Score: {0:F}", examgrader.Score);
        Console.WriteLine("Grade: {0}", examgrader.Grade);

    }

    // Display the daily summary for the exams
    public static void DisplayDailySummary()
    {
        Console.WriteLine("DAILY EXAM SUMMARY");
        Console.WriteLine("Exam Date: {0}", date);
        Console.WriteLine("Average Exam Score: {0:F}", averageScore);
        Console.WriteLine("Total Pass Plus grades: {0}", totalPassPlus);
        Console.WriteLine("Total Pass grades: {0}", totalPass);
        Console.WriteLine("Total Fail grades: {0}", totalFail);
    }

}// End class MainProcessor
