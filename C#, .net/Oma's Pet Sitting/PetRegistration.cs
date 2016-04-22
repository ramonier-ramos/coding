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
    public partial class PetRegistration : Form
    {
        public PetRegistration()
        {
            InitializeComponent();
        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {
            Pet_Registration myDog = new Pet_Registration();

            myDog.ShowDialog();
        }
    }
}
