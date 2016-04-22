using System;
using System.Data;
using System.Data.Entity;
using System.Data.Entity.Validation;
using System.Linq;
using System.Windows.Forms;

namespace Problem_22_1
{
    public partial class BaseballPlayers : Form
    {
        public BaseballPlayers()
        {
            InitializeComponent();
        }

        // Entity Framework DbContext
        private Problem_22_1.BaseballEntities dbcontext = null;

        // Custom method to fill binding source
        public void RefreshPlayers()
        {
            // Dispose old DbContext, if any
            if (dbcontext != null)
                dbcontext.Dispose();

            // Create new DbContext to reorder records based on edits
            dbcontext = new Problem_22_1.BaseballEntities();

            // Load Players table into memory
            dbcontext.Players.Load();

            // Specify data source for the binding source
            playerBindingSource.DataSource = dbcontext.Players.Local;

            // Clear text boxes
            lastNameTextBox.Clear();
            battingAverageTextBox.Clear();

        }// End method RefreshPlayers


        private void BaseballPlayers_Load(object sender, EventArgs e)
        {

        }

        private void baseballEntitiesBindingNavigator_RefreshItems(object sender, EventArgs e)
        {
        
        }

        private void BaseballPlayers_Load_1(object sender, EventArgs e)
        {
            // Call custom method
            RefreshPlayers();

        }

        private void SearchNameButton_Click(object sender, EventArgs e)
        {

        }
    }
}
