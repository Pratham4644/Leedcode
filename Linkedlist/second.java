class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        data=data1;
        next=next1;
    }
     void setNode(int data2, Node next2){
        data=data2;
        next=next2;
    }
    void Node(int data3, Node next3){
        data=data3;
        next=next3;
}
Node(int data4){
    data=data4;
    next=null;
}
}


public class second {
    public static void main(String[] args) {
        int[] arr= {11,12,13,67};
        Node x = new Node(arr[0], null);
        System.out.println(x.data);
        
    }
}
