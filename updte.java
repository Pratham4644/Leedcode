import java.util.LinkedList;
public class updte {
    public static void main(String[] args) {
        LinkedList<Integer> date=new LinkedList<Integer>();
       date.add(2);
       date.add(3);
       date.add(4);
       System.out.println(date);
       date.add(1, 5);
         System.out.println(date);
         date.remove(2);
            System.out.println(date);
             date.set(1, 6);
                 System.out.println(date);
                    date.add(7);
                     System.out.println(date);
                      date.removeFirst();
                       System.out.println(date);
                        date.removeLast();
                         System.out.println(date);
                          date.clear();
                           System.out.println(date);
              


    }
    
}
