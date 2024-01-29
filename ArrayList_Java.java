import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class ArrayList_Java {
    static Scanner sc = new Scanner(System.in);
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        // iterations:

        //using for loop:
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // using foreach:
        for ( int ele  : list) {
           System.out.println(ele); 
        }

        //using iterator:
        Iterator<Integer> iter=list.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }

        //stream method:
        list.stream().forEach(val-> System.out.println(val));
        list.stream().filter(val->val < 10).forEach(val->System.out.println(val));

        //contains method:
        int key = sc.nextInt();
        if(list.contains(key))
            System.out.println(key+" is present");
        else
            System.out.println(key+" is not present");

    }



}
