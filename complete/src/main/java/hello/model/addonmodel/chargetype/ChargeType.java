package hello.model.addonmodel.chargetype;

import hello.model.addonmodel.type.NonRecurring;
import hello.model.addonmodel.type.Recurring;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ChargeType {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Recurring recurring;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private NonRecurring nonRecurring;
    private boolean isRecurring;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isRecurring() {
        return isRecurring;
    }

    public void setRecurring(Recurring recurring) {
        this.recurring = recurring;
        isRecurring = true;
    }

    public void setNonRecurring(NonRecurring nonRecurring) {
        this.nonRecurring = nonRecurring;
        isRecurring = false;
    }
}
