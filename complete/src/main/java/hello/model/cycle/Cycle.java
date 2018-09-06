package hello.model.cycle;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Cycle {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isWeeks() {
        return weeks;
    }

    public void setWeeks(boolean weeks) {
        this.weeks = weeks;
        this.chosenCycle = "Weeks";
    }

    public boolean isMonths() {
        return months;
    }

    public void setMonths(boolean months) {
        this.months = months;
        this.chosenCycle = "Months";
    }

    public boolean isYears() {
        return years;
    }

    public void setYears(boolean years) {
        this.years = years;
        this.chosenCycle = "Years";
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public String getChosenCycle() {
        return chosenCycle;
    }

    public void setChosenCycle(String chosenCycle) {
        this.chosenCycle = chosenCycle;
    }

    private boolean weeks;
    private boolean months;
    private boolean years;
    private Long value;
    private String chosenCycle;

}
