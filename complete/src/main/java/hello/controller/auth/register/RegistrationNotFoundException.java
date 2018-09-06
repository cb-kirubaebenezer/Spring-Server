package hello.controller.auth.register;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class RegistrationNotFoundException extends RuntimeException{
    public RegistrationNotFoundException(Long meetingId){
        super("Meeting " + meetingId + " does not exist.");
    }
}