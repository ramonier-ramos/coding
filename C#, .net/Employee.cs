//Ch.4 Programming Problem #3
//Filename; Employee
//Description: a class that shows a first name, last name, and monthly salary of an employee
using System;

public class Employee
{

    //Declare instance variable
    private decimal monthlySalary;

    //Auto implemented property FirstName implicitly creates 
    //instance variable to for the employee's first name
    public string FirstName { get; set; }

    //Auto implemented property LastName implicitly creates
    //instance variable for employees last name
    public string LastName { get; set; }

    //Property to get and set employees monthly salary
    public decimal MonthlySalary
    {
        get
        {
            return monthlySalary;
        }//End get
        set
        {
            //validate that value is greater than or equal to 0
            //if not, salary is left unchanged (default = 0)
            if (value >= 0)
                monthlySalary = value;
        } //end set
    }//end property MonthlySalary

    //Constructor to intialize first name, last name, and monthly salary
    public Employee(string first, string last, decimal salary)
    {
        FirstName = first;
        LastName = last;
        MonthlySalary = salary;

    } //End constructor employee
}//End class Employee



