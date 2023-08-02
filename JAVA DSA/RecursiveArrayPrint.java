public class RecursiveArrayPrint {

    public static void main(String args[]) {
        int[] arr = { 12, 23, 345, 5787, 54, 632, 3543, 53, 2 };

        printarray(arr, 0);
    }

    public static void printarray(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        System.out.println(arr[i]);

        printarray(arr, i + 1);

    }
}
 