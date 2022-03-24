
package LabWork_Practice;

/**
 *
 * @author Рыжиков Д.О.
 */
public class Main {
        
    public static void main(String[] args) {
        
    PublishingHouse prospect = new PublishingHouse("Проспект", "Москва");
    PublishingHouse piter = new PublishingHouse("Питер", "Санкт-Петербург");
    PublishingHouse bHv = new PublishingHouse("БХВ", "Санкт-Петебург");
    PublishingHouse dialectics = new PublishingHouse("Диалектика", "Киев");
    
    Books book1 = new Books("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", piter, 2018, new String[]{"Седжвик Роберт", "Уэйн Кевин"});
    Books book2 = new Books("Разработка требований к программному обеспечению. 3-е издание, дополненное", bHv, 2019, "Вигерс Карл");
    Books book3 = new Books("Java. Полное руководство, 10-е издание", dialectics, 2018, "Шилдт Герберт");
    Books book4 = new Books("C/C++. Процедурное программирование", bHv, 2017, "Полубенцева М.И.");
    Books book5 = new Books("Конституция РФ", prospect, 2020);
    Books[] booksArray = new Books[] {book1, book2, book3, book4, book5};
   
    // Работает метод printAll, печатает массив booksArray
        System.out.println("Работает метод printAll, печатает массив booksArray.\n");
    for(Books book : booksArray) 
        Books.printAll(book);
    
    System.out.println("\nИсправляем ошибку в городе издательства БХВ\n"); 
    // Исправляем ошибку в городе издательства "БХВ"
    bHv.setPublishingHouseCity("Санкт-Петербург");
    
    // Работает метод printAll, еще раз печатаем массив booksArray с исправленным городом в издательстве БХВ
    System.out.println("Работает метод printAll, печатает массив booksArray с исправленным городом Санкт-Петербург\n");
    for(Books book : booksArray) 
        Books.printAll(book);
    
    System.out.println("\nДемонстрация работы метода print\n");
    // Демонстрация работы метода print()
    for(Books book : booksArray) 
        book.print();
    
    System.out.println("\nДемонстрация работы метода getAuthorsQuantity\n");
    // Демонстрация работы метода getAuthorsQuantity()
    for(Books book : booksArray) 
        System.out.println(book.getAuthorsQuantity());
    
    System.out.println("\nДемонстрация работы метода getAuthorByIndex(int index)\n");
    // Демонстрация работы метода getAuthorByIndex(int index)
    for(Books book : booksArray) {
        System.out.println("Следующая книга: ");   
        for(int i = 0; i < book.getAuthorsArray().length; i++) 
        System.out.println("С индексом " + i + " " + book.getAuthorByIndex(i));   
        }
    }       
}
 
    

