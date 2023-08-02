import java.util.Collection;
import java.util.*;

public class ArrayListIntro {
    
    public static void main(String args[])
    {
        ArrayList<Integer> list =new  ArrayList<>();
        
        //add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        //add at index
        list.add(1,40); // first parameter in index second is data
        list.add(2,50);
        System.out.println(list);

        //get
        list.get(2); //it will return element at particular index
        System.out.println(list.get(2));

        //set
        list.set(2,99);
        System.out.println("Set at 2nd index 99 : "+list);

        //remove
        System.out.println("removed 2nd element");
        list.remove(2);
        System.out.println(list);

        //size
        System.out.println("Size = "+list.size());



    }

}
