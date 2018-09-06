package hello.controller.plan;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class PlanNotFoundException extends RuntimeException{
    public PlanNotFoundException(Long meetingId){
        super("Meeting " + meetingId + " does not exist.");
    }
}