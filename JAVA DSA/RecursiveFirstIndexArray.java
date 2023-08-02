public class RecursiveFirstIndexArray {

    public static void main(String args[])
    {
        //you have given an array ans value x print first index where 
        // x is occcuring first time

        int[] arr = {123,3,435,23,123235,234,132,421,76787,978,9};

        int x = 23;
        System.out.println(firstindex(arr, x, 0));

    }

    public static int firstindex(int arr[], int x ,int i)
    {
        if(i == arr.length)
        {
            return -1;
        }
        if(arr[i] == x)
        {
            return i;
        }
        int idx = firstindex(arr, x, i+1);
        return idx;

    }

}
