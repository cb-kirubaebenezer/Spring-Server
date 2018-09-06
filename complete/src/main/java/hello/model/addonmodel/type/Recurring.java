package hello.model.addonmodel.type;

import hello.model.addonmodel.addonconfig.AddonApplicablity;
import hello.model.cycle.Cycle;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Recurring {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Cycle cycle;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private AddonApplicablity addonApplicablity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cycle getCycle() {
        return cycle;
    }

    public void setCycle(Cycle cycle) {
        this.cycle = cycle;
    }

    public AddonApplicablity getAddonApplicablity() {
        return addonApplicablity;
    }

    public void setAddonApplicablity(AddonApplicablity addonApplicablity) {
        this.addonApplicablity = addonApplicablity;
    }
}
