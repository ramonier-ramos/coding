Public Class frmAssignment3

    Private Sub btnPrimeNumbers_Click(sender As System.Object, e As System.EventArgs) Handles btnPrimeNumbers.Click
        Dim PrimeNumber(4) As Short  'Note: Since prime numbers are numbers, you should not use a String data type, but a number data type, such as Short
        PrimeNumber(1) = 1
        PrimeNumber(2) = 2
        PrimeNumber(3) = 3
        PrimeNumber(4) = 5

        Dim Counter As Integer
        For Counter = 1 To 4
            MsgBox("Prime Number # " & Counter & " is " & (PrimeNumber(Counter)))
        Next

        ReDim Preserve PrimeNumber(8)  'Note the use of the Preserve keyword to ensure that the values for index values 1 through 4 are not lost.
        PrimeNumber(5) = 7
        PrimeNumber(6) = 11
        PrimeNumber(7) = 13
        PrimeNumber(8) = 17

        Counter = 1
        Do Until Counter > 8
            MsgBox("Prime Number # " & Counter & " is " & (PrimeNumber(Counter)))
            Counter = Counter + 1
        Loop
    End Sub


    Private Sub btnIfStatement_Click(sender As System.Object, e As System.EventArgs) Handles btnIfStatement.Click
        Dim Weight As Single
        Dim Height As Single
        Dim BMI As Single
        Weight = InputBox("Please enter your weight in lbs")
        Height = InputBox("Please enter your height in inches")
        BMI = Weight * 703 / (Height ^ 2)
        MsgBox("Your BMI is " & BMI)
        If BMI < 18.5 Then
            MsgBox("You are underweight")
        ElseIf BMI < 25 Then
            MsgBox("Your weight is normal")
        ElseIf BMI < 30 Then
            MsgBox("You are overweight")
        Else
            MsgBox("You are obese")
        End If
    End Sub

    Private Sub btnSelectCaseStatement_Click(sender As System.Object, e As System.EventArgs) Handles btnSelectCaseStatement.Click
        Dim Weight As Single
        Dim Height As Single
        Dim BMI As Single
        Weight = InputBox("Please enter your weight in lbs")
        Height = InputBox("Please enter your height in inches")
        BMI = Weight * 703 / (Height ^ 2)
        MsgBox("Your BMI is " & BMI)
        Select Case BMI
            Case Is < 18.5
                MsgBox("You are underweight")
            Case Is < 25
                MsgBox("Your weight is normal")
            Case Is < 30
                MsgBox("You are overweight")
            Case Else
                MsgBox("You are obese")
        End Select
    End Sub
End Class
