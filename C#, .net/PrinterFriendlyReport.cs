using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Oma_s_Pet_Sitting
{
    public partial class PrinterFriendlyReport : Form
    {
        public PrinterFriendlyReport()
        {
            InitializeComponent();
        }

        private void GoBack_Click(object sender, EventArgs e)
        {
            this.Close();
            OmasPetSitting myPet = new OmasPetSitting();
           myPet.ShowDialog();
            
           
        }

        private void PrinterFriendlyReport_Load(object sender, EventArgs e)
        {

        }

        private void label35_Click(object sender, EventArgs e)
        {

        }
    }
}
