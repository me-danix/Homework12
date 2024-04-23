public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "" +
                "имя: " + firstName +
                ", фамилия: " + lastName +
                "";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Author author = (Author) object;
        return java.util.Objects.equals(firstName, author.firstName) && java.util.Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), firstName, lastName);
    }
}
