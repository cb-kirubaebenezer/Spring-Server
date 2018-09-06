package hello.model.addonmodel.addonconfig;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


@Data
@Entity
public class ApplyCharges implements Serializable {

    public static String ONCE = "Once";
    public static String EVERY_TIME = "Every time this event occurs";
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String once;
    private String everyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOnce() {
        return once;
    }

    public void setOnce(String once) {
        this.once = once;
    }

    public String getEveryTime() {
        return everyTime;
    }

    public void setEveryTime(String everyTime) {
        this.everyTime = everyTime;
    }
}
