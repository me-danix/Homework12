public class Main {
    public static void main(String[] args) {
        Author authorOne = new Author("Scott", "Fitzgerald");
        Book bookOne = new Book("The Great Gatsby", authorOne, 1925);
        Author authorTwo = new Author("Михаил", "Булгаков");
        Book bookTwo = new Book("Мастер и Маргарита", authorTwo, 1966);
        bookTwo.setPublishYear(1967);

        System.out.println(bookOne);
        System.out.println(authorOne.equals(authorTwo));
    }
}