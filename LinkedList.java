public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    LinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    //insert value at beginning of linked list
    public void insert_head(int target) {
        Node temp = new Node();
        temp.val = target;

        if (head == null) {
            head = temp;
            tail = temp;
            temp = null;
            size++;
        } else {
            temp.next = head;
            head = temp;
            temp = null;
            size++;
        }
    }

    public void insert_between(int target) {
        Node temp = new Node();
        Node prev = new Node();
        Node current = new Node();

        temp.val = target;
        current = head;

        while (current != null && current.val < target) {
            prev = current;
            current = current.next;
        }

        if (current == head) {
            insert_head(target);
        } else if(current == null) {
            insert_node(target);
        } else {
            temp.next = current;
            prev.next = temp;
            temp = null;
            size++;
        }
    }


    public void insert_node(int target){
        Node temp = new Node();
        temp.val = target;
        temp.next = null;

        //if list is empty
        if(head==null){
            head = temp;
            tail = temp;
            temp = null;
            size++;
        } else {
            tail.next = temp;
            tail = temp;
            temp = null;
            size++;
        }
    }

    public void delete_head(){
        Node temp = new Node();
        temp = head.next;
        head = temp;
        size--;
    }

    public void delete_tail(){
        Node temp = new Node();
        Node prev = new Node();
        Node current = new Node();

        current = head;

        while(current!=tail){
            prev = current;
            current = current.next;
        }

        tail = prev;
        tail.next = null;
        size--;
    }

    public void delete_target(int target){
        Node temp = new Node();
        Node prev = new Node();
        Node current = new Node();

        current = head;

        while(current!=null && current.val != target){
            prev = current;
            current = current.next;
        }

        if(current==head){
            delete_head();
        } else if(current == tail){
            delete_tail();
        } else {
            prev.next = current.next;
            size--;
        }
    }

    //traversing the list
    public void print_nodes(){
        int num = 0;
        Node current = new Node();
        current = head;

        while(current !=null){
            num = current.val;
            System.out.print(num + " ");

            current = current.next;
        }

        System.out.print("\n");
    }

    public int list_size(){
        return size;
    }
}
