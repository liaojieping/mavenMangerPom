package maven.maven.co;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class co {
    @GetMapping("/parent")
      public String aa(){
          return "父";
      }

}
