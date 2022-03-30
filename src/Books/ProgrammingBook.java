package Books;

public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(int bookCode, String name, double price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "ProgrammingBook{" +
                "bookCode=" + super.getBookCode() +
                ", name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", author='" + super.getAuthor() + '\'' +
                "language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                '}';
    }
}
