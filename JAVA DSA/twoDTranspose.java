import java.util.Scanner;

public class twoDTranspose {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        System.out.println("Original matrix :");        
        for (int k = 0; k < arr.length; k++) {
            for (int p = 0; p < arr[0].length; p++) {
                System.out.print(arr[k][p]+"\t");
            }
            System.out.println();
        }

        transpose(arr);
    }

    public static void transpose(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) 
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        
        System.out.println("Transpose matrix :");
        for (int k = 0; k < arr.length; k++) {
            for (int p = 0; p < arr[0].length; p++) {
                System.out.print(arr[k][p]+"\t");
            }
            System.out.println();
        }
    }

}


/*

original matrix

      0 1 2
    0[1 2 3] 
    1[4 5 6]
    2[7 8 9]

transpose matrix
    [1 4 7 ]
    [2 5 8 ]
    [3 6 9 ]


 */