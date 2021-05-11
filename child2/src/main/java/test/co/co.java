package test.co;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class co {
    @GetMapping("/child1")
      public String aa(){
          return "远程分支";
      }

}
