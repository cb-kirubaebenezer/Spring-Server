package hello.controller.addon;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class AddonNotFoundException extends RuntimeException{
    public AddonNotFoundException(Long meetingId){
        super("Meeting " + meetingId + " does not exist.");
    }
}