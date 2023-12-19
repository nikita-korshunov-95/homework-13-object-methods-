public class Author {
    private String name;
    private String surname;
    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName () {
        return this.name;
    }
    public String getSurname () {
        return this.surname;
    }

    public String toString() {
        return this.name + this.surname;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return name.equals(author.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}
