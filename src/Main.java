public class Main {
    public static void main(String[] args) {
        Author authorOne = new Author("Francis", "Fitzgerald");
        Book bookOne = new Book("The Great Gatsby", authorOne, 1925);
        Author authorTwo = new Author("Михаил", "Булгаков");
        Book bookTwo = new Book("Преступление и наказание", authorTwo, 1966);
        bookTwo.setPublishYear(1967);
    }
}