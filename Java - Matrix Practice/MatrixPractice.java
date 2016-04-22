import java.util.Scanner;

public class MatrixPractice {

    public static void main(String[] args) {
        int [][] matrix = new int[3][3];
        
        Scanner in = new Scanner(System.in);
        System.out.println("Matrix M[3][3]\n");
        
        for(int line = 0; line < 3; line++){
            for (int column = 0; column < 3; column++){
                System.out.printf("Enter a number M[%d][%d]: ",line+1,column+1);
                matrix[line][column]=in.nextInt();
            }
        }
        
        System.out.println("\nA The matrix now is: \n");
        for (int line = 0; line < 3; line++){
            for (int column = 0; column < 3; column++){
                System.out.printf("\t %d \t",matrix[line][column]);               
            }
            System.out.println();
        }
    }
    
}