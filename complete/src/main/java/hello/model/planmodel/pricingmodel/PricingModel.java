package hello.model.planmodel.pricingmodel;

import hello.model.planmodel.pricingmodel.pricing.FlatFee;
import hello.model.planmodel.pricingmodel.pricing.PerUnit;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class PricingModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FlatFee getFlatFee() {
        return flatFee;
    }

    public void setFlatFee(FlatFee flatFee) {
        this.flatFee = flatFee;
    }

    public PerUnit getPerUnit() {
        return perUnit;
    }

    public void setPerUnit(PerUnit perUnit) {
        this.perUnit = perUnit;
    }

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private FlatFee flatFee;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private PerUnit perUnit;

}
