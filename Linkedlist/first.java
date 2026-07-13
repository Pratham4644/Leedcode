import java.util.LinkedList;
public class first {
    public static void main(String[] args) {
    LinkedList<Integer> data=new LinkedList <Integer>();
    data.add(2);
    data.add(3);  
    data.add(4);
    System.out.println(data);
    data.add(1, 5);
    System.out.println(data);

    }
}