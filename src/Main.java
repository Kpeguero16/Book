package src;
public class Main {
    public static void main(String[] args) {

        /*
         * TO-DO:
         * Get user input for name, pages, and days
         * Decide wether to make a GUI for the app or leave it as a command line program
         */

        Book newBook = new Book("The Gathering Storm", 752, 30);
        
        System.out.println(newBook);


    }
}
 