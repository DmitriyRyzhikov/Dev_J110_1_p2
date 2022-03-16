
package LabWork_Practice;

/**
 *
 * @author dmitr
 */
public class PublishingHouse {
    
    private String publishingHouseName, publishingHouseCity;
    
    public PublishingHouse(String publishingHouseName, String publishingHouseCity) {
        this.publishingHouseName = publishingHouseName;
        this.publishingHouseCity = publishingHouseCity;
    }
    public String getPublishingHouseName() {
        return publishingHouseName;
    }
    public String getPublishingHouseCity() {
        return publishingHouseCity;
    }
    public void setPublishingHouseName(String publishingHouseName) {
        if(publishingHouseName == null)
           throw new IllegalArgumentException ("У издательство должно быть название.");
        this.publishingHouseName = publishingHouseName;
    }
    public void setPublishingHouseCity(String publishingHouseCity) {
        if(publishingHouseCity == null)
           throw new IllegalArgumentException ("Не указан город, в котором находится издательство.");
        this.publishingHouseCity = publishingHouseCity;
    }
}