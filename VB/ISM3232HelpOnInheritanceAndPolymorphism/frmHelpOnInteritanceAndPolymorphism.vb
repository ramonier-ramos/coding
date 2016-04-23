Public Class frmHelpOnInteritanceAndPolymorphism

    Private Sub btnInheritance_Click(sender As System.Object, e As System.EventArgs) Handles btnInheritance.Click
        FileOpen(1, "AreasUsingInheritance.txt", OpenMode.Output)

        Dim R As New clsRectangle
        R.ShapeName = "Rectangle"
        R.Length = 50
        R.Height = 20
        R.ComputeArea()
        Print(1, R.ShapeName & "," & R.Area & vbCrLf)

        Dim T As New clsTriangle
        R.ShapeName = "Triangle"
        R.Length = 50
        R.Height = 20
        R.ComputeArea()
        Print(1, R.ShapeName & "," & R.Area & vbCrLf)

        Dim C As New clsCircle
        C.ShapeName = "Circle"
        C.Length = 50
        C.ComputeArea()
        Print(1, C.ShapeName & "," & C.Area & vbCrLf)

        FileClose(1)
        MsgBox("Done")
    End Sub

    Private Sub btnPolymorphism_Click(sender As System.Object, e As System.EventArgs) Handles btnPolymorphism.Click
        FileOpen(1, "AreasUsingPolymorphism.txt", OpenMode.Output)

        Dim Shape As IntShape
        Shape = New IRectangle
        Shape.ShapeName = "Rectangle"
        Shape.Length = 50
        Shape.Height = 20
        Shape.ComputeArea()
        Print(1, Shape.ShapeName & "," & Shape.Area & vbCrLf)

        Shape = New ITriangle
        Shape.ShapeName = "Triangle"
        Shape.Length = 50
        Shape.Height = 20
        Shape.ComputeArea()
        Print(1, Shape.ShapeName & "," & Shape.Area & vbCrLf)

        Shape = New ICircle
        Shape.ShapeName = "Circle"
        Shape.Length = 50
        Shape.ComputeArea()
        Print(1, Shape.ShapeName & "," & Shape.Area & vbCrLf)

        FileClose(1)
        MsgBox("Done")
    End Sub
End Class
