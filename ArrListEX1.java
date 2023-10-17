import java.util.*;
public class ArrListEX1{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(3);//add the elements of the
        System.out.println(list);
        System.out.println(list.remove(0));//remove by index
        System.out.println(list.remove(Integer.valueOf(30)));//remove by value
        System.out.println(list);
        System.out.println("Size "+list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(2));//get element by index
        list.add(5,100);//add the elements value 100 at index 2 
        list.set(0,200);
        System.out.println(list);



    }
}