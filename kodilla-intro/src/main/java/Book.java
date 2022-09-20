public class Book {
    private String author;
    private String title;

    public Book (String author, String title){
        this.author=author;
        this.title=title;
    }

    public static String of (String author, String title){
       Book book =new Book(author,title);
       System.out.println(book.author+" "+book.title);
        return book.toString();
    }
    public static void main (String[]args){
        String book = Book.of("Isaac Asimov", "The Galaxy");;
    }

}
