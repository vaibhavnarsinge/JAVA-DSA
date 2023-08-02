public class twodArrayintro {

    public static void main(String args[]) {
        // initializing twoD array with 5 rows and 6 columns
        //int[][] arr = new int[5][6];
        int[][] arr ={{1,2,3},
                      {4,5,6},
                      {9,8,7}};

        // set
        arr[1][2] = 10;

        // get
        System.out.println(arr[1][2]);

        //row count
        System.out.println("Rows = "+arr.length);

        //column count
        System.out.println("Column = "+arr[0].length);

        //traversal on 2dArray 
        for(int i=0; i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("\n");
        }

    }

}
