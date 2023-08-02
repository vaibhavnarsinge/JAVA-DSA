public class StringRemoveVowel {

    // vowels = a , e , i , o, u
    //printing all consonent and removing vowels from string
    public static void main(String args[])
    {
        String s  = "YoucanDoit";

        removeVowel(s);
    }

    public static void removeVowel(String st)
    {
        for(int i=0; i<st.length(); i++)
        {
            char ch =st.charAt(i);
            
            if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u')
            {
                continue;
            }
            System.out.print(ch+"\t");
        }
    }
}
