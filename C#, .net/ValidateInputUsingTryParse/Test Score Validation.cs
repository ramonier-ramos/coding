// Programmer: Ramonier Ramos

using System;
using System.Windows.Forms;

namespace ValidateInputUsingTryParse
{
    public partial class frmTestScoreValidate : Form
    {
        public frmTestScoreValidate()
        {
            InitializeComponent();
        }

      // Validate the test score entered by the user
      // * First, check for null or non-numeric entry with TryParse
      // * Second, check that the numeric value is within a valid range
      private void btnValidate_Click(object sender, EventArgs e)
      {
         // Declare integer variable for storing test score
         int testScore;

         if (int.TryParse(txtScore.Text, out testScore))
         {
            if (testScore >= 0 && testScore <= 100)
            {
               // Continue to process the input (correct data)
               MessageBox.Show("The test score entered is acceptable.");
            }
            else
            {
               MessageBox.Show("The test score must be in the range 0 - 100.");
            }
         }
         else
         {
            MessageBox.Show("The test score must be an integer.");
         }

         // Return focus to the text box, preparatory to another validation
         txtScore.Focus();
      }
   }
}

