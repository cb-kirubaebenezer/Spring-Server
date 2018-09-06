package hello.model.addonmodel.addon;


import hello.model.addonmodel.addontype.AddonType;
import hello.model.addonmodel.chargetype.ChargeType;
import hello.model.planmodel.plan.Plan;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Embeddable
@Data
@Entity
public class Addon {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String addonId;
    private String name;
    private String invoiceName;
    private String description;
    private Double price;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private ChargeType chargeType;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private AddonType addonType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddonId() {
        return addonId;
    }

    public void setAddonId(String addonId) {
        this.addonId = addonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ChargeType getChargeType() {
        return chargeType;
    }

    public void setChargeType(ChargeType chargeType) {
        this.chargeType = chargeType;
    }

    public AddonType getAddonType() {
        return addonType;
    }

    public void setAddonType(AddonType addonType) {
        this.addonType = addonType;
    }
}
