package LinkedList;
import java.util.LinkedList;


public class MyLinkedList {
    //Trong phần này, chúng ta sẽ phát triển một chương trình cho phép cài đặt cấu trúc LinkedList đơn giản để lưu một tập dữ liệu bất kỳ
    private Node head;
    //numNodes size xác định số phần tử trong danh sách, mặc định gán là 0.
    private  int numNodes;
    //head đối tượng lớp Node


    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }
    public void add (int index, Object data){
        Node temp = head;
        Node holder;

        for (int i =0; i < index -1 && temp.next != null; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    //Phương thức khởi tạo một tham số khởi tạo node đầu tiên trong danh sách


}
