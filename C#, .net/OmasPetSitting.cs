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
    public partial class OmasPetSitting : Form
    {
        public OmasPetSitting()
        {
            InitializeComponent();
        }

        private void menuToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }

        private void OmasPetSitting_Load(object sender, EventArgs e)
        {
           
        }

        private void label3_Click(object sender, EventArgs e)
        {
            LoginPage myLogin = new LoginPage();

            myLogin.ShowDialog();
        }

        private void label6_Click(object sender, EventArgs e)
        {
            PetRegistration myPet = new PetRegistration();

            myPet.ShowDialog();
        }

        private void label7_Click(object sender, EventArgs e)
        {
            Make_Payment myPayment = new Make_Payment();

            myPayment.ShowDialog();
        }

        private void label8_Click(object sender, EventArgs e)
        {
            ContactUs myContact = new ContactUs();

            myContact.ShowDialog();
        }

        private void label5_Click(object sender, EventArgs e)
        {
            ScheduleAppointments mySchedule = new ScheduleAppointments();

            mySchedule.ShowDialog();
        }

        private void label9_Click(object sender, EventArgs e)
        {
            PrinterFriendlyReport myReport = new PrinterFriendlyReport();

            myReport.ShowDialog();
        }
        
    }
}
