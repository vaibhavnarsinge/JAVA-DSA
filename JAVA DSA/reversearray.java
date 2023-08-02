import java.util.Scanner;

public class reversearray {

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
        System.out.print("Original Array : ");
        for(int k=0; k<n; k++)
        {
            System.out.print(arr[k]+"\t");
        }


        int i=0;
        int j=n-1;
        int temp=0;
        //here using while loop to reverse array
        while(i<j)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.print("\n\nReversed array : ");
        for(int k=0; k<n; k++)
        {
            System.out.print(arr[k]+"\t");
        }
    }

}
