public class Book {
    private final String name;
    private final Author author;
    private int publishYear;

    public Book(String name, Author author, int publishYear) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Книга: " +
                "название - " + name +
                ", автор - " + author +
                ", год публикации - " + publishYear;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return publishYear == book.publishYear && java.util.Objects.equals(name, book.name) && java.util.Objects.equals(author, book.author);
    }

    public int hashCode() {
        return java.util.Objects.hash(name, author, publishYear);
    }
}
