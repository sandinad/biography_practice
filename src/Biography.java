import java.util.ArrayList;
import java.util.List;

public class Biography {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
        This will be our actual program that we define author and his books
        In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

        Full name = Stefan Zweig
        County = Austria
        Is still alive: No (28 November 1881 – 22 February 1942)
        Some of his books as listed below:

        BookName                            Genre           TotalPage
        Amok                                tale            189
        The Royal Game                      novella         53
        24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

        //YOUR CODE HERE

        String firstName = ScannerHelper.getString("What is your favorite author’s first name?");
        String lastName = ScannerHelper.getString("What is your favorite author’s last name?");
        String country = ScannerHelper.getString("Where is your favorite author from?");
        String isAliveString = ScannerHelper.getString("Is your favorite author alive? Y/N");
        boolean isAlive = isAliveString.toUpperCase().startsWith("Y");
        int age = 0;
        if(isAlive)age = ScannerHelper.getInt("How old is your favorite author?");

       List<Book> books = new ArrayList<>();
       do{
           if(ScannerHelper.getString("Would you like enter book information? (Y/N)?").toUpperCase().startsWith("N"))
               break;
           String name = ScannerHelper.getString("What is the name of the book?");
           String genre = ScannerHelper.getString("What is the genre of the book?");
           int totalPage = ScannerHelper.getInt("How many pages does the book have?");
           books.add(new Book(name, genre, totalPage));

       }while(true);

       Author author = new Author(firstName,lastName,country,isAlive,age,books);
        System.out.println("Author's information = " + author);



    }
}
