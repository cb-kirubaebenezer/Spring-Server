package hello.controller.auth.register;

import hello.model.authmodel.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<User, Long> {

}