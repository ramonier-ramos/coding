Public Class frmLearnAboutConstants

    Private Sub btnLearnAboutButtons_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnLearnAboutButtons.Click
        'What are constants?
        'A constant is just a value. It can be a numeric value, such as 5. Or it can be a string value, such as "John"
        '5 is an example of a numeric constant.  "John is an example of a string constant.
        'These values can also be given names or symbols
        'for example if 5 represents lets say the sales tax rate. We can define a symbolic constant called SalesTaxRate and assign it a value of 5
        'Similarly, if John is a first name, we can define a symbolic constant called firstName and assign it a value of "John"
        'They are called constant because their values are fixed.  Once the sales tax rate has been assigned a value of 5, it cannot be changed during a program
        'So how do we declare or define a symbolic constant?
        Const SalesTaxRate As Short = 5
        Const FirstName As String = "John"
        MsgBox("The Sales tax rate is " & SalesTaxRate)
        MsgBox("The fist name is " & FirstName)

    End Sub
End Class
