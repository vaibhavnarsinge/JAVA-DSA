public class arrayIntro {

    public static void main(String args[])
    {

        // int[] arrr = new int[10];
        //direct entering elements in array
        int [] arr = {1,2,3,4,6,7,5,43};
        //direct printing array element by index
        System.out.println(arr[3]);

        //updating array element by using index
        arr[2] = 20;
        System.out.println(arr[2]);

        //finding array length
        int len = arr.length;
        System.out.println("Length of array = "+len);

        //traversing array
        for(int i=0; i<arr.length;i++)
        {
            System.out.println("Array elements : ");
            System.out.print(arr[i]+"\t");
        }
    }
}
