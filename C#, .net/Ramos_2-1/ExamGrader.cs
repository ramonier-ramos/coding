// Programmer: Ramonier Ramos
// Filename: ExamGrader.cs
// Due Date: 02/27/2015
// Description: Individual Assignment #2 - ExamGrader class.
//              Class to calculate certification exam numeric scores and grades.
using System;

public class ExamGrader
{
    // These are the auto-implemented properties
    public int NumberQuestions { get; set; }
    public int NumberMissed { get; set; }
    public double Score { get; set; }
    public string Grade { get; set; }

    // The constructor method is called each time an instance of the class is created.
    public ExamGrader(int questions, int missed)
    {
        NumberQuestions = questions;
        NumberMissed = missed;
    }

    // The CalculateScore method is a public method with no parameters
    // that is a void type method.
    public void CalculateScore()
    {
        Score = (((double)NumberQuestions - NumberMissed) / NumberQuestions) * 100.0;
        return;
    }

    // The DetermineGrade method is a public method with no parameters 
    // that is a void type method.
    public void DetermineGrade()
    {
        if (Score < 70)
        {
            Grade = "Fail";
        }
        else if (Score >= 90)
        {
            Grade = "Pass Plus";
        }
        else if (Score >= 70)
        {
            Grade = "Pass";
        }
        return;
    }

} // End class ExamGrader
