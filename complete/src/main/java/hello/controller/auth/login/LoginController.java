package hello.controller.auth.login;

import hello.model.authmodel.User;
import org.springframework.web.bind.annotation.*;

@RestController
class LoginController {

    private final LoginRepository repository;
    LoginController(LoginRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/login/{id}")
    User one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new LoginNotFoundException(id));
    }
}
