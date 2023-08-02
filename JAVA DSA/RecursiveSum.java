public class RecursiveSum {

    // if n= 7 then print 1 to 7 numbers
    public static void main(String args[]) {
        int n = 7;


        printIncreasing(n);

    }

    public static void printIncreasing(int n) {
        if(n == 0)
        {
            return;
        }

        printIncreasing(n-1);
        System.out.println(n);
    }
}

 