public class StringUpperToLower {

    public static void main(String args[])
    {
        String s = "ILoveMyIndia";

        char[] c = s.toCharArray();

        for(int i=0; i<c.length; i++)
        {
            char ch = c[i];
            if(c[i] >='A' && c[i] <='Z')
            {
                char ansch = (char)(ch - 'A' + 'a');
                c[i] =  ansch;
            }
        }
        for(int i=0; i<c.length; i++)
        {
            System.out.print(c[i]+"\t");
        }
    }
}
