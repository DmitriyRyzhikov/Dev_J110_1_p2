
package LabWork_Practice;

/**
 *
 * @author dmitr
 */

public class Books {
    
    private String bookName;
    private PublishingHouse publishingHouse;
    private int bookYear;
    private String[] authors;
    private static final String W_AUTHORS = "У этой книги нет авторов. Эта запись в списке авторов занимает строк: ";
    private static final String B_NAME = "Название книги: ";
    private static final String B_AUTHORS = "; Автор(ы): ";
    private static final String NO_AUTHORS = "У этой книги авторов нет. ";
    private static final String PUBLISHING_HOUSE = " Издательство: ";
    private static final String PUBLISHING_HOUSE_CITY = " (город ";
    private static final String YEAR_OF_PUBLICATION = "); Год публикации: ";

    public Books(String bookName, PublishingHouse publishingHouse, int bookYear, String[] authors) {
        this(bookName, publishingHouse, bookYear);
        this.authors = authors;
    }
    public Books(String bookName, PublishingHouse publishingHouse, int bookYear) {
        this.bookName = bookName;
        this.publishingHouse = publishingHouse;
        this.bookYear = bookYear;
        this.authors = new String[] {null};
    }
    public Books(String bookName, PublishingHouse publishingHouse, int bookYear, String author) {
        this(bookName, publishingHouse, bookYear);
        this.authors = new String[] {author};
    }
    public String getBookName() {
        return bookName;
    } 
    public int getBookYear() {
        return bookYear;
    }
    public String[] getAuthorsArray() { 
        return authors;
    }
    public PublishingHouse getPublishingHouse() {
        return publishingHouse;
    }
        // Метод, возвращающий количество авторов книги.
    public int getAuthorsQuantity() {
        if(authors[0] == null) {
            System.out.print(W_AUTHORS);
            return authors.length;
        }
        else {
            System.out.print("Количество записей в списке авторов: ");
            return authors.length; }
    }
    // Метод, возвращающий автора книги с заданным индексом.
    public String getAuthorByIndex(int index) {
        if(authors.length <= index && index != 0 && authors[0] != null) 
           throw new ArrayIndexOutOfBoundsException("Автора с таким индексом не существует. В списке авторов всего записей: " + authors.length + "."); 
        else if(authors[0] == null) 
           return W_AUTHORS + authors.length + "."; 
        else 
           return "Автор: " + authors[index]; 
    }
    public void setBookName(String bookName) {
        if(bookName == null)
           throw new IllegalArgumentException ("Книга должна иметь название.");
        this.bookName = bookName;
    }
    public void setBookYear(int bookYear) {
        if(bookYear <= 0)
           throw new IllegalArgumentException ("Неверный год издания книги.");
        this.bookYear = bookYear;
    }
    public void setAuthors(String[] authors) {
        if(authors == null)
           throw new IllegalArgumentException ("Не указаны данные об авторах книги");
        this.authors = authors;
    }
    public void setPublishingHouse(PublishingHouse publishingHouse) {
        if(publishingHouse == null || publishingHouse.getPublishingHouseName() == null || publishingHouse.getPublishingHouseCity() == null)
           throw new IllegalArgumentException ("Не указаны данные об издательстве, либо указаны частично");           
        this.publishingHouse = publishingHouse;
    }
    public void print() {       
        System.out.print(B_NAME + bookName + B_AUTHORS);
        for(int i = 0; i < authors.length; i++) {
            if(authors[0] == null)
               System.out.print(NO_AUTHORS);
            else if(i == authors.length - 1)                
               System.out.print(authors[i] + ";");
            else
                System.out.print(authors[i] + ", "); }
        System.out.println(PUBLISHING_HOUSE + publishingHouse.getPublishingHouseName() + PUBLISHING_HOUSE_CITY + publishingHouse.getPublishingHouseCity() + YEAR_OF_PUBLICATION + bookYear + ";");        
    }
    public static void printAll(Books book) {
        System.out.print(B_NAME + book.getBookName() + B_AUTHORS);
        for(int i = 0; i < book.getAuthorsArray().length; i++) {
            if(book.getAuthorsArray()[0] == null)
               System.out.print(NO_AUTHORS);
            else if(i == book.getAuthorsArray().length - 1)                
               System.out.print(book.getAuthorsArray()[i] + ";");
            else
                System.out.print(book.getAuthorsArray()[i] + ", "); }
        System.out.println(PUBLISHING_HOUSE + book.getPublishingHouse().getPublishingHouseName() + PUBLISHING_HOUSE_CITY + book.getPublishingHouse().getPublishingHouseCity() + YEAR_OF_PUBLICATION + book.getBookYear() + ";");        
    }
}
