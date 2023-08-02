public class RecursiveFactorial {

    public static void main(String args[])
    {
        int n = 5;

        System.out.println("Factorial = "+factorial(n));

    }

    public static int factorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        int nm1fact =0;
        
        nm1fact = factorial(n-1);

        return n * nm1fact;
    }
}
