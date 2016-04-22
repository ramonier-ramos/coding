using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.Entity;
using System.Data.Entity.Validation;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Problem_22_1
{
    public partial class CustomerEntry : Form
    {
        public CustomerEntry()
        {
            InitializeComponent();
        }


        // Entity Framework DbContext
        private Problem_22_1.AcmeEntities dbcontext = new Problem_22_1.AcmeEntities();

        // Fill customerBindingSource with all rows, ordered by company name
        private void RefreshCompanyName()
        {
            // Dispose old DbContext, if any
            if (dbcontext != null)
                dbcontext.Dispose();

            // Create new DbContext to reorder records based on edits
            dbcontext = new Problem_22_1.AcmeEntities();

            // Use LINQ to to order customer table by CustNo
            dbcontext.Customers
                .OrderBy(customer => customer.CustNo)
                //.Where(employee => employee.JobTitle.Equals("Salesperson"))
                .Load();

            // Specify data sources for the two binding sources
            customerBindingSource.DataSource = dbcontext.Customers.Local;
            //employeeBindingSource.DataSource = dbcontext.Employees.Local;
            customerBindingSource.MoveFirst(); // Go to first result
           // employeeBindingSource.MoveFirst(); // Go to first result
           // CompanyNameSearchTextBox.Clear(); // Clear the search company name textbox

        } // End method RefreshCompanyName
        private void CustomerEntry_Load(object sender, EventArgs e)
        {

            RefreshCompanyName();

           // CompanyNameSearchTextBox.Focus(); // Set the focus to the search textbox
        }
    }
}
