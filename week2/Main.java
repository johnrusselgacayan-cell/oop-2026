package week2;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("THE HUNGER GAMES" , "Suzanne Collins" , "978-0439023488" , "2008");
        Book book2 = new Book("The Alchemist" , "Paulo Coelho" , "978-0061122415" , "1988");

        book1.printBookInfo();
        book2.printBookInfo();
    }
}
