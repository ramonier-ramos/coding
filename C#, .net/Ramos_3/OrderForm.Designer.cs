namespace Ramos_3
{
    partial class frmOrderForm
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
            this.lblWLT = new System.Windows.Forms.Label();
            this.lblCourseRegistration = new System.Windows.Forms.Label();
            this.cmbTermYear = new System.Windows.Forms.ComboBox();
            this.lblTermYear = new System.Windows.Forms.Label();
            this.rdoInState = new System.Windows.Forms.RadioButton();
            this.rdoOutOfState = new System.Windows.Forms.RadioButton();
            this.grbCourses = new System.Windows.Forms.GroupBox();
            this.lblPerCourse = new System.Windows.Forms.Label();
            this.lblPricePerCourse = new System.Windows.Forms.Label();
            this.lblCourses = new System.Windows.Forms.Label();
            this.lblTotalCourses = new System.Windows.Forms.Label();
            this.chbAdvItalian = new System.Windows.Forms.CheckBox();
            this.chbAdvFrench = new System.Windows.Forms.CheckBox();
            this.chbAdvGerman = new System.Windows.Forms.CheckBox();
            this.chbBegItalian = new System.Windows.Forms.CheckBox();
            this.chbBegGerman = new System.Windows.Forms.CheckBox();
            this.chbBegFrench = new System.Windows.Forms.CheckBox();
            this.grbStudentInfo = new System.Windows.Forms.GroupBox();
            this.txtEmailAdd = new System.Windows.Forms.TextBox();
            this.txtLastName = new System.Windows.Forms.TextBox();
            this.txtFirstName = new System.Windows.Forms.TextBox();
            this.lblEmailAdd = new System.Windows.Forms.Label();
            this.lblLastName = new System.Windows.Forms.Label();
            this.lblFirstName = new System.Windows.Forms.Label();
            this.mskStudentID = new System.Windows.Forms.MaskedTextBox();
            this.lblStudentID = new System.Windows.Forms.Label();
            this.grbPaymentType = new System.Windows.Forms.GroupBox();
            this.lblPrice = new System.Windows.Forms.Label();
            this.lblTotalPrice = new System.Windows.Forms.Label();
            this.rdoPersonalCheck = new System.Windows.Forms.RadioButton();
            this.rdoCash = new System.Windows.Forms.RadioButton();
            this.grbStudentResidence = new System.Windows.Forms.GroupBox();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.fileToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.saveToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.clearToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.exitToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.helpToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.aboutToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.picLanguageIsKey = new System.Windows.Forms.PictureBox();
            this.grbCourses.SuspendLayout();
            this.grbStudentInfo.SuspendLayout();
            this.grbPaymentType.SuspendLayout();
            this.grbStudentResidence.SuspendLayout();
            this.menuStrip1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.picLanguageIsKey)).BeginInit();
            this.SuspendLayout();
            // 
            // lblWLT
            // 
            this.lblWLT.AutoSize = true;
            this.lblWLT.Font = new System.Drawing.Font("Aparajita", 20F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblWLT.Location = new System.Drawing.Point(179, 12);
            this.lblWLT.Name = "lblWLT";
            this.lblWLT.Size = new System.Drawing.Size(355, 32);
            this.lblWLT.TabIndex = 1;
            this.lblWLT.Text = "Wilshire Language Training Software";
            // 
            // lblCourseRegistration
            // 
            this.lblCourseRegistration.AutoSize = true;
            this.lblCourseRegistration.Font = new System.Drawing.Font("Aparajita", 20F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCourseRegistration.Location = new System.Drawing.Point(253, 44);
            this.lblCourseRegistration.Name = "lblCourseRegistration";
            this.lblCourseRegistration.Size = new System.Drawing.Size(194, 32);
            this.lblCourseRegistration.TabIndex = 2;
            this.lblCourseRegistration.Text = "Course Registration";
            // 
            // cmbTermYear
            // 
            this.cmbTermYear.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cmbTermYear.FormattingEnabled = true;
            this.cmbTermYear.ItemHeight = 13;
            this.cmbTermYear.Location = new System.Drawing.Point(326, 264);
            this.cmbTermYear.Name = "cmbTermYear";
            this.cmbTermYear.Size = new System.Drawing.Size(121, 21);
            this.cmbTermYear.TabIndex = 7;
            // 
            // lblTermYear
            // 
            this.lblTermYear.AutoSize = true;
            this.lblTermYear.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTermYear.Location = new System.Drawing.Point(348, 234);
            this.lblTermYear.Name = "lblTermYear";
            this.lblTermYear.Size = new System.Drawing.Size(75, 17);
            this.lblTermYear.TabIndex = 6;
            this.lblTermYear.Text = "Term/Year";
            // 
            // rdoInState
            // 
            this.rdoInState.AutoSize = true;
            this.rdoInState.Checked = true;
            this.rdoInState.Cursor = System.Windows.Forms.Cursors.WaitCursor;
            this.rdoInState.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.rdoInState.Location = new System.Drawing.Point(37, 35);
            this.rdoInState.Name = "rdoInState";
            this.rdoInState.Size = new System.Drawing.Size(65, 17);
            this.rdoInState.TabIndex = 0;
            this.rdoInState.TabStop = true;
            this.rdoInState.Text = "In-State ";
            this.rdoInState.UseVisualStyleBackColor = true;
            this.rdoInState.UseWaitCursor = true;
            this.rdoInState.CheckedChanged += new System.EventHandler(this.rdoInState_CheckedChanged);
            this.rdoInState.BindingContextChanged += new System.EventHandler(this.rdoInState_CheckedChanged);
            this.rdoInState.CausesValidationChanged += new System.EventHandler(this.rdoInState_CheckedChanged);
            // 
            // rdoOutOfState
            // 
            this.rdoOutOfState.AutoSize = true;
            this.rdoOutOfState.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.rdoOutOfState.Location = new System.Drawing.Point(37, 62);
            this.rdoOutOfState.Name = "rdoOutOfState";
            this.rdoOutOfState.Size = new System.Drawing.Size(87, 17);
            this.rdoOutOfState.TabIndex = 1;
            this.rdoOutOfState.TabStop = true;
            this.rdoOutOfState.Text = "Out-Of-State ";
            this.rdoOutOfState.UseVisualStyleBackColor = true;
            // 
            // grbCourses
            // 
            this.grbCourses.Controls.Add(this.lblPerCourse);
            this.grbCourses.Controls.Add(this.lblPricePerCourse);
            this.grbCourses.Controls.Add(this.lblCourses);
            this.grbCourses.Controls.Add(this.lblTotalCourses);
            this.grbCourses.Controls.Add(this.chbAdvItalian);
            this.grbCourses.Controls.Add(this.chbAdvFrench);
            this.grbCourses.Controls.Add(this.chbAdvGerman);
            this.grbCourses.Controls.Add(this.chbBegItalian);
            this.grbCourses.Controls.Add(this.chbBegGerman);
            this.grbCourses.Controls.Add(this.chbBegFrench);
            this.grbCourses.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.grbCourses.Location = new System.Drawing.Point(12, 321);
            this.grbCourses.Name = "grbCourses";
            this.grbCourses.Size = new System.Drawing.Size(260, 197);
            this.grbCourses.TabIndex = 4;
            this.grbCourses.TabStop = false;
            this.grbCourses.Text = "Courses";
            // 
            // lblPerCourse
            // 
            this.lblPerCourse.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.lblPerCourse.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblPerCourse.Location = new System.Drawing.Point(103, 154);
            this.lblPerCourse.Name = "lblPerCourse";
            this.lblPerCourse.Size = new System.Drawing.Size(78, 20);
            this.lblPerCourse.TabIndex = 9;
            this.lblPerCourse.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            // 
            // lblPricePerCourse
            // 
            this.lblPricePerCourse.AutoSize = true;
            this.lblPricePerCourse.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblPricePerCourse.Location = new System.Drawing.Point(6, 155);
            this.lblPricePerCourse.Name = "lblPricePerCourse";
            this.lblPricePerCourse.Size = new System.Drawing.Size(89, 13);
            this.lblPricePerCourse.TabIndex = 4;
            this.lblPricePerCourse.Text = "Price Per Course:";
            // 
            // lblCourses
            // 
            this.lblCourses.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.lblCourses.Location = new System.Drawing.Point(103, 115);
            this.lblCourses.Name = "lblCourses";
            this.lblCourses.Size = new System.Drawing.Size(78, 20);
            this.lblCourses.TabIndex = 8;
            this.lblCourses.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            // 
            // lblTotalCourses
            // 
            this.lblTotalCourses.AutoSize = true;
            this.lblTotalCourses.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTotalCourses.Location = new System.Drawing.Point(3, 118);
            this.lblTotalCourses.Name = "lblTotalCourses";
            this.lblTotalCourses.Size = new System.Drawing.Size(75, 13);
            this.lblTotalCourses.TabIndex = 3;
            this.lblTotalCourses.Text = "Total Courses:";
            // 
            // chbAdvItalian
            // 
            this.chbAdvItalian.AutoSize = true;
            this.chbAdvItalian.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.chbAdvItalian.Location = new System.Drawing.Point(121, 85);
            this.chbAdvItalian.Name = "chbAdvItalian";
            this.chbAdvItalian.Size = new System.Drawing.Size(106, 17);
            this.chbAdvItalian.TabIndex = 7;
            this.chbAdvItalian.Text = "Advanced Italian";
            this.chbAdvItalian.UseVisualStyleBackColor = true;
            this.chbAdvItalian.CheckedChanged += new System.EventHandler(this.chbAdvItalian_CheckedChanged);
            // 
            // chbAdvFrench
            // 
            this.chbAdvFrench.AutoSize = true;
            this.chbAdvFrench.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.chbAdvFrench.Location = new System.Drawing.Point(121, 29);
            this.chbAdvFrench.Name = "chbAdvFrench";
            this.chbAdvFrench.Size = new System.Drawing.Size(111, 17);
            this.chbAdvFrench.TabIndex = 5;
            this.chbAdvFrench.Text = "Advanced French";
            this.chbAdvFrench.UseVisualStyleBackColor = true;
            this.chbAdvFrench.CheckedChanged += new System.EventHandler(this.chbAdvFrench_CheckedChanged);
            // 
            // chbAdvGerman
            // 
            this.chbAdvGerman.AutoSize = true;
            this.chbAdvGerman.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.chbAdvGerman.Location = new System.Drawing.Point(121, 57);
            this.chbAdvGerman.Name = "chbAdvGerman";
            this.chbAdvGerman.Size = new System.Drawing.Size(115, 17);
            this.chbAdvGerman.TabIndex = 6;
            this.chbAdvGerman.Text = "Advanced German";
            this.chbAdvGerman.UseVisualStyleBackColor = true;
            this.chbAdvGerman.CheckedChanged += new System.EventHandler(this.chbAdvGerman_CheckedChanged);
            // 
            // chbBegItalian
            // 
            this.chbBegItalian.AutoSize = true;
            this.chbBegItalian.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.chbBegItalian.Location = new System.Drawing.Point(6, 85);
            this.chbBegItalian.Name = "chbBegItalian";
            this.chbBegItalian.Size = new System.Drawing.Size(104, 17);
            this.chbBegItalian.TabIndex = 2;
            this.chbBegItalian.Text = "Beginning Italian";
            this.chbBegItalian.UseVisualStyleBackColor = true;
            this.chbBegItalian.CheckedChanged += new System.EventHandler(this.chbBegItalian_CheckedChanged);
            // 
            // chbBegGerman
            // 
            this.chbBegGerman.AutoSize = true;
            this.chbBegGerman.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.chbBegGerman.Location = new System.Drawing.Point(6, 57);
            this.chbBegGerman.Name = "chbBegGerman";
            this.chbBegGerman.Size = new System.Drawing.Size(113, 17);
            this.chbBegGerman.TabIndex = 1;
            this.chbBegGerman.Text = "Beginning German";
            this.chbBegGerman.UseVisualStyleBackColor = true;
            this.chbBegGerman.CheckedChanged += new System.EventHandler(this.chbBegGerman_CheckedChanged);
            // 
            // chbBegFrench
            // 
            this.chbBegFrench.AutoSize = true;
            this.chbBegFrench.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.chbBegFrench.Location = new System.Drawing.Point(6, 29);
            this.chbBegFrench.Name = "chbBegFrench";
            this.chbBegFrench.Size = new System.Drawing.Size(109, 17);
            this.chbBegFrench.TabIndex = 0;
            this.chbBegFrench.Text = "Beginning French";
            this.chbBegFrench.UseVisualStyleBackColor = true;
            this.chbBegFrench.CheckedChanged += new System.EventHandler(this.chbBegFrench_CheckedChanged);
            // 
            // grbStudentInfo
            // 
            this.grbStudentInfo.Controls.Add(this.txtEmailAdd);
            this.grbStudentInfo.Controls.Add(this.txtLastName);
            this.grbStudentInfo.Controls.Add(this.txtFirstName);
            this.grbStudentInfo.Controls.Add(this.lblEmailAdd);
            this.grbStudentInfo.Controls.Add(this.lblLastName);
            this.grbStudentInfo.Controls.Add(this.lblFirstName);
            this.grbStudentInfo.Controls.Add(this.mskStudentID);
            this.grbStudentInfo.Controls.Add(this.lblStudentID);
            this.grbStudentInfo.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.grbStudentInfo.Location = new System.Drawing.Point(12, 137);
            this.grbStudentInfo.Name = "grbStudentInfo";
            this.grbStudentInfo.Size = new System.Drawing.Size(260, 173);
            this.grbStudentInfo.TabIndex = 3;
            this.grbStudentInfo.TabStop = false;
            this.grbStudentInfo.Text = "Student Information";
            // 
            // txtEmailAdd
            // 
            this.txtEmailAdd.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtEmailAdd.Location = new System.Drawing.Point(103, 125);
            this.txtEmailAdd.Name = "txtEmailAdd";
            this.txtEmailAdd.Size = new System.Drawing.Size(150, 20);
            this.txtEmailAdd.TabIndex = 7;
            this.txtEmailAdd.TextChanged += new System.EventHandler(this.txtEmailAdd_TextChanged);
            // 
            // txtLastName
            // 
            this.txtLastName.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtLastName.Location = new System.Drawing.Point(103, 91);
            this.txtLastName.Name = "txtLastName";
            this.txtLastName.Size = new System.Drawing.Size(150, 20);
            this.txtLastName.TabIndex = 6;
            this.txtLastName.TextChanged += new System.EventHandler(this.txtLastName_TextChanged);
            // 
            // txtFirstName
            // 
            this.txtFirstName.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtFirstName.Location = new System.Drawing.Point(103, 57);
            this.txtFirstName.Name = "txtFirstName";
            this.txtFirstName.Size = new System.Drawing.Size(150, 20);
            this.txtFirstName.TabIndex = 5;
            this.txtFirstName.TextChanged += new System.EventHandler(this.txtFirstName_TextChanged);
            // 
            // lblEmailAdd
            // 
            this.lblEmailAdd.AutoSize = true;
            this.lblEmailAdd.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblEmailAdd.Location = new System.Drawing.Point(6, 130);
            this.lblEmailAdd.Name = "lblEmailAdd";
            this.lblEmailAdd.Size = new System.Drawing.Size(76, 13);
            this.lblEmailAdd.TabIndex = 3;
            this.lblEmailAdd.Text = "Email Address:";
            // 
            // lblLastName
            // 
            this.lblLastName.AutoSize = true;
            this.lblLastName.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblLastName.Location = new System.Drawing.Point(6, 96);
            this.lblLastName.Name = "lblLastName";
            this.lblLastName.Size = new System.Drawing.Size(61, 13);
            this.lblLastName.TabIndex = 2;
            this.lblLastName.Text = "Last Name:";
            // 
            // lblFirstName
            // 
            this.lblFirstName.AutoSize = true;
            this.lblFirstName.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblFirstName.Location = new System.Drawing.Point(6, 62);
            this.lblFirstName.Name = "lblFirstName";
            this.lblFirstName.Size = new System.Drawing.Size(60, 13);
            this.lblFirstName.TabIndex = 1;
            this.lblFirstName.Text = "First Name:";
            // 
            // mskStudentID
            // 
            this.mskStudentID.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.mskStudentID.Location = new System.Drawing.Point(103, 23);
            this.mskStudentID.Mask = "000-00-0000";
            this.mskStudentID.Name = "mskStudentID";
            this.mskStudentID.Size = new System.Drawing.Size(150, 20);
            this.mskStudentID.TabIndex = 4;
            this.mskStudentID.MaskInputRejected += new System.Windows.Forms.MaskInputRejectedEventHandler(this.mskStudentID_MaskInputRejected);
            // 
            // lblStudentID
            // 
            this.lblStudentID.AutoSize = true;
            this.lblStudentID.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblStudentID.Location = new System.Drawing.Point(6, 28);
            this.lblStudentID.Name = "lblStudentID";
            this.lblStudentID.Size = new System.Drawing.Size(61, 13);
            this.lblStudentID.TabIndex = 0;
            this.lblStudentID.Text = "Student ID:";
            // 
            // grbPaymentType
            // 
            this.grbPaymentType.Controls.Add(this.lblPrice);
            this.grbPaymentType.Controls.Add(this.lblTotalPrice);
            this.grbPaymentType.Controls.Add(this.rdoPersonalCheck);
            this.grbPaymentType.Controls.Add(this.rdoCash);
            this.grbPaymentType.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.grbPaymentType.Location = new System.Drawing.Point(299, 321);
            this.grbPaymentType.Name = "grbPaymentType";
            this.grbPaymentType.Size = new System.Drawing.Size(203, 197);
            this.grbPaymentType.TabIndex = 8;
            this.grbPaymentType.TabStop = false;
            this.grbPaymentType.Text = "Type Of Payment";
            // 
            // lblPrice
            // 
            this.lblPrice.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.lblPrice.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblPrice.Location = new System.Drawing.Point(80, 115);
            this.lblPrice.Name = "lblPrice";
            this.lblPrice.Size = new System.Drawing.Size(78, 20);
            this.lblPrice.TabIndex = 3;
            this.lblPrice.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            // 
            // lblTotalPrice
            // 
            this.lblTotalPrice.AutoSize = true;
            this.lblTotalPrice.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTotalPrice.Location = new System.Drawing.Point(13, 118);
            this.lblTotalPrice.Name = "lblTotalPrice";
            this.lblTotalPrice.Size = new System.Drawing.Size(61, 13);
            this.lblTotalPrice.TabIndex = 2;
            this.lblTotalPrice.Text = "Total Price:";
            // 
            // rdoPersonalCheck
            // 
            this.rdoPersonalCheck.AutoSize = true;
            this.rdoPersonalCheck.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.rdoPersonalCheck.Location = new System.Drawing.Point(37, 75);
            this.rdoPersonalCheck.Name = "rdoPersonalCheck";
            this.rdoPersonalCheck.Size = new System.Drawing.Size(100, 17);
            this.rdoPersonalCheck.TabIndex = 1;
            this.rdoPersonalCheck.Text = "Personal Check";
            this.rdoPersonalCheck.UseVisualStyleBackColor = true;
            // 
            // rdoCash
            // 
            this.rdoCash.AutoSize = true;
            this.rdoCash.Checked = true;
            this.rdoCash.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.rdoCash.Location = new System.Drawing.Point(37, 42);
            this.rdoCash.Name = "rdoCash";
            this.rdoCash.Size = new System.Drawing.Size(49, 17);
            this.rdoCash.TabIndex = 0;
            this.rdoCash.TabStop = true;
            this.rdoCash.Text = "Cash";
            this.rdoCash.UseVisualStyleBackColor = true;
            this.rdoCash.CheckedChanged += new System.EventHandler(this.rdoCash_CheckedChanged);
            this.rdoCash.BindingContextChanged += new System.EventHandler(this.rdoCash_CheckedChanged);
            this.rdoCash.CausesValidationChanged += new System.EventHandler(this.rdoCash_CheckedChanged);
            // 
            // grbStudentResidence
            // 
            this.grbStudentResidence.Controls.Add(this.rdoInState);
            this.grbStudentResidence.Controls.Add(this.rdoOutOfState);
            this.grbStudentResidence.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.grbStudentResidence.Location = new System.Drawing.Point(299, 137);
            this.grbStudentResidence.Name = "grbStudentResidence";
            this.grbStudentResidence.Size = new System.Drawing.Size(203, 94);
            this.grbStudentResidence.TabIndex = 5;
            this.grbStudentResidence.TabStop = false;
            this.grbStudentResidence.Text = "Student Residence";
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.fileToolStripMenuItem,
            this.helpToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(534, 24);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // fileToolStripMenuItem
            // 
            this.fileToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.saveToolStripMenuItem,
            this.clearToolStripMenuItem,
            this.exitToolStripMenuItem});
            this.fileToolStripMenuItem.Name = "fileToolStripMenuItem";
            this.fileToolStripMenuItem.ShortcutKeyDisplayString = "";
            this.fileToolStripMenuItem.Size = new System.Drawing.Size(37, 20);
            this.fileToolStripMenuItem.Text = "&File";
            // 
            // saveToolStripMenuItem
            // 
            this.saveToolStripMenuItem.AutoToolTip = true;
            this.saveToolStripMenuItem.Name = "saveToolStripMenuItem";
            this.saveToolStripMenuItem.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.S)));
            this.saveToolStripMenuItem.Size = new System.Drawing.Size(139, 22);
            this.saveToolStripMenuItem.Text = "&Save";
            this.saveToolStripMenuItem.ToolTipText = "To Save Your Order";
            this.saveToolStripMenuItem.Click += new System.EventHandler(this.saveToolStripMenuItem_Click);
            // 
            // clearToolStripMenuItem
            // 
            this.clearToolStripMenuItem.AutoToolTip = true;
            this.clearToolStripMenuItem.Name = "clearToolStripMenuItem";
            this.clearToolStripMenuItem.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Alt | System.Windows.Forms.Keys.C)));
            this.clearToolStripMenuItem.Size = new System.Drawing.Size(139, 22);
            this.clearToolStripMenuItem.Text = "&Clear";
            this.clearToolStripMenuItem.ToolTipText = "To Clear Your Order";
            this.clearToolStripMenuItem.Click += new System.EventHandler(this.clearToolStripMenuItem_Click);
            // 
            // exitToolStripMenuItem
            // 
            this.exitToolStripMenuItem.AutoToolTip = true;
            this.exitToolStripMenuItem.Name = "exitToolStripMenuItem";
            this.exitToolStripMenuItem.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Alt | System.Windows.Forms.Keys.E)));
            this.exitToolStripMenuItem.Size = new System.Drawing.Size(139, 22);
            this.exitToolStripMenuItem.Text = "&Exit";
            this.exitToolStripMenuItem.ToolTipText = "To Exit Your Order";
            this.exitToolStripMenuItem.Click += new System.EventHandler(this.exitToolStripMenuItem_Click);
            // 
            // helpToolStripMenuItem
            // 
            this.helpToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.aboutToolStripMenuItem});
            this.helpToolStripMenuItem.Name = "helpToolStripMenuItem";
            this.helpToolStripMenuItem.Size = new System.Drawing.Size(44, 20);
            this.helpToolStripMenuItem.Text = "&Help";
            // 
            // aboutToolStripMenuItem
            // 
            this.aboutToolStripMenuItem.AutoToolTip = true;
            this.aboutToolStripMenuItem.Name = "aboutToolStripMenuItem";
            this.aboutToolStripMenuItem.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.A)));
            this.aboutToolStripMenuItem.Size = new System.Drawing.Size(149, 22);
            this.aboutToolStripMenuItem.Text = "&About";
            this.aboutToolStripMenuItem.ToolTipText = "About WLT";
            this.aboutToolStripMenuItem.Click += new System.EventHandler(this.aboutToolStripMenuItem_Click);
            // 
            // picLanguageIsKey
            // 
            this.picLanguageIsKey.Image = global::Ramos_3.Properties.Resources.language_is_key;
            this.picLanguageIsKey.Location = new System.Drawing.Point(12, 27);
            this.picLanguageIsKey.Name = "picLanguageIsKey";
            this.picLanguageIsKey.Size = new System.Drawing.Size(150, 94);
            this.picLanguageIsKey.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.picLanguageIsKey.TabIndex = 0;
            this.picLanguageIsKey.TabStop = false;
            // 
            // frmOrderForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(534, 612);
            this.Controls.Add(this.grbStudentResidence);
            this.Controls.Add(this.grbPaymentType);
            this.Controls.Add(this.grbStudentInfo);
            this.Controls.Add(this.grbCourses);
            this.Controls.Add(this.lblTermYear);
            this.Controls.Add(this.cmbTermYear);
            this.Controls.Add(this.lblCourseRegistration);
            this.Controls.Add(this.lblWLT);
            this.Controls.Add(this.picLanguageIsKey);
            this.Controls.Add(this.menuStrip1);
            this.Name = "frmOrderForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "WLT Software Order Form";
            this.Load += new System.EventHandler(this.frmOrderForm_Load);
            this.grbCourses.ResumeLayout(false);
            this.grbCourses.PerformLayout();
            this.grbStudentInfo.ResumeLayout(false);
            this.grbStudentInfo.PerformLayout();
            this.grbPaymentType.ResumeLayout(false);
            this.grbPaymentType.PerformLayout();
            this.grbStudentResidence.ResumeLayout(false);
            this.grbStudentResidence.PerformLayout();
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.picLanguageIsKey)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.PictureBox picLanguageIsKey;
        private System.Windows.Forms.Label lblWLT;
        private System.Windows.Forms.Label lblCourseRegistration;
        private System.Windows.Forms.ComboBox cmbTermYear;
        private System.Windows.Forms.Label lblTermYear;
        private System.Windows.Forms.RadioButton rdoInState;
        private System.Windows.Forms.RadioButton rdoOutOfState;
        private System.Windows.Forms.GroupBox grbCourses;
        private System.Windows.Forms.CheckBox chbAdvItalian;
        private System.Windows.Forms.CheckBox chbAdvFrench;
        private System.Windows.Forms.CheckBox chbAdvGerman;
        private System.Windows.Forms.CheckBox chbBegItalian;
        private System.Windows.Forms.CheckBox chbBegGerman;
        private System.Windows.Forms.CheckBox chbBegFrench;
        private System.Windows.Forms.GroupBox grbStudentInfo;
        private System.Windows.Forms.TextBox txtEmailAdd;
        private System.Windows.Forms.TextBox txtLastName;
        private System.Windows.Forms.TextBox txtFirstName;
        private System.Windows.Forms.Label lblEmailAdd;
        private System.Windows.Forms.Label lblLastName;
        private System.Windows.Forms.Label lblFirstName;
        private System.Windows.Forms.Label lblStudentID;
        private System.Windows.Forms.GroupBox grbPaymentType;
        private System.Windows.Forms.RadioButton rdoPersonalCheck;
        private System.Windows.Forms.RadioButton rdoCash;
        private System.Windows.Forms.GroupBox grbStudentResidence;
        private System.Windows.Forms.Label lblTotalCourses;
        private System.Windows.Forms.Label lblTotalPrice;
        private System.Windows.Forms.MaskedTextBox mskStudentID;
        private System.Windows.Forms.Label lblCourses;
        private System.Windows.Forms.Label lblPrice;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem fileToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem saveToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem clearToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem exitToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem helpToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem aboutToolStripMenuItem;
        private System.Windows.Forms.Label lblPerCourse;
        private System.Windows.Forms.Label lblPricePerCourse;
    }
}

