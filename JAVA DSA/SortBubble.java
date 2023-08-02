public class SortBubble {
    
    //bubble sort in ascending order 
    //it will first store largest element in the last  index then 2nd largest and so on
    public static void main(String args[])
    {
        //initializing array
        int[] arr = {1,2,234,321,13,546,33,21,4};
        
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0;  j<arr.length-1; j++)
            {
                //if 1st element is greater than next then swap it
                if(arr[j] > arr[j+1])
                {
                    //by taking temprary variable swapping 
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]  =temp;
                }
            }

        }
        //printing sorted array
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+"\t");
        }
    
    }
}
