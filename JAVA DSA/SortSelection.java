public class SortSelection {
    
    public static void main(String args[])
    {
        int[] arr = {1,2,234,321,13,546,33,21,4};

        for(int i=0; i<arr.length; i++)
        {
            //assign first element as minimum in mincalu variable
            //assume that minimum value index in minidx variable
            int minvalu = arr[i];
            int minidx = i;

            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j] < minvalu)
                {
                    //here we get minimum value and that value index
                    minvalu = arr[j];
                    minidx = j;
                }
            }

            //here swapping that minimum value with index i
            int temp = arr[i];
            arr[i]  =  arr[minidx];
            arr[minidx]  =  temp;
        }

        //this is foreach loop
        for(int val :arr)
        {
            System.out.print(val+"\t");
        }


        // //this is simple for loop
        // for(int i=0; i<arr.length; i++)
        // {
        //     System.out.print(arr[i]+"\t");
        // }
    }

}


