Public Class frmISM3232Assignment1ByRamonierRamos

    Private Sub btnClickMe_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnClickMe.Click
        Dim YourResponse As String
        YourResponse = InputBox("Please type your name here and click ok")
        MsgBox("Hello " & YourResponse)
        MsgBox("Thank you for visiting my assignment1 in ISM3232")
        MsgBox("This is going to be a fun class in which I will learn a lot about programming a computer!")
    End Sub
End Class
