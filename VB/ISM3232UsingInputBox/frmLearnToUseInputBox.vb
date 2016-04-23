Public Class frmLearnToUseInputBox

    Private Sub btnLearnToUseInputBox_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnLearnToUseInputBox.Click
        Dim YourResponse As String
        YourResponse = InputBox("Please type your last name here")
        MsgBox("You typed your last name " & YourResponse)
    End Sub
End Class
