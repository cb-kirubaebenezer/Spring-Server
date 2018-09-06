package hello.controller.auth.login;

import hello.model.authmodel.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<User, Long> {

}