import java.util.*;

public class TodoListMain {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // intialize java.util.Scanner object

        TodoList list = new TodoList();
        list.items.add("This is an example task."); // for testing
        list.items.add("Alphabet soup is wonderful."); // for testing
        list.items.add("password:password is a hit or miss band, but I like 'Every Single Night'."); // for testing
        list.items.add("Zebras rule, dude."); // for testing
        list.items.add("San Francisco is the city by the bay."); // for testing

        boolean exit = false;

        while (exit != true) { // decision tree
            System.out.println("\nTo see the list, type 'print'. To sort the list, type 'sort'. To add an item, type 'add'. To remove an item, type 'delete'. To exit, type 'exit'.");
            String input = in.nextLine(); // answers prompt above
            
            if (input.equals("print")) {
                list.printItems();
            }
            else if (input.equals("sort")) {
                System.out.println("To sort A-Z, type 'abc'. To sort Z-A, type 'xyz'. To sort longest to shortest, type 'long'. To sort shortest to longest, type 'short'.");
                list.sortList(in.nextLine());
            }
            else if (input.equals("add")) {
                System.out.println("Please type the new task below:");
                list.addItems(in.nextLine());
            }
            else if (input.equals("delete")) {
                System.out.println("Please state the number of the task you'd like to remove:");
                list.removeItems(Integer.parseInt(in.nextLine())); // alternatively could use in.nextInt() but this is more convenient
            }
            else if (input.equals("exit")) {
                System.out.println("Exiting...");
                exit = true; // quite literally, the exit condition
            }
            else {
                System.out.println("Invalid command. Please try again.");
            }
        }
        // list.printItems();
        in.close();
    }
}
