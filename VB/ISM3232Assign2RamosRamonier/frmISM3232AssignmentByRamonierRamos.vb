Public Class frmISM3232AssignmentByRamonierRamos

    Private Sub btnDisplayAge_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnDisplayAge.Click
        Const YearOfBirth As Single = 2014
        Dim Age As Single

        Age = YearOfBirth - txtYearofBirth.Text


        MsgBox("Dear " & txtFirstName.Text & ", you are approximately " & Age & " years old ")



        













    End Sub

    Private Sub btnDisplaySalesTax_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnDisplaySalesTax.Click


        Const SalesTaxRate As Single = 0.07
        Dim SalesTax As Single

        SalesTax = SalesTaxRate * txtSales.Text

        MsgBox("Your sales tax is: " & Format(SalesTax, "Currency"))





    End Sub
End Class
