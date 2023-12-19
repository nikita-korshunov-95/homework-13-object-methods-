public class Main {
    public static void main(String[] args) {
        Author johnTolkien = new Author ("John", " Tolkien");

        Author levTolstoy = new Author("Lev", " Tolstoy");

        Book lordOfTheRings = new Book("Lord of the Rings", johnTolkien, 1954);
        System.out.println(lordOfTheRings.getTitle());
        System.out.println(lordOfTheRings.getAuthor().getName() + "" + lordOfTheRings.getAuthor().getSurname());
        System.out.println(lordOfTheRings.getPublicationYear());

        lordOfTheRings.setPublicationYear(1955);
        System.out.println(lordOfTheRings.getPublicationYear());

        Book warAndPeace = new Book ("War and Peace", levTolstoy, 1869);
        System.out.println(warAndPeace.getTitle());
        System.out.println(warAndPeace.getAuthor().getName() + "" + warAndPeace.getAuthor().getSurname());
        System.out.println(warAndPeace.getPublicationYear());
        System.out.println(lordOfTheRings.toString());
        System.out.println(warAndPeace.toString());
        System.out.println(johnTolkien.hashCode());
        System.out.println(levTolstoy.hashCode());
        System.out.println(johnTolkien.equals(levTolstoy));
        System.out.println(lordOfTheRings.hashCode());
        System.out.println(warAndPeace.hashCode());
        System.out.println(lordOfTheRings.equals(warAndPeace));
        System.out.println('');

    }
}