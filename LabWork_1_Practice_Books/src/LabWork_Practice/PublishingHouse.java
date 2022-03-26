
package LabWork_Practice;

    //класс для хранения сведений об издательстве с атрибутами «Название издательства» и «Город»

public class PublishingHouse {
    
    private String publishingHouseName; 
    private String publishingHouseCity;
    
    //конструктор
    public PublishingHouse(String publishingHouseName, String publishingHouseCity) {
        
        setPublishingHouseName(publishingHouseName);
        setPublishingHouseCity(publishingHouseCity); 
       
     // get-методы, возвращающие значения соответствующих атрибутов
    }
    public String getPublishingHouseName() {
        return publishingHouseName;
        
    }
    public String getPublishingHouseCity() {
        return publishingHouseCity;
      
     // set-методы, устанавливающие значения соответствующих атрибутов. Сеттеры с проверкой на null, лишние пробелы и пустую строку   
    }
    public final void setPublishingHouseName(String publishingHouseName) {
        
        if(publishingHouseName != null && !publishingHouseName.trim().isEmpty())
           this.publishingHouseName = publishingHouseName.trim();
        
        else
           throw new IllegalArgumentException ("У издательство должно быть название.");
    }
    public final void setPublishingHouseCity(String publishingHouseCity) {
        
        if(publishingHouseCity != null && !publishingHouseCity.trim().isEmpty())
           this.publishingHouseCity = publishingHouseCity.trim(); 
        
        else
           throw new IllegalArgumentException ("Не указан город, в котором находится издательство.");        
    }
    
}