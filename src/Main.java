package src;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /*
         * TO-DO:
         * Decide wether to make a GUI for the app or leave it as a command line program
         * MAYBE: use book api for book look up instead of making the user input the info themselves or give both options 
         * Create something to store user's information maybe using some type of login or storing values in local storage 
         * Digital Library, book ranking system similar to what I have for movies in Notion. Basically MyAnimeList but for books
         * ^_^
         */

        System.out.println("\nHi! Welcome to the book calculator ^_^\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("What book do you want to read?\n");
        String bookInput = scanner.nextLine();
        System.out.println("\nHow many pages does " + bookInput + " have?");
        int pages = scanner.nextInt();
        System.out.println("\nIn how many days do you wish to finish " + bookInput + "?");
        int days = scanner.nextInt();
        scanner.close();
            
            Book newBook = new Book(bookInput, pages, days);
            
            System.out.println(newBook);
        


    }
}
 