package hello.controller.auth.register;

import hello.model.authmodel.User;
import org.springframework.web.bind.annotation.*;

@RestController
class RegistrationController {

    private final RegistrationRepository repository;

    RegistrationController(RegistrationRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/register")
    User newUser(@RequestBody User user) {
        return repository.save(user);
    }
}
