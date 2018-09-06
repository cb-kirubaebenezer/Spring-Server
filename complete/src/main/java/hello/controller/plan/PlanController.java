package hello.controller.plan;
import hello.controller.addon.*;
import hello.model.planmodel.plan.Plan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Optional;

@RestController
class PlanController {
    private static final Logger log = LoggerFactory.getLogger(PlanController.class);
    @Autowired
    private final PlanRepository repository;
    EntityManagerFactory factory =
            Persistence.createEntityManagerFactory("jpa-example");
    EntityManager em = factory.createEntityManager();

    PlanController(PlanRepository repository, AddonRepository addonRepository) {
        this.repository = repository;
    }

    @GetMapping("/plans")
    @CrossOrigin(origins = "*")
    List<Plan> all() {
        return repository.findAll();
    }

    @GetMapping("/plans/{id}")
    @CrossOrigin(origins = "*")
    Optional<Plan> fetchOneById(@PathVariable Long id) {
        log.info("" + id);
        return repository.findById(id);
    }


    @PostMapping("/plan/new")
    @CrossOrigin(origins = "*")
    Plan newPlan(@RequestBody Plan plan) {
        log.info(" " + plan.getId());
        return repository.save(plan);
    }

    @GetMapping("/plan/{id}/details")
    @CrossOrigin(origins = "*")
    Plan one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new PlanNotFoundException(id));
    }
    @PutMapping("/plan/{id}/edit")
    @CrossOrigin(origins = "*")
    Plan replacePlan(@RequestBody Plan plan, @PathVariable Long id) {
        return repository.findById(id)
            .map(newPlan -> {
                newPlan.setName(plan.getName());
                newPlan.setInvoiceName(plan.getInvoiceName());
                newPlan.setDescription(plan.getDescription());
                newPlan.setPrice(plan.getPrice());
                newPlan.setSetupCost(plan.getSetupCost());
                newPlan.setFreeTrail(plan.getFreeTrail());
                newPlan.setPricingModel(plan.getPricingModel());
                newPlan.setAddonApplicablityType(plan.getAddonApplicablityType());
                return repository.save(newPlan);
            })
            .orElseGet(() -> {
                return repository.save(plan);
            });
    }

    @DeleteMapping("/plan/{id}")
    @CrossOrigin(origins = "*")
    void deletePlan(@PathVariable Long id) {
        repository.deleteById(id);
    }
}