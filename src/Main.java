package src;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.awt.GraphicsEnvironment;
import java.awt.FontFormatException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Font sevillana;

        try{
            // load a custom font in your project folder
			sevillana = Font.createFont(Font.TRUETYPE_FONT, new File("Sevillana-Regular.ttf")).deriveFont(30f);	
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Sevillana-Regular.ttf")));			
		}
		catch(IOException | FontFormatException e){
			
		}



        JLabel header = new JLabel();
        header.setText("Book Calculator");
        header.setForeground(new Color(255, 239, 213));
        header.setFont(new Font("sevillana", Font.BOLD, 38));
        header.setHorizontalAlignment(JLabel.CENTER);
        header.setVerticalAlignment(JLabel.CENTER);
        header.setBounds(0, 0, 450, 100);

        JLabel q1 = new JLabel("Welcome!\nWhat book do you want to read?");
        q1.setFont(new Font("sevillana", Font.PLAIN, 16));
        q1.setForeground(new Color(255, 239, 213));
        q1.setHorizontalAlignment(JLabel.CENTER);

        JTextField nameOfBook = new JTextField();
        nameOfBook.setPreferredSize(new DimensionUIResource(250, 30));
        nameOfBook.setBackground(Color.white);
        nameOfBook.setHorizontalAlignment(JLabel.CENTER);
        nameOfBook.setFont(new Font("sevillana", Font.PLAIN, 16));
        

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 450, 150);
        panel.setBackground(new Color(70, 130, 180));
        panel.add(header);
        panel.add(q1);
        panel.add(nameOfBook);

        JFrame frame = new JFrame();
        frame.setTitle("Book Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(450, 800);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(70, 130, 180));
        frame.add(panel);
        frame.setVisible(true);



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
