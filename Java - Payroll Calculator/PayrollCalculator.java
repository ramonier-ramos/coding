//Lab 1 PayrollCalculator
// Filename: Payroll Calculator.java
import javax.swing.JOptionPane; // required for dialog boxes

public class PayrollCalculator
{
   public static void main(String[] args)
   {
      //Declare constants and assign values
      final double INCOME_TAX_RATE = 0.20; // Federal income tax rate
      final double STANDARD_EXEMPTION = 5000.00;  // Standard income exempt from tax
      final double DEPENDENT_EXEMPTION = 2000.00; // Income exempt from tax per dependent
      
      //Declare variables
      String names;  //Employees first and last names
      String socialSecurityNumber; //Employees social security number
      String input;  // Input from JOPtionPane box, prior to type conversion
      double annualSalary; //Employees annual salary
      double annualBonus; //Employees expected annual bonus
      double annualIncome; //Employees annual income (salary + bonus)
      double taxableIncome; //Employees taxable income(annual income- exemptions)
      double taxOwed; //Employees tax owed (taxable income * tax rate)
      double weeklyPay; //Employees weekly pay ((annual income - tax) / 52 weeks)
      int dependents; //Number of employee dependents
      
      // Get name
      names = JOptionPane.showInputDialog("Enter Name (First and Last: ");
      
      //Get social security number
      socialSecurityNumber = JOptionPane.showInputDialog("Enter Social Security Number: ");
      
      //Get annual salary
      input = JOptionPane.showInputDialog("Enter Annual Salary: ");
      annualSalary = Double.parseDouble(input);
      
      //Get expeted bonus
      input = JOptionPane.showInputDialog("Enter Expected Annual Bonus: ");
      annualBonus = Double.parseDouble(input);
      
      //Get number of dependents
      input = JOptionPane.showInputDialog("Enter Number of Dependents: ");
      dependents = Integer.parseInt(input);
      
      // Calculate annual income
      annualIncome = annualSalary + annualBonus;
      
      //Calculate taxable income
      taxableIncome = annualIncome - (STANDARD_EXEMPTION + (dependents * DEPENDENT_EXEMPTION));
      
      //Calculate tax owed
      taxOwed = taxableIncome * INCOME_TAX_RATE;
      
      // Calculate weekly pay
      weeklyPay = (annualIncome - taxOwed) / 52; 
      
      //Display summary Information
      JOptionPane.showMessageDialog(null, "INCOME REPORT\n" + 
                                                   "Name: " + names+ "\n" +
                                                   "SSN: " + socialSecurityNumber + "\n" +
                                                   "Annual Salary: " + annualSalary + "\n" +
                                                   "Annual Bonus: " + annualBonus + "\n" +
                                                   "Annual Income; " + annualIncome + "\n" +
                                                   "Number of Dependents: " + dependents + "\n" + 
                                                   "Taxable Income: " + taxableIncome + "\n" +
                                                   "Tax Owed: " + taxOwed + "\n" +
                                                   "Weekly Pay: " + weeklyPay);
                                                  
  //End Program
  System.exit(0);
  }
  }
      
 
      