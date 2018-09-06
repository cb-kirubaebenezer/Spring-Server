package hello.model.addonmodel.addonconfig;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


@Data
@Entity
public class Event implements Serializable {
    public static  final String SUBSCRIPTION_CREATION = "Subscription Creation";
    public static  final String SUBCRIPTION_TRIAL_START = "Subscription Trial Start";
    public static  final String PLAN_ACTIVATION = "Plan Activation";
    public static  final String SUBSCRIPTION_ACTIVATION = "Subscription Activation";
    public static  final String ON_DEMAND = "On Demand";
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private boolean subscriptionCreation;
    private boolean subcriptionTrailStart;
    private boolean planActivation;
    private boolean subscriptionActivation;
    private boolean onDemand;
    private String chosenEvent;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isSubscriptionCreation() {
        return subscriptionCreation;
    }

    public void setSubscriptionCreation(boolean subscriptionCreation) {
        chosenEvent = SUBSCRIPTION_CREATION;
        this.subscriptionCreation = subscriptionCreation;
    }

    public boolean isSubcriptionTrailStart() {
        return subcriptionTrailStart;
    }

    public void setSubcriptionTrailStart(boolean subcriptionTrailStart) {
        chosenEvent = SUBCRIPTION_TRIAL_START;
        this.subcriptionTrailStart = subcriptionTrailStart;
    }

    public boolean isPlanActivation() {
        return planActivation;
    }

    public void setPlanActivation(boolean planActivation) {
        chosenEvent = PLAN_ACTIVATION;
        this.planActivation = planActivation;
    }

    public boolean isSubscriptionActivation() {
        return subscriptionActivation;
    }

    public void setSubscriptionActivation(boolean subscriptionActivation) {
        chosenEvent = SUBSCRIPTION_ACTIVATION;
        this.subscriptionActivation = subscriptionActivation;
    }

    public boolean isOnDemand() {
        return onDemand;
    }

    public void setOnDemand(boolean onDemand) {
        chosenEvent = ON_DEMAND;
        this.onDemand = onDemand;
    }

    public String getChosenEvent() {
        return chosenEvent;
    }

    public void setChosenEvent(String chosenEvent) {
        this.chosenEvent = chosenEvent;
    }


}
