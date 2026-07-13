class node{
    int data;
    node next;
    node(int data1 , node next1){
        data = data1;
        next= next1;
    }
    void Node(int data2,node next2){
        data= data2;
        next=next2;
    }
    void node(int data3){
        data=data3;
        next=null;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] arr= {11,12,13,67};
     node newNode = new node(arr[2], null);
     System.out.println(newNode.data);

    }
}