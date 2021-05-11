package test.co;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class co {
    @GetMapping("/child")
      public String aa(){
          return "子2";
      }

}
