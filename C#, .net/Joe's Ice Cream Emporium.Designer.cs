namespace Joes_Ice_Cream_Emporium
{
    partial class frmJoesIceCream
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmJoesIceCream));
            this.picIceCream = new System.Windows.Forms.PictureBox();
            this.lblConeType = new System.Windows.Forms.Label();
            this.rdoSugarCone = new System.Windows.Forms.RadioButton();
            this.rdoWaffleCone = new System.Windows.Forms.RadioButton();
            this.lblIceCreamFlavor = new System.Windows.Forms.Label();
            this.cbbVanilla = new System.Windows.Forms.ComboBox();
            this.lblToppings = new System.Windows.Forms.Label();
            this.lbxToppings = new System.Windows.Forms.ListBox();
            this.btnSave = new System.Windows.Forms.Button();
            this.btnExit = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.picIceCream)).BeginInit();
            this.SuspendLayout();
            // 
            // picIceCream
            // 
            this.picIceCream.Image = ((System.Drawing.Image)(resources.GetObject("picIceCream.Image")));
            this.picIceCream.Location = new System.Drawing.Point(99, 12);
            this.picIceCream.Name = "picIceCream";
            this.picIceCream.Size = new System.Drawing.Size(125, 126);
            this.picIceCream.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.picIceCream.TabIndex = 0;
            this.picIceCream.TabStop = false;
            // 
            // lblConeType
            // 
            this.lblConeType.AutoSize = true;
            this.lblConeType.Location = new System.Drawing.Point(42, 160);
            this.lblConeType.Name = "lblConeType";
            this.lblConeType.Size = new System.Drawing.Size(62, 13);
            this.lblConeType.TabIndex = 1;
            this.lblConeType.Text = "Cone Type:";
            // 
            // rdoSugarCone
            // 
            this.rdoSugarCone.AutoSize = true;
            this.rdoSugarCone.Location = new System.Drawing.Point(110, 156);
            this.rdoSugarCone.Name = "rdoSugarCone";
            this.rdoSugarCone.Size = new System.Drawing.Size(81, 17);
            this.rdoSugarCone.TabIndex = 2;
            this.rdoSugarCone.TabStop = true;
            this.rdoSugarCone.Text = "Sugar Cone";
            this.rdoSugarCone.UseVisualStyleBackColor = true;
            // 
            // rdoWaffleCone
            // 
            this.rdoWaffleCone.AutoSize = true;
            this.rdoWaffleCone.Location = new System.Drawing.Point(197, 156);
            this.rdoWaffleCone.Name = "rdoWaffleCone";
            this.rdoWaffleCone.Size = new System.Drawing.Size(84, 17);
            this.rdoWaffleCone.TabIndex = 3;
            this.rdoWaffleCone.TabStop = true;
            this.rdoWaffleCone.Text = "Waffle Cone";
            this.rdoWaffleCone.UseVisualStyleBackColor = true;
            // 
            // lblIceCreamFlavor
            // 
            this.lblIceCreamFlavor.AutoSize = true;
            this.lblIceCreamFlavor.Location = new System.Drawing.Point(27, 195);
            this.lblIceCreamFlavor.Name = "lblIceCreamFlavor";
            this.lblIceCreamFlavor.Size = new System.Drawing.Size(90, 13);
            this.lblIceCreamFlavor.TabIndex = 4;
            this.lblIceCreamFlavor.Text = "Ice Cream Flavor:";
            // 
            // cbbVanilla
            // 
            this.cbbVanilla.FormattingEnabled = true;
            this.cbbVanilla.Location = new System.Drawing.Point(123, 192);
            this.cbbVanilla.Name = "cbbVanilla";
            this.cbbVanilla.Size = new System.Drawing.Size(109, 21);
            this.cbbVanilla.TabIndex = 5;
            this.cbbVanilla.Text = "Vanilla";
            this.cbbVanilla.SelectedIndexChanged += new System.EventHandler(this.cbbVanilla_SelectedIndexChanged);
            // 
            // lblToppings
            // 
            this.lblToppings.AutoSize = true;
            this.lblToppings.Location = new System.Drawing.Point(63, 233);
            this.lblToppings.Name = "lblToppings";
            this.lblToppings.Size = new System.Drawing.Size(54, 13);
            this.lblToppings.TabIndex = 6;
            this.lblToppings.Text = "Toppings:";
            // 
            // lbxToppings
            // 
            this.lbxToppings.DisplayMember = "Chopped Nuts";
            this.lbxToppings.FormattingEnabled = true;
            this.lbxToppings.Items.AddRange(new object[] {
            "Chopped Nuts",
            "Chocolate Chips",
            "Marshmallows",
            "Candy Sprinkles",
            "Cinnamon Dots",
            "Gummy Stars"});
            this.lbxToppings.Location = new System.Drawing.Point(123, 233);
            this.lbxToppings.Name = "lbxToppings";
            this.lbxToppings.Size = new System.Drawing.Size(109, 82);
            this.lbxToppings.TabIndex = 7;
            // 
            // btnSave
            // 
            this.btnSave.Location = new System.Drawing.Point(68, 332);
            this.btnSave.Name = "btnSave";
            this.btnSave.Size = new System.Drawing.Size(75, 23);
            this.btnSave.TabIndex = 8;
            this.btnSave.Text = "Save";
            this.btnSave.UseVisualStyleBackColor = true;
            // 
            // btnExit
            // 
            this.btnExit.Location = new System.Drawing.Point(185, 332);
            this.btnExit.Name = "btnExit";
            this.btnExit.Size = new System.Drawing.Size(75, 23);
            this.btnExit.TabIndex = 9;
            this.btnExit.Text = "Exit";
            this.btnExit.UseVisualStyleBackColor = true;
            // 
            // frmJoesIceCream
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(315, 376);
            this.Controls.Add(this.btnExit);
            this.Controls.Add(this.btnSave);
            this.Controls.Add(this.lbxToppings);
            this.Controls.Add(this.lblToppings);
            this.Controls.Add(this.cbbVanilla);
            this.Controls.Add(this.lblIceCreamFlavor);
            this.Controls.Add(this.rdoWaffleCone);
            this.Controls.Add(this.rdoSugarCone);
            this.Controls.Add(this.lblConeType);
            this.Controls.Add(this.picIceCream);
            this.Name = "frmJoesIceCream";
            this.Text = "Joe\'s Ice Cream Emporium";
            ((System.ComponentModel.ISupportInitialize)(this.picIceCream)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.PictureBox picIceCream;
        private System.Windows.Forms.Label lblConeType;
        private System.Windows.Forms.RadioButton rdoSugarCone;
        private System.Windows.Forms.RadioButton rdoWaffleCone;
        private System.Windows.Forms.Label lblIceCreamFlavor;
        private System.Windows.Forms.ComboBox cbbVanilla;
        private System.Windows.Forms.Label lblToppings;
        private System.Windows.Forms.ListBox lbxToppings;
        private System.Windows.Forms.Button btnSave;
        private System.Windows.Forms.Button btnExit;
    }
}

