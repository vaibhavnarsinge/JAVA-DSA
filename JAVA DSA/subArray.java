import java.util.Scanner;

public class subArray {
    
     public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        //initializing array with size n
        int[] arr = new int[n];

        System.out.println("Enter "+n+" Elements in array");
        //accepting array elements form user by for loop
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

         int si =0;  //start index
         int ei =0;  //end index

         for(si = 0; si<n; si++)
         {
            for(ei = si; ei<n; ei++)
            {

                for(int k=si; k<=ei; k++)
                {
                    System.out.print(arr[k]+"\t");
                }
                System.out.println();
            }
         }
    }

}


/*

//here sample array with index

 0   1   2   3     <- index
[1 , 2 , 3 , 4 ]   <- array elements

si              ei

0               0       {1}
0               1       {1,2}
0               2       {1,2,3}
0               3       {1,2,3,4}
1               1       {2}
1               2       {2,3}
1               3       {2,3,4}
2               2       {3}
2               3       {3,4}
3               3       {4}

 */


