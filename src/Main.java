package src;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Border border = BorderFactory.createLineBorder(new Color(255, 250, 250), 2);

        JLabel header = new JLabel();
        header.setText("Book Calculator");
        header.setForeground(new Color(255, 239, 213));
        header.setFont(new Font("Times New Roman", Font.BOLD, 32));
        // header.setBorder(border);
        header.setHorizontalAlignment(JLabel.CENTER);
        header.setVerticalAlignment(JLabel.CENTER);
        header.setBounds(0, 0, 450, 100);

        JFrame frame = new JFrame();
        frame.setTitle("Book Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(450, 800);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(70, 130, 180));
        frame.add(header);
        /*
         * TO-DO:
         * Decide wether to make a GUI for the app or leave it as a command line program
         * MAYBE: use book api for book look up instead of making the user input the
         * info themselves or give both options
         * Create something to store user's information maybe using some type of login
         * or storing values in local storage
         * Digital Library, book ranking system similar to what I have for movies in
         * Notion. Basically MyAnimeList but for books
         * ^_^
        */
        
        System.out.println("\nHi! Welcome to the book calculator ^_^\n");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("What book do you want to read?\n");
        String bookInput = scanner.nextLine();
        System.out.println("\nHow many pages does " + bookInput + " have?");
        int pages = scanner.nextInt();
        System.out.println("\nIn how many days do you wish to finish " + bookInput +
         "?");
        int days = scanner.nextInt();
        scanner.close();
         
        Book newBook = new Book(bookInput, pages, days);
        
        System.out.println(newBook);
        

    }
}
