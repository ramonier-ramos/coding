namespace ValidateInputUsingTryParse
{
    partial class frmTestScoreValidate
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
            this.lblEnterATestScore = new System.Windows.Forms.Label();
            this.txtScore = new System.Windows.Forms.TextBox();
            this.btnValidate = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lblEnterATestScore
            // 
            this.lblEnterATestScore.AutoSize = true;
            this.lblEnterATestScore.Location = new System.Drawing.Point(111, 70);
            this.lblEnterATestScore.Name = "lblEnterATestScore";
            this.lblEnterATestScore.Size = new System.Drawing.Size(145, 13);
            this.lblEnterATestScore.TabIndex = 0;
            this.lblEnterATestScore.Text = "Enter a test score to validate:";
            // 
            // txtScore
            // 
            this.txtScore.Location = new System.Drawing.Point(151, 98);
            this.txtScore.Name = "txtScore";
            this.txtScore.Size = new System.Drawing.Size(65, 20);
            this.txtScore.TabIndex = 1;
            // 
            // btnValidate
            // 
            this.btnValidate.Location = new System.Drawing.Point(142, 138);
            this.btnValidate.Name = "btnValidate";
            this.btnValidate.Size = new System.Drawing.Size(84, 25);
            this.btnValidate.TabIndex = 2;
            this.btnValidate.Text = "Validate";
            this.btnValidate.UseVisualStyleBackColor = true;
            this.btnValidate.Click += new System.EventHandler(this.btnValidate_Click);
            // 
            // frmTestScoreValidate
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(374, 243);
            this.Controls.Add(this.btnValidate);
            this.Controls.Add(this.txtScore);
            this.Controls.Add(this.lblEnterATestScore);
            this.Name = "frmTestScoreValidate";
            this.Text = "Test Score Validation";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblEnterATestScore;
        private System.Windows.Forms.TextBox txtScore;
        private System.Windows.Forms.Button btnValidate;
    }
}

