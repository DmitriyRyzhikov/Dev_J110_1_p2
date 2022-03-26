
package LabWork_Practice;

public class Main {
        
    public static void main(String[] args) {
        
    //Создайте объекты для следующих издательств:    
    
    PublishingHouse prospect = new PublishingHouse("Проспект", "Москва");
    PublishingHouse piter = new PublishingHouse("Питер", "Санкт-Петербург");
    PublishingHouse bHv = new PublishingHouse("БХВ", "Санкт-Петебург");
    PublishingHouse dialectics = new PublishingHouse("Диалектика", "Киев");
    
    //Создайте массив из нескольких книг, заполните его следующими данными:
    
    Books book1 = new Books("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", piter, 2018, new String[]{"Седжвик Роберт", "Уэйн Кевин"});
    Books book2 = new Books("Разработка требований к программному обеспечению. 3-е издание, дополненное", bHv, 2019, "Вигерс Карл");
    Books book3 = new Books("Java. Полное руководство, 10-е издание", dialectics, 2018, "Шилдт Герберт");
    Books book4 = new Books("C/C++. Процедурное программирование", bHv, 2017, "Полубенцева М.И.");
    Books book5 = new Books("Конституция РФ", prospect, 2020);
    Books[] booksArray = new Books[] {book1, book2, book3, book4, book5};
    
    
    //Печатает массив метод print().

    for(Books book : booksArray) 
           book.print();
    
    System.out.println();
    
    //Печатает массив метод printAll(Books[] books).    
    
    Books.printAll(booksArray); 
    
    System.out.println();
   
    //Исправляем ошибку в названии города издательства «БХВ».
    
    bHv.setPublishingHouseCity("Санкт-Петербург");
    
 /*   Печатает массив ещё раз. В комментариях ко второму вызову печати массива напишите, 
    почему вывод изменился для всех книг, изданных издательством «БХВ»
    Изменения внесены в bHv, который является экземпляром класса PublishingHouse. Эти изменения коснутся всех объектов, класса Books,
    если их поле private PublishingHouse publishingHouse ссылается на bHv.
 */   
     Books.printAll(booksArray); 
    }
}    

