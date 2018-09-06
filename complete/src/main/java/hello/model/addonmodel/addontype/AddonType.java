package hello.model.addonmodel.addontype;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity
public class AddonType {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Long quantity;
    private Long unitOfMeasure;
    private String currentAddonType;
    private boolean isOnOff;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.currentAddonType = "Quantity based";
        this.quantity = quantity;
    }

    public Long getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(Long unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getCurrentAddonType() {
        return currentAddonType;
    }

    public void setCurrentAddonType(String currentAddonType) {
        this.currentAddonType = currentAddonType;
    }

    public boolean isOnOff() {
        return isOnOff;
    }

    public void setOnOff(boolean onOff) {
        this.currentAddonType = "OnOff based";
        isOnOff = onOff;
    }
}
