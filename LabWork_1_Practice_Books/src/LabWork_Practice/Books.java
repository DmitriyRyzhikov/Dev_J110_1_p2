package LabWork_Practice;

public class Books {

    /*     класс для хранения данных о книге со следующими атрибутами:
       o название (строка);
       o издательство (ссылка на экземпляр соответствующего класса);
       o год издания;
       o автор(ы) книги (массив строк), массив не должен содержать пустых ссылок; 
       книга может не иметь авторов  
     */
    private String bookName;
    private PublishingHouse publishingHouse;
    private int bookYear;
    private String[] authors;

    //конструктор, инициализирующий экземпляр объекта следующими значениями: название, год издания, издательство (для случая, если авторов нет);
    public Books(String bookName, PublishingHouse publishingHouse, int bookYear) {
        setBookName(bookName);
        setPublishingHouse(publishingHouse);
        setBookYear(bookYear);
    }

    //конструктор, инициализирующий экземпляр объекта следующими значениями: название, список (массив) авторов, год издания, издательство;
    public Books(String bookName, PublishingHouse publishingHouse, int bookYear, String[] authors) {
        this(bookName, publishingHouse, bookYear);
        setAuthors(authors);
    }

    //конструктор, инициализирующий экземпляр объекта следующими значениями: название, год издания, издательство, 1 автор;
    public Books(String bookName, PublishingHouse publishingHouse, int bookYear, String author) {
        this(bookName, publishingHouse, bookYear);
        setAuthors(new String[]{author});
    }

    //get-методы, возвращающие значения соответствующих атрибутов;
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

    //set-методы, устанавливающие значения соответствующих атрибутов
    public final void setBookName(String bookName) {

        if (bookName != null && !bookName.trim().isEmpty()) {
            this.bookName = bookName.trim();
        } else {
            throw new IllegalArgumentException("Книга должна иметь название.");
        }
    }

    public final void setBookYear(int bookYear) {

        if (bookYear > 0) {
            this.bookYear = bookYear;
        } else {
            throw new IllegalArgumentException("Неверный год издания книги.");
        }
    }
    // set-метод для массива авторов. Если массив == null, авторов нет. 
    public final void setAuthors(String[] authors) {
        
        if (authors != null) {
                for (int i = 0; i < authors.length; i++) {
                    if (authors[i] != null && !authors[i].trim().isEmpty()) 
                        authors[i] = authors[i].trim();
                    else 
                        throw new IllegalArgumentException("Не указаны данные об авторах книги, либо указаны некорректно.");                   
                }
                this.authors = authors;
            }
        else 
            this.authors = authors;
        
    }

    public final void setPublishingHouse(PublishingHouse publishingHouse) {

        if (publishingHouse != null) {
            this.publishingHouse = publishingHouse;
        } else {
            throw new IllegalArgumentException("Не указаны данные об издательстве, либо указаны частично");
        }
    }

    // Метод, возвращающий количество авторов книги.
    
    public int getAuthorsQuantity() {
       if(authors != null)
           return authors.length;
       else
           return 0;
    }

    // Метод, возвращающий автора книги с заданным индексом.
    
    public String getAuthorByIndex(int index) {
        if(authors != null && index >= 0 && index < authors.length)
            return authors[index];
        else
            throw new IllegalArgumentException("Индекс автора задан некорректно, либо у книги нет авторов.");
    }

    //метод print, печатающий данные о книге: название, авторы (если есть), издательство, год издания;
    
    public void print() {

        String bN = "Название книги:";
        String bA = "Автор(ы):";
        String noA = "у этой книги авторов нет.";
        String pH = "Издательство:";
        String pHcity = "город";
        String yPub = "Год публикации:";

        if (authors != null) {
            System.out.printf("%s %s %s ", bN, bookName, bA);
            for (String a : authors) {
                System.out.print(a + ", ");
            }
            System.out.printf("%s %s (%s %s); %s %d%n", pH, publishingHouse.getPublishingHouseName(), pHcity, publishingHouse.getPublishingHouseCity(), yPub, bookYear);
        }
        else
            System.out.printf("%s %s %s %s %s %s (%s %s); %s %d%n", bN, bookName, bA, noA, pH, publishingHouse.getPublishingHouseName(), pHcity, publishingHouse.getPublishingHouseCity(), yPub, bookYear);
    }

    //статический метод printAll, печатающий данные обо всех книгах заданного массива.
    
    public static void printAll(Books[] books) {

        String bN = "Название книги:";
        String bA = "Автор(ы):";
        String noA = "у этой книги авторов нет.";
        String pH = "Издательство:";
        String pHcity = "город";
        String yPub = "Год публикации:";
        
        for(Books book : books) {
           if (book.authors != null) {
            System.out.printf("%s %s %s ", bN, book.bookName, bA);
            for (String a : book.authors) {
                System.out.print(a + ", ");
            }
            System.out.printf("%s %s (%s %s); %s %d%n", pH, book.publishingHouse.getPublishingHouseName(), pHcity, book.publishingHouse.getPublishingHouseCity(), yPub, book.bookYear);
        }
        else
            System.out.printf("%s %s %s %s %s %s (%s %s); %s %d%n", bN, book.bookName, bA, noA, pH, book.publishingHouse.getPublishingHouseName(), pHcity, book.publishingHouse.getPublishingHouseCity(), yPub, book.bookYear);
            
        }
    }
}
