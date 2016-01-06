package bg.btodorov.model;
import org.springframework.data.annotation.Id;
/**
 * Created by btodorov on 1/6/16.
 */
public class Place {
    @Id
    private String id;

    private String name;
    private String details;

    private String lat;
    private String lng;

    public Place(){}
    
    public Place(String name, String details, String lat, String lng) {
        this.name = name;
        this.details = details;
        this.lat = lat;
        this.lng = lng;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }
}
