package hello.controller.auth.login;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class LoginNotFoundException extends RuntimeException{
    public LoginNotFoundException(Long meetingId){
        super("Meeting " + meetingId + " does not exist.");
    }
}