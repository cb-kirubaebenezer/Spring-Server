package hello.model.planmodel.pricingmodel.pricing;

import hello.model.cycle.Cycle;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class PerUnit {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getFreeQuantity() {
        return freeQuantity;
    }

    public void setFreeQuantity(Long freeQuantity) {
        this.freeQuantity = freeQuantity;
    }

    public Cycle getCycle() {
        return cycle;
    }

    public void setCycle(Cycle cycle) {
        this.cycle = cycle;
    }

    public Long getNoOfBillingCycles() {
        return noOfBillingCycles;
    }

    public void setNoOfBillingCycles(Long noOfBillingCycles) {
        this.noOfBillingCycles = noOfBillingCycles;
    }

    private Long freeQuantity;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Cycle cycle;
    private Long noOfBillingCycles;
}
