Public Class frmISM3232Assign3RamosRamonier

    Private Sub btnPrimeNumberArray_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnPrimeNumberArray.Click
        Do

            Dim PrimeNumberArray As Single
            PrimeNumberArray = 1
            PrimeNumberArray = 2
            PrimeNumberArray = 3
            PrimeNumberArray = 5

            Dim PrimeNumberArray1 As Single
            Dim PrimeNumberArray2 As Single
            Dim PrimeNumberArray3 As Single
            Dim PrimeNumberArray4 As Single
            PrimeNumberArray1 = 1
            PrimeNumberArray2 = 2
            PrimeNumberArray3 = 3
            PrimeNumberArray4 = 5

            Dim PrimeNumberArrays(4) As Single
            PrimeNumberArrays(1) = 1
            PrimeNumberArrays(2) = 2
            PrimeNumberArrays(3) = 3
            PrimeNumberArrays(4) = 5


            MsgBox("Prime Number #1 is " & PrimeNumberArray1)
            MsgBox("Prime Number #2 is " & PrimeNumberArray2)
            MsgBox("Prime Number #3 is " & PrimeNumberArray3)
            MsgBox("Prime Number #4 is " & PrimeNumberArray4)












            Dim PrimeNumber As Single
            PrimeNumber = 1
            PrimeNumber = 2
            PrimeNumber = 3
            PrimeNumber = 5
            PrimeNumber = 7
            PrimeNumber = 11
            PrimeNumber = 13
            PrimeNumber = 17


            Dim PrimeNumber1 As Single
            Dim PrimeNumber2 As Single
            Dim PrimeNumber3 As Single
            Dim PrimeNumber4 As Single
            Dim PrimeNumber5 As Single
            Dim PrimeNumber6 As Single
            Dim PrimeNumber7 As Single
            Dim PrimeNumber8 As Single
            PrimeNumber1 = 1
            PrimeNumber2 = 2
            PrimeNumber3 = 3
            PrimeNumber4 = 5
            PrimeNumber5 = 7
            PrimeNumber6 = 11
            PrimeNumber7 = 13
            PrimeNumber8 = 17

            Dim PrimeNumbers(8) As Single
            PrimeNumbers(1) = 1
            PrimeNumbers(2) = 2
            PrimeNumbers(3) = 3
            PrimeNumbers(4) = 5
            PrimeNumbers(5) = 7
            PrimeNumbers(6) = 11
            PrimeNumbers(7) = 13
            PrimeNumbers(8) = 17

            MsgBox("Prime Number #1 is " & PrimeNumber1)
            MsgBox("Prime Number #2 is " & PrimeNumber2)
            MsgBox("Prime Number #3 is " & PrimeNumber3)
            MsgBox("Prime Number #4 is " & PrimeNumber4)
            MsgBox("Prime Number #5 is " & PrimeNumber5)
            MsgBox("Prime Number #6 is " & PrimeNumber6)
            MsgBox("Prime Number #7 is " & PrimeNumber7)
            MsgBox("Prime Number #8 is " & PrimeNumber8)
            End
        Loop






































    End Sub

    Private Sub btnBMIandIFStatement_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnBMIandIFStatement.Click


        Dim Weight As Single
        Weight = InputBox("Please enter your weight in lbs")
        Dim Height As Single
        Height = InputBox("Please enter your height in inches")
        MsgBox("Your BMI is " & Weight * 703 / (Height * Height))

        Dim BMI As Single

        BMI = (Weight * 703 / (Height * Height))

        If (BMI >= 30) Then
            MsgBox("You are Obese")

        ElseIf (BMI <= 30 >= 25) Then
            MsgBox("You are Overweight")

        ElseIf (BMI >= 25) Then
            MsgBox("You are Overweight")


        ElseIf (BMI < 25) Then
            MsgBox("You are Normal Weight")


        ElseIf (BMI >= 18.5) Then
            MsgBox("You are Normal Weight")


        ElseIf (BMI < 18.5) Then
            MsgBox("You are Underweight")
        End If










    End Sub

    Private Sub btnBMIandSelectCaseStatement_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnBMIandSelectCaseStatement.Click
        Dim Weight As Single
        Weight = InputBox("Please enter your weight in lbs")
        Dim Height As Single
        Height = InputBox("Please enter your height in inches")
        Dim BMI As String
        BMI = Weight * 703 / (Height * Height)
        MsgBox("Your BMI is " & Weight * 703 / (Height * Height))
        Select Case BMI
            Case Is >= 30
                MsgBox("You are Obese")
            Case Is < 30
                MsgBox("You are Overweight")
            Case Is >= 25
                MsgBox("You are Overweight")
            Case Is < 25
                MsgBox("You are Normal Weight")
            Case Is >= 18.5
                MsgBox("You are Normal Weight")
            Case Is < 18.5
                MsgBox("You are Underweight")

        End Select
    End Sub
End Class
