package hello.controller.plan;
import hello.model.planmodel.plan.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

interface PlanRepository extends JpaRepository<Plan, Long> {

}