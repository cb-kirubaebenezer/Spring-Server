package hello.model.planmodel.plan;

import hello.model.addonmodel.addon.Addon;
import hello.model.planmodel.pricingmodel.PricingModel;
import hello.model.planmodel.trial.FreeTrail;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;


@Data
@Entity
public class Plan {
    @Id @GeneratedValue (strategy= GenerationType.IDENTITY)
    private Long id;
    private String planId;
    private String name;
    private String invoiceName;
    private String description;
    private Double price;
    private Double setupCost;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private PricingModel pricingModel;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private FreeTrail freeTrail;
    private String addonApplicablityType;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String id) {
        this.planId = id;
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

    public Double getSetupCost() {
        return setupCost;
    }

    public void setSetupCost(Double setupCost) {
        this.setupCost = setupCost;
    }

    public PricingModel getPricingModel() {
        return pricingModel;
    }

    public void setPricingModel(PricingModel pricingModel) {
        this.pricingModel = pricingModel;
    }

    public FreeTrail getFreeTrail() {
        return freeTrail;
    }

    public void setFreeTrail(FreeTrail freeTrail) {
        this.freeTrail = freeTrail;
    }
    public String getAddonApplicablityType() {
        return addonApplicablityType;
    }

    public void setAddonApplicablityType(String addonApplicablityType) {
        this.addonApplicablityType = addonApplicablityType;
    }
}
