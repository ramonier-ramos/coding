// Programmer: Ramonier Ramos
// Filename: OrderForm.cs
// Due Date: 04/03/2015
// Description: Individual Assignment #3 - OrderForm class file.
//              Accepts orders for language training courses.

// To show the access keys, you may have to press the (Alt) key after the 
// application loads unless you change the settings on your computer. 
// Search Ease of Access Center, go to Make it easier to use keyboard shortcuts,
// then check Underline keyboard shortcuts and access keys

using System;
using System.Linq;
using System.Collections.Generic;
using System.Windows.Forms;

namespace Ramos_3
{
    public partial class frmOrderForm : Form
    {
        // Declare class-level variables
        string StudentID; // Stores a value in student id
        string firstName; // Stores a value in first name
        string lastName; // Stores a value in last name
        string emailAddress; // Stores a value in email address
        double coursePrice; // To hold a total value in course Price
        double price; // To hold a value in course price
        double coursesTotal; // Total number of courses
        string residenceStatus; // The status of a student
        double perCourse; // The price of each course determined by status
        string paymentType; // The type of payment

        // Create a list to store the ordered courses in
        List<string> courses = new List<string>();

        // Constructor
        public frmOrderForm()
        {
            InitializeComponent();
        }// End constructor

        // The email Address input from the user
        private void txtEmailAdd_TextChanged(object sender, EventArgs e)
        {
            emailAddress = txtEmailAdd.Text; // Stores the input into email
        }

        // the Order form 
        private void frmOrderForm_Load(object sender, EventArgs e)
        {
            // Declare and initialize array to populate combo box
            string[] termYear = {"Spring/2015", "Summer/2015", "Fall/2015",
                             "Spring/2016", "Summer/2016", "Fall/2016",
                             "Spring/2017", "Summer/2017", "Fall/2017"};

            // Load the Term Year menu items into the combo box
            for (int i = 0; i < termYear.Length; i++)
                cmbTermYear.Items.Add(termYear[i]);

        }

        // The student ID input text field from user
        private void mskStudentID_MaskInputRejected(object sender, MaskInputRejectedEventArgs e)
        {
            mskStudentID.TextMaskFormat = MaskFormat.IncludeLiterals;
            StudentID = mskStudentID.Text;// Stores the student ID from the text field
        }

        // The first name input text field from user
        private void txtFirstName_TextChanged(object sender, EventArgs e)
        {
            firstName = txtFirstName.Text; // Store the first name of the user
        }

        // The last name input text field from user
        private void txtLastName_TextChanged(object sender, EventArgs e)
        {
            lastName = txtLastName.Text; // Stores the last name of the user
        }

        // Method to update the total courses and total price
        private void UpdateDisplay()
        {
            lblPrice.Text = (coursePrice * coursesTotal).ToString("C");
            lblCourses.Text = coursesTotal.ToString();
            lblPerCourse.Text = perCourse.ToString("C");

            if (coursesTotal >= 4)
            {
                MessageBox.Show("You have exceeded the number of allowed courses and " +
                    "\nyou must reduce your selections to no more than the maximum " +
                    "\nnumber of three before saving the order. "
                    , "Attention", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        // Checkbox for Beginning French course
        private void chbBegFrench_CheckedChanged(object sender, EventArgs e)
        {
            if (chbBegFrench.Checked)
            {
                price += coursePrice; // Increments the cost by one course fee
                coursesTotal += 1; // Increments the total courses by one
                courses.Add("Beginning French"); // Adds to courses list
            }
            else
            {
                price -= coursePrice; // Decrements the cost by one course fee
                coursesTotal -= 1; // Decrements the total courses by one
                courses.Remove("Beginning French"); // Removes from courses list
            }

            UpdateDisplay();
        }

        // Checkbox for Beginning German course
        private void chbBegGerman_CheckedChanged(object sender, EventArgs e)
        {
            if (chbBegGerman.Checked)
            {
                price += coursePrice; // Increments the cost by one course fee
                coursesTotal += 1; // Increments the total courses by one
                courses.Add("Beginning German"); // Adds to courses list
            }
            else
            {
                price -= coursePrice; // Decrements the cost by one course fee
                coursesTotal -= 1; // Decrements the total courses by one
                courses.Remove("Beginning German"); // Removes from courses list
            }

            UpdateDisplay();

        }

        // Checkbox for Beginning Italian course
        private void chbBegItalian_CheckedChanged(object sender, EventArgs e)
        {
            if (chbBegItalian.Checked)
            {
                price += coursePrice; // Increments the cost by one course fee
                coursesTotal += 1; // Increments the total courses by one
                courses.Add("Beginning Italian"); // Adds to courses list
            }
            else
            {
                price -= coursePrice; // Decrements the costs by one course fee
                coursesTotal -= 1; // Decrements the total courses by one
                courses.Remove("Beginning Italian"); // Removes from courses list
            }

            UpdateDisplay();

        }

        // Checkbox for Advanced French course
        private void chbAdvFrench_CheckedChanged(object sender, EventArgs e)
        {

            if (chbAdvFrench.Checked)
            {
                price += coursePrice; // Increments the cost by one course fee
                coursesTotal += 1; // Increments the total courses by one
                courses.Add("Advanced French"); // Adds to courses list
            }
            else
            {
                price -= coursePrice; // Decrements the cost by one course fee
                coursesTotal -= 1; // Decrements the total courses by one
                courses.Remove("Advanced French"); // Removes from courses list
            }

            UpdateDisplay();
        }

        // Checkbox for Advanced German course
        private void chbAdvGerman_CheckedChanged(object sender, EventArgs e)
        {
            if (chbAdvGerman.Checked)
            {
                price += coursePrice; // Increments the cost by one course fee
                coursesTotal += 1; // Increments the total courses by one
                courses.Add("Advanced German"); // Adds to courses list
            }
            else
            {
                price -= coursePrice; // Decrements the cost by one course fee
                coursesTotal -= 1; // Decrements the total courses by one 
                courses.Remove("Advanced German"); // Removes from courses list
            }

            UpdateDisplay();
        }

        // Checkbox for Advanced Italian course
        private void chbAdvItalian_CheckedChanged(object sender, EventArgs e)
        {
            if (chbAdvItalian.Checked)
            {
                price += coursePrice; // Increments the cost by one course fee
                coursesTotal += 1; // Increments the total courses by one
                courses.Add("Advanced Italian"); // Adds to courses list
            }
            else
            {
                price -= coursePrice; // Decrements the cost by one course fee
                coursesTotal -= 1; // Decrements the total courses by one
                courses.Remove("Advanced Italian"); // Removes from courses list
            }

            UpdateDisplay();

        }

        // The save menu item saves the order
        private void saveToolStripMenuItem_Click(object sender, EventArgs e)
        {
            // Declare local variables
            bool continueLoop = true; 

            do
            {
                // Display the order for the student
                if (coursesTotal < 1 || coursesTotal > 3) // Validates that the courses are >= 1 and <= 3
                {
                    MessageBox.Show("A course order must contain at least one course but " +
                    "\nno more than three courses. ", "Problem encountered", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                    continueLoop = true;
                }

                if (mskStudentID.Text.Length != 11 || txtFirstName.Text.Length == 0 || txtLastName.Text.Length == 0)
                {
                    MessageBox.Show("Your Student ID as well as your first and last names needs to be " +
                    "fully completed.", "Problem encountered", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                    continueLoop = true;
                }

                //} while (continueLoop == false);

                if (cmbTermYear.SelectedIndex == -1)
                {
                    MessageBox.Show("Please choose a term and year to register for. ", "Empty Registration Term",
                        MessageBoxButtons.OK, MessageBoxIcon.Error);
                    continueLoop = true;
                }

            } while (continueLoop == false);

            if (coursesTotal >= 1 && coursesTotal <= 3)
            {
                if (mskStudentID.Text.Length == 11 && txtFirstName.Text.Length != 0 && txtLastName.Text.Length != 0)
                {
                    MessageBox.Show("Summary of your order: " +
                       "\n-------------------------- " +
                       "\nRegistration Term/Year:     " + cmbTermYear.Text +
                       "\nStudent ID:     " + mskStudentID.Text +
                       "\nStudent Name:     " + txtFirstName.Text + " " + txtLastName.Text +
                       "\nEmail Address:     " + txtEmailAdd.Text +
                       "\nResidence Status:     " + residenceStatus +
                       "\nTotal Courses Purchased:     " + coursesTotal +
                       "\nPrice Per Course:     " + lblPerCourse.Text +
                       "\nTotal Order Price:     " + lblPrice.Text +
                       "\nPayment Type:     " + paymentType, "Course Registration Order", MessageBoxButtons.OK,
                       MessageBoxIcon.Information);

                    // Create an array to input the list into
                    string[] array = courses.ToArray();
                    string output = string.Join("\n", array);// Join the courses to show them into a single message box
                    MessageBox.Show("The course(s) you have registered for are:\n" +
                        (output), "Ordered Courses", MessageBoxButtons.OK, MessageBoxIcon.Information);

                } // end if

            }// end if

        }// End save menu item

        // Create radio buttons to determine the type of payment
        // the student wants to use
        private void rdoCash_CheckedChanged(object sender, EventArgs e)
        {
            if (rdoCash.Checked)
            {
                paymentType = "Cash"; // Stores Cash into variable paymentType
            }
            else
            {
                paymentType = ("Personal Check"); // Stores Personal check into variable paymentType 
            }

        }// End Cash radio button

        // clear menu item to clear all fields
        private void clearToolStripMenuItem_Click(object sender, EventArgs e)
        {
            mskStudentID.Text = ""; // Clears the student ID field
            txtFirstName.Text = ""; // Clears the first name field
            txtLastName.Text = ""; // Clears the last name field
            txtEmailAdd.Text = ""; // Clears the email address field
            rdoInState.Select();    // Sets the default radio button to in state
            rdoCash.Select();   // Set the default radio button to cash
            cmbTermYear.SelectedIndex = -1; // Clears the combobox
            chbBegFrench.Checked = false; // Clears the beginning french checkbox
            chbBegGerman.Checked = false; // Clears the beginning german checkbox
            chbBegItalian.Checked = false; // Clears the beginning italian checkbox
            chbAdvFrench.Checked = false; // Clears the advanced french checkbox
            chbAdvGerman.Checked = false; // Clears the advanced german checkbox
            chbAdvItalian.Checked = false; // Clears the advanced italian checkbox
            lblCourses.Text = ""; // Clears the number of courses registered for field
            lblPerCourse.Text = ""; // Clears the price per course field
            lblPrice.Text = ""; // Clears the total price field
            mskStudentID.Focus(); // Returns focus to the first input field

        }// End clear menu

        // Exit menu item to exit application
        private void exitToolStripMenuItem_Click(object sender, EventArgs e)
        {
            DialogResult dialogResult = MessageBox.Show("Are you sure you want to exit?  ", "Exit the Order Form",
                MessageBoxButtons.YesNo, MessageBoxIcon.Warning); // Asks the user if they are sure they want to exit the application

            if (dialogResult == DialogResult.Yes) // If the user presses yes, the app exits
            {
                this.Close(); // Closes the order form
            }
 
        }// End exit menu

        // The about menu item to show about information of WLT
        private void aboutToolStripMenuItem_Click(object sender, EventArgs e)
        {
            // Create an instance of the AboutForm form class
            AboutForm myAboutForm = new AboutForm();

            // Display AboutForm instance
            myAboutForm.ShowDialog();

        }// End about form

        // Method for residency status
        private void rdoInState_CheckedChanged(object sender, EventArgs e)
        {
            // Declare constants
            const double IN_STATE_PRICE = 79.00; // In State fee
            const double OUT_OF_STATE_PRICE = 99.00;// Out of state fee

            if (rdoInState.Checked) // In state radio button
            {
                coursePrice = IN_STATE_PRICE; // Stores the course price in coursePrice
                residenceStatus = "In-State Residency"; // Stores the type of residence status
                perCourse = IN_STATE_PRICE; // Holds the coursePrice into perCourse
                UpdateDisplay(); // To update the label fields
            }
            else if (rdoOutOfState.Checked) // Out of state radio button
            {
                coursePrice = OUT_OF_STATE_PRICE; // Stores the course price in coursePrice
                residenceStatus = "Out-of-state Residency"; // Stores the type of residence status
                perCourse = OUT_OF_STATE_PRICE; // Holds the coursePrice into perCourse
                UpdateDisplay(); // To update the label fields
            }

        }// End in-state radio button

    }// End public partial class frmOrderForm:form

}// End namespace Ramos_3


