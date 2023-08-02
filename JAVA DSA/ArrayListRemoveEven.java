import java.util.*;

public class ArrayListRemoveEven {

    public static void main(String args[])
    {
        //removing even elements from arraylist
        ArrayList<Integer> list =new  ArrayList<>();
        
        //add
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(12);
        list.add(43);
        list.add(46);
        list.add(67);
        list.add(345);
        list.add(234);
        list.add(43);
        list.add(242);
        list.add(2342);

        System.out.println("Original list :\n"+list);


        //this for loop is for removing even numbers
        for(int i=list.size()-1; i>=0;i--)
        {
            if((list.get(i)%2) == 0)
            {
                list.remove(i);
            }
        }

        System.out.println("Odd List : "+list);


        //here adding elements again because in above for loop there even numbers removed
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(12);
        list.add(43);
        list.add(46);
        list.add(67);
        list.add(345);
        list.add(234);
        list.add(43);
        list.add(242);
        list.add(2342);
        //this for loop is for removing odd numbers
        for(int i=list.size()-1; i>=0;i--)
        {
            if((list.get(i)%2) != 0)
            {
                list.remove(i);
            }
        }

        System.out.println("Even List : "+list);

    }

}
