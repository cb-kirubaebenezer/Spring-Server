package hello.model.addonmodel.addonconfig;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class AddonApplicablity implements Serializable {

    public static final String OPTIONAL = "OPTIONAL";
    public static final String RECOMMENDED = "RECOMMENDED";
    public static final String MANDATORY = "MANDATORY";

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String optional;
    private String recommended;
    private String mandatory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOptional() {
        return optional;
    }

    public void setOptional(String optional) {
        this.optional = optional;
    }

    public String getRecommended() {
        return recommended;
    }

    public void setRecommended(String recommended) {
        this.recommended = recommended;
    }

    public String getMandatory() {
        return mandatory;
    }

    public void setMandatory(String mandatory) {
        this.mandatory = mandatory;
    }


}
