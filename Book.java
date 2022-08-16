public class Book 
{
    private String nameOfBook;
    private int numberOfChapters;
    private int numberOfDays;

    public Book(String name, int chapters, int days)
    {
        nameOfBook = name;
        numberOfChapters = chapters;
        numberOfDays = days;
    }

    public String toString() 
    {
        return "You can finish " + nameOfBook + " in " + numberOfDays + " days if you read " + numberOfChapters + " chapters per day!";
    }

    
}
