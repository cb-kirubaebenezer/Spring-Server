package hello.controller.addon;

import hello.model.addonmodel.addon.Addon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddonRepository extends JpaRepository<Addon, Long> {

}