import java.util.Scanner;

public class Hello {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        LinkedList list = new LinkedList();
        int size;

        list.insert_head(1);
        list.insert_node(5);
        list.print_nodes();

        list.insert_between(3);
        list.print_nodes();

        list.insert_between(2);
        list.insert_between(4);
        list.print_nodes();

        list.insert_between(0);
        list.print_nodes();

        list.insert_between(6);
        list.insert_node(7);
        list.print_nodes();

        list.delete_head();
        list.print_nodes();

        list.delete_head();
        list.print_nodes();

        list.insert_node(8);
        list.print_nodes();

        list.delete_tail();
        list.delete_tail();
        list.print_nodes();

        list.insert_node(10);
        list.insert_between(12);
        list.print_nodes();

        list.delete_target(5);
        list.print_nodes();

        list.delete_target(2);
        list.print_nodes();

        list.insert_node(15);
        list.print_nodes();

        list.delete_target(15);
        list.print_nodes();

        list.insert_node(17);
        list.print_nodes();

        list.delete_target(17);
        list.print_nodes();

        list.insert_between(8);
        list.insert_node(15);
        list.print_nodes();

        size = list.list_size();
        System.out.println("\nList size: " + size);
    }
}
