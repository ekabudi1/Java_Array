package arraylist;
import java.util.ArrayList;
import java.util.ListIterator;
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList al = new ArrayList(2);
        System.out.println(al+", size = "+al.size());
        
        //add items to the arraylist
        al.add("R");
        al.add("U");
        al.add("O");
        al.add(new String("X"));
        al.add(2, new Integer(10));
        System.out.println(al+",size ="+al.size());
        
//        remove item
        al.remove("U");
        System.out.println(al+", size ="+al.size());
        
//        check if the list contains the specified element
        Boolean b = al.contains("X");
        System.out.println("The list contains x =" +b);
        b =  al.contains("p");
        System.out.println("The list contains p ="+b);
        b = al.contains(new Integer(10));
        System.out.println("The list contains Integer of 10 = "+b);
        
//        create listIterator entriest in it
        ListIterator li = al.listIterator();
        while(li.hasNext())
            System.out.println("From ListIterator = " +li.next());
        
//        create object array from arraylist
        Object a[] =  al.toArray();
        for (Object a1 : a) {
            System.out.println("From an array = " + a1);
        }
        
    }
    
}
