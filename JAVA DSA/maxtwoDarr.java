import java.util.Scanner;

public class maxtwoDarr {

    //here finding max from simple array
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

        //here setting minimum value in max variable to compare every element in array
        int max = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                //if element in array is maximum than max then assign that value to max variable
                max = arr[i];
            }
        }
        //printing maximum form array
        System.out.println("Maximum = "+max);

    }


}
