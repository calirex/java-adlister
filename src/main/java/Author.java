public class Author {
    // PROPERTIES //
    private String name;

    private String birthdate;

    // CONSTRUCTOR //
    public Author () {

    }

    public Author(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    // GETTERS AND SETTERS //


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
