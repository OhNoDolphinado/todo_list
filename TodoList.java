// add items to a list
// remove items from list
// print list
// bonus: add items to list, multiple at a time
// bonus: sort items alphabetically

import java.util.*;

public class TodoList {
    ArrayList<String> items = new ArrayList<String>();

    public void addItems(String item) { // adds items to list
        System.out.println("Please type the new task below:");
        items.add(item);
    }

    public void removeItems(int item) { // removes items from list 
        System.out.println("Please state the number of the task you'd like to remove:");
        items.remove(item - 1); 
    }

    public void printItems() {
        System.out.println("Todo List\n - - - - -"); // title and formatting
        for (int i=0; i < items.size(); i++){ // iterates through list
            System.out.println((i+1) + ") " + items.get(i) + "\n");
        }
    }
}