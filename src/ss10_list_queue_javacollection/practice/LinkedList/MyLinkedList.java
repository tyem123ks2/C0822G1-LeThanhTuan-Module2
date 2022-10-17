package ss10_list_queue_javacollection.practice.LinkedList;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    //Phần tử đầu tiên của danh sách liên kết.
    private Node head;
    //Số lượng phần tử trong danh sách.
    private int numNodea = 0;

    public MyLinkedList() {
    }

    public void addFirst(E element) {
        //Khai báo 1 biến là temp (tham chiếu đến giá trị của head).
        Node temp = head;
        //Biến head sẽ nhận giá trị là 1 node mới.
        head = new Node(element);
        //head.next trở đến temp
        head.next = temp;
        numNodea++;
    }

    public void addLast(E element) {
        //Khai báo biến temp trỏ đến head
        Node temp = head;
        //Sẽ cho con trỏ chạy đến phần tử cuối cùng của danh sách
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodea++;

    }

    public void add(int index, E element) {
        //Khai báo biến temp trỏ đến head
        Node temp = head;
        //Khai báo một Node là holder
        Node holder;
        //Cho con trỏ chạy đến vị trí index-1.
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        //Cho holder tham chiếu đến vị trí index.
        holder = temp.next;
        //Node tại vị trí index-1 sẽ trỏ tới node mới
        temp.next = new Node(element);
        //Node mới này trỏ đến holder
        temp.next.next = holder;
        //Tăng số lượng phần tử trong danh sách lên 1
        numNodea++;
    }

    public Object get(int index) {
        //Khai báo biến temp trỏ tới head.
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size() {
        return numNodea;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodea) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        // Khai báo biến temp trỏ đến head
        Node temp = head;

        Object data;
        //Nếu index = 0 thì sẽ trả về data hiện tại
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNodea--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodea--;
        }
        return (E) data;
    }

    public boolean remove(E element) {
        //Remove đối tượng nếu element head
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            //Khai báo 1 node temp trỏ đến head
            Node temp = head;
            while (temp.next != null) {
                //Nếu như tồn tại 1 phần tử có data bằng data truyền vào thì node đó sẽ bị remove
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodea--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public MyLinkedList<E> clone() {
        //Kiểm tra LinkedList có phần tử hay không
        if (numNodea == 0) {
            throw new NullPointerException("LinkedList này null");
        }
        //Khai báo linkedlist trả về
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        //Khai báo 1 temp trỏ đến head
        Node temp = head;
        //add temp vào danh sách trả về để nó làm head
        returnLinkedList.addFirst((E) temp.data);
            temp = temp.next;
            while (temp != null) {
                returnLinkedList.addLast((E) temp.data);
                temp = temp.next;
            }
        return  returnLinkedList;
    }

    public boolean constrains (E element){
        Node temp = head;
        while (temp.next != null){
            if (temp.data.equals(element)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element){
        Node temp = head;
        for (int i = 0; i < numNodea; i++){
            if (temp.getData().equals(element)){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
}

