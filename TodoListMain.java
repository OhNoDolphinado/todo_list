import java.util.*;

public class TodoListMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        TodoList list = new TodoList();
        list.items.add("This is an example task.");

        boolean exit = false;

        while (exit != true) {
            System.out.println("To see the list, type 'print'. To add an item, type 'add'. To remove an item, type 'delete'.");
            if (in.nextLine() == "print") {
                list.printItems();
                System.out.println("print");
            }
            else if (in.nextLine() == "add") {
                list.addItems(in.nextLine());
                System.out.println("add");
            }
            else if (in.nextLine() == "delete") {
                list.removeItems(in.nextInt());
                System.out.println("delete");
            }
            else {
                System.out.println("exit");
                exit = true;
            }
        }
        in.close();
    }
}
