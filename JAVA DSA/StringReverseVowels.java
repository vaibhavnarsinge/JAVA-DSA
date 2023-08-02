public class StringReverseVowels {
    
    public static void main(String args[])
    {
        String ss = "welcometohome";
         
        char[] s = ss.toCharArray();
        int i=0;
        int j = s.length -1;
        System.out.println("Original :");

        for(i=0; i<s.length; i++)
        {
            System.err.print(s[i]+"\t");
        }
        while(i<j)
        {
            while(s[i] != 'a' && s[i] != 'e' &&s[i] != 'i' &&s[i] != 'o' &&s[i] != 'u' )
            {
                i++;
            }
            while(s[j] != 'a' && s[j] != 'e' &&s[j] != 'i' &&s[j] != 'o' &&s[j] != 'u' )
            {
                j--;
            }

            if(i>=j)
            {
                break;
            }
            char temp = s[i];
            s[i]    = s[j];
            s[j]    = temp;

            i++;
            j--;
        }

        System.out.println("\nreversed vowels :");
        for(i=0; i<s.length; i++)
        {
            System.err.print(s[i]+"\t");
        }
    }

}



/*
 *  welcometohome
 *  
 * 
 * w e l c o m e t o h o m e
 * 
 *     ( e o e o o e )     <- this are the vowels in above string
 * output should be
 * here put same vowel in reversed order
 * w e l c o m o t e h o m e
 *   _     _   _   _   _   _    <- this are reversed
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */