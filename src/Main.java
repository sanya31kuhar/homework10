import jdk.nashorn.internal.ir.CallNode;

public class Main {

    public static void main(String[] args) {
        Author dostoewsky = new Author("Федор", "Достоевский");
        Author bunin = new Author("Иван", "Бунин");
         Book book= new Book("Бесы", dostoewsky, 1845);
        Book book1 = new Book("Tеплоход", bunin, 1875);
        System.out.println(book);
        System.out.println(book1);
        book.setPublicationYear(1853);
        System.out.println(book.getPublicationYear());
        System.out.println(book1.getName() + " " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurName()+" " + book1.getPublicationYear());

    }
}
