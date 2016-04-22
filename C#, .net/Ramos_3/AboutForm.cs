// Programmer: Ramonier Ramos
// Filename: AboutForm.cs
// Due Date: 04/03/2015
// Description: Individual Assignment #3 - AboutForm class file.
//              Shows information about the OrderForm.

using System;
using System.Windows.Forms;

namespace Ramos_3
{
    public partial class AboutForm : Form
    {
        public AboutForm()
        {
            InitializeComponent();
        }

        // Close button to close form
        private void btnClose_Click(object sender, EventArgs e)
        {
            this.Close();// Closes the form
        }

        // Loads the about form
        private void AboutForm_Load(object sender, EventArgs e)
        {
          

        }
    }
}
