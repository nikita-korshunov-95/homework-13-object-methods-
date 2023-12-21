import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int publicationYear;
    public Book (String title, Author author, int publucationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publucationYear;
    }
    public String getTitle () {
        return this.title;
    }
    public Author getAuthor () {
        return this.author;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear) {this.publicationYear = publicationYear;
    }
    @Override
    public String toString() {
        return "Название книги: " + title + "; Автор: " + author + "; Год издания: " + publicationYear;
    }
    @Override
    public boolean equals(Object b) {
        if (this == b) return true;
        if (b == null || getClass() !=b.getClass()) return false;
        Book book = (Book) b;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publicationYear, book.publicationYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
