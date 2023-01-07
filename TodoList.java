// add items to a list
// remove items from list
// print list
// bonus: add items to list, multiple at a time
// bonus: sort items alphabetically and by length
// bonus: add star system, sort by stars

import java.util.*;

public class TodoList {
    ArrayList<String> items = new ArrayList<String>();

    public void printItems() {
        System.out.println("\nTodo List\n- - - -"); // title and formatting
        for (int i=0; i < items.size(); i++){ // iterates through list
            System.out.println((i+1) + ") " + items.get(i));
        }
    }

    public void sortList(String type) {
        if (type.equals("abc")) {
            Collections.sort(items, new AtoZ());
        }
        else if (type.equals("xyz")) {
            Collections.sort(items, new ZtoA());
        }
        else if (type.equals("long")) {
            Collections.sort(items, new LongestFirst());
        }
        else if (type.equals("short")) {
            Collections.sort(items, new ShortestFirst());
        }
        else {
            System.out.println("Unknown sort type.");
        }
    }

    public void addItems(String item) { // adds items to list
        items.add(item);
    }

    public void removeItems(int item) { // removes items from list 
        if (items.size() >= 1){
            items.remove(item - 1); 
        } 
        else{
            System.out.println("Your list is empty!");
        }
    }

    public void starterItems() {
        items.add("Work on writing your book."); // for testing
        items.add("Alphabetize the comic book collection. Don't forget to go by author!"); // for testing
        items.add("Take out the trash."); // for testing
        items.add("Zoo -- new Zebra exhibit."); // for testing
        items.add("Book tickets to see Mother Mother."); // for testing
    }
    
}

// comparators below, for sortList():
// im gonna be honest i dont know if my comments are correct but it works so /shrug

class AtoZ implements Comparator<String>{
    public int compare(String first, String second) {
        if (first.equals(second)){ // if they are the same, it doesn't matter
            return 0;
        }
        else if (first.compareToIgnoreCase(second) > second.compareToIgnoreCase(first)) { // first is alphabetically ahead; it goes higher
            return 1;
        }
        else {
            return -1; // doesn't pass; it goes lower
        }
    }
}

class ZtoA implements Comparator<String>{
    public int compare(String first, String second) {
        if (first.equals(second)){ // if they are the same, it doesn't matter
            return 0;
        }
        else if (first.compareToIgnoreCase(second) < second.compareToIgnoreCase(first)) { // first is alphabetically behind; it goes higher
            return 1;
        }
        else {
            return -1; // doesn't pass; it goes lower
        }
    }
}

class LongestFirst implements Comparator<String>{
    public int compare(String first, String second) {
        if (first.equals(second)){ // if they are the same, it doesn't matter
            return 0;
        }
        else if (first.length() < second.length()) { // first is longer; its ranked better
            return 1;
        }
        else {
            return -1; // doesn't pass; it goes lower
        }
    }
}

class ShortestFirst implements Comparator<String>{
    public int compare(String first, String second) {
        if (first.equals(second)){ // if they are the same, it doesn't matter
            return 0;
        }
        else if (first.length() > second.length()) { // first is shorter; its ranked better
            return 1;
        }
        else {
            return -1; // doesn't pass; it goes lower
        }
    }
}