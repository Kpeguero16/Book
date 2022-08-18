package src;
public class Main {
    public static void main(String[] args) {

        /*
         * TO-DO:
         * Get user input for name, pages, and days
         * Decide wether to make a GUI for the app or leave it as a command line program
         * MAYBE: use book api for book look up instead of making the user input the info themselves or give both options 
         * Create something to store user's information maybe using some type of login or storing values in local storage 
         * Digital Library, book ranking system similar to what I have for movies in Notion. Basically MyAnimeList but for books
         * ^_^
         */

        Book newBook = new Book("The Gathering Storm", 752, 30);
        
        System.out.println(newBook);


    }
}
 