package src;
public class Book 
{
    private String nameOfBook;
    private int numberOfPages;
    private int numberOfDays;

    public Book(String name, int pages, int days)
    {
        nameOfBook = name;
        numberOfPages = pages;
        numberOfDays = days;
    }

    public String toString() 
    {
        return "\nYou can finish " + nameOfBook + " in " + numberOfDays + " days if you read " + ((int)Math.ceil((double)numberOfPages/numberOfDays)) + " pages per day!\n";
    }

    
}
