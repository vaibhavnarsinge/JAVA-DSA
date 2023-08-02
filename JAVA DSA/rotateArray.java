import java.util.Scanner;

public class rotateArray {

    // rotating array in 90degree
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        System.out.println("Original matrix :");
        for (int k = 0; k < arr.length; k++) {
            for (int p = 0; p < arr[0].length; p++) {
                System.out.print(arr[k][p] + "\t");
            }
            System.out.println();
        }

        transpose(arr);
    }

    public static void transpose(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println("Transpose matrix :");
        for (int k = 0; k < arr.length; k++) {
            for (int p = 0; p < arr[0].length; p++) {
                System.out.print(arr[k][p] + "\t");
            }
            System.out.println();
        }

        //after transpose reverse array 
        for (int i = 0; i < arr.length; i++) 
        {
            int si = 0;             //<- start index
            int ei =arr.length-1;   //<- end index

            while(si<ei)
            {
                int temp = arr[i][si];
                arr[i][si] = arr[i][ei];
                arr[i][ei] = temp;
                si++;
                ei--;
            }
        }

        System.out.println("90 Degree matrix :");
        for (int k = 0; k < arr.length; k++) {
            for (int p = 0; p < arr[0].length; p++) {
                System.out.print(arr[k][p] + "\t");
            }
            System.out.println();
        }
    }
}

/*
 * 0 1 2
 * 0 1 2 3
 * 1 4 5 6
 * 2 7 8 9
 * 
 * 
 * 
 * 
 */