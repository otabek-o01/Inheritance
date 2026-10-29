package TextBook;

public class TextBook extends Book {
    private String Subject;
    public TextBook(String BookName, String BookAuthor, String Subject) {
        super(BookName, BookAuthor);
        this.Subject = Subject;
    }

    public static void main(String [] args){
        TextBook textBook = new TextBook("Sahih Buxoriy", "Imom - Albuxoriy" , "HadisIlm");
        System.out.println("Kitob Nomi : " + textBook.BookName);
        System.out.println("Kitob Author : " + textBook.BookAuthor);
        System.out.println("Kitob Subject : " + textBook.Subject);
    }
}
