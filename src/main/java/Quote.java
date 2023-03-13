public class Quote {

    // PROPERTIES //
    protected String quote;

    protected String author;


    // CONSTRUCTOR //
    public Quote() {

    }



    public Quote(String quote, String author) {
        this.quote = quote;
        this.author = author;
    }


    // GETTERS AND SETTERS //


    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
