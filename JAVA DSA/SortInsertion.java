public class SortInsertion {

    public static void main(String args[]) {
        // initializing array
        int[] arr = { 1, 2, 234, 321, 13, 546, 33, 21, 4 };

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position
            // ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+"\t");
        }

    }
}
