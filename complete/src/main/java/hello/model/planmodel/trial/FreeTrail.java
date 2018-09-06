package hello.model.planmodel.trial;

import hello.model.cycle.Cycle;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class FreeTrail {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public boolean isTrailAvailble() {
        return isTrailAvailble;
    }

    public void setTrailAvailble(boolean trailAvailble) {
        isTrailAvailble = trailAvailble;
    }

    public Cycle getCycle() {
        return cycle;
    }

    public void setCycle(Cycle cycle) {
        this.cycle = cycle;
    }

    private boolean isTrailAvailble;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Cycle cycle;
}
