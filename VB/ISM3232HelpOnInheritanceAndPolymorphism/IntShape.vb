Public Interface IntShape
    Property ShapeName As String
    Property Length As Single
    Property Height As Single
    Property Area As Single
    Sub ComputeArea()
End Interface


Class IRectangle
    Implements IntShape
    Dim mShapeName As String
    Dim mLength As Single
    Dim mHeight As Single
    Dim mArea As Single

    Public Property Area As Single Implements IntShape.Area
        Get
            Return mArea
        End Get
        Set(value As Single)
            mArea = value
        End Set
    End Property


    Public Property Height As Single Implements IntShape.Height
        Get
            Return mHeight
        End Get
        Set(value As Single)
            mHeight = value
        End Set
    End Property

    Public Property Length As Single Implements IntShape.Length
        Get
            Return mLength
        End Get
        Set(value As Single)
            mLength = value
        End Set
    End Property

    Public Property ShapeName As String Implements IntShape.ShapeName
        Get
            Return mShapeName
        End Get
        Set(value As String)
            mShapeName = value
        End Set
    End Property

    Public Sub ComputeArea() Implements IntShape.ComputeArea
        Area = Length * Height
    End Sub

End Class

Class ITriangle
    Implements IntShape
    Dim mShapeName As String
    Dim mLength As Single
    Dim mHeight As Single
    Dim mArea As Single

    Public Property Area As Single Implements IntShape.Area
        Get
            Return mArea
        End Get
        Set(value As Single)
            mArea = value
        End Set
    End Property


    Public Property Height As Single Implements IntShape.Height
        Get
            Return mHeight
        End Get
        Set(value As Single)
            mHeight = value
        End Set
    End Property

    Public Property Length As Single Implements IntShape.Length
        Get
            Return mLength
        End Get
        Set(value As Single)
            mLength = value
        End Set
    End Property

    Public Property ShapeName As String Implements IntShape.ShapeName
        Get
            Return mShapeName
        End Get
        Set(value As String)
            mShapeName = value
        End Set
    End Property

    Public Sub ComputeArea() Implements IntShape.ComputeArea
        Area = Length * Height * 0.5
    End Sub

End Class

Class ICircle
    Implements IntShape
    Dim mShapeName As String
    Dim mLength As Single
    Dim mHeight As Single
    Dim mArea As Single

    Public Property Area As Single Implements IntShape.Area
        Get
            Return mArea
        End Get
        Set(value As Single)
            mArea = value
        End Set
    End Property


    Public Property Height As Single Implements IntShape.Height
        Get
            Return mHeight
        End Get
        Set(value As Single)
            mHeight = value
        End Set
    End Property

    Public Property Length As Single Implements IntShape.Length
        Get
            Return mLength
        End Get
        Set(value As Single)
            mLength = value
        End Set
    End Property

    Public Property ShapeName As String Implements IntShape.ShapeName
        Get
            Return mShapeName
        End Get
        Set(value As String)
            mShapeName = value
        End Set
    End Property

    Public Sub ComputeArea() Implements IntShape.ComputeArea
        Area = Math.PI * Length ^ 2
    End Sub

End Class