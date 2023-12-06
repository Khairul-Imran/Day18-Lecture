package vttp.ssf.Day18Lecture.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.micrometer.core.ipc.http.HttpSender.Response;

@Controller
@RequestMapping("/demo")
public class DemoController {
    
    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        try {
            return new ResponseEntity<>("Hello! Springboot is okay...", HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>("Error running Springboot...", HttpStatus.INTERNAL_SERVER_ERROR); // This is another example of how to return a status code.
        }
    }
    


}
