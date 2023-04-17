import java.util.ArrayList;
import java.util.List;

public class Author {

    /**
     * WORK ON BOOK CLASS FIRST
     Create a custom constructor that will take 6 args and defines the Author object
     Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    //Create 6 args custom constructor here
    //YOUR CODE HERE
    public Author(){

    }

    public Author(String firstName, String lastName, String country, boolean isAlive, int age, List<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;
        this.books = books;
    }




    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
    //YOUR CODE HERE
    public String firstName;
    public String lastName;
    public String country;
    public boolean isAlive;
    public int age;
    public List<Book> books = new ArrayList<>();



    /*
    Override toString() method here that returns Author object information
     */
    //YOUR CODE HERE


    @Override
    public String toString() {
        if(isAlive){
            return "Author{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", country='" + country + '\'' +
                    ", isAlive=" + isAlive +
                    ", age=" + age +
                    "}\nAuthor's books are as listed below:\n" +
                    books;

        }
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive=" + isAlive +
                "}\nAuthor's books are as listed below:\n" +
                books;

    }
}
