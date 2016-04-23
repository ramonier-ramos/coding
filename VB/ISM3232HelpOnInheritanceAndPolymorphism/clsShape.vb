Public MustInherit Class clsShape
    Dim mShapeName As String
    Dim mLength As Single
    Dim mHeight As Single
    Dim mArea As Single

    Property ShapeName As String
        Get
            Return mShapeName
        End Get
        Set(value As String)
            mShapeName = value
        End Set
    End Property

    Property Length As Single
        Get
            Return mLength
        End Get
        Set(value As Single)
            mLength = value
        End Set
    End Property

    Property Height As Single
        Get
            Return mHeight
        End Get
        Set(value As Single)
            mHeight = value
        End Set
    End Property

    Property Area As Single
        Get
            Return mArea
        End Get
        Set(value As Single)
            mArea = value
        End Set
    End Property

    Overridable Sub ComputeArea()
        mArea = Length * Height
    End Sub
End Class

Class clsRectangle
    Inherits clsShape
End Class

Class clsTriangle
    Inherits clsShape
    Public Overrides Sub ComputeArea()
        Area = Length * Height * 0.5
    End Sub
End Class

Class clsCircle
    Inherits clsShape
    Public Overrides Sub ComputeArea()
        Area = Math.PI * Length ^ 2
    End Sub
End Class