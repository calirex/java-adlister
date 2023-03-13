import java.util.ArrayList;
import java.util.List;

public class BeanTest {

    public static void main(String[] args){

        Album album1 = new Album("adele", "adele", 2008, 30.5, "Pop");
        Album album2 = new Album("Sublime", "Sublime", 1997,25.5, "Rock");
        Album album3 = new Album("Johnny", "Johnny Cash", 1978, 38.2, "Country");
        Author author1 = new Author("Joe Dirt", "12/23/1985");
        Author author2 = new Author("Teddy Roosevelt", "07/04/1886");
        Author author3 = new Author("Said Shah", "03/05/1993");
        Quote quote1 = new Quote("Life's a garden, Dig it.", "Joe Dirt");
        Quote quote2 = new Quote("Speak soft, and carry a big stick","Teddy Roosevelt");
        Quote quote3 = new Quote("The Baest!", "Said Shah");

        List<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);

        for (Quote quote : quotes) {
            System.out.printf(""" 
                    %s - %s
                    """, quote.quote, quote.author);
        }
    }
}
