package sb.demo.zyys;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/zyys")
public class ZyysController {
    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public String helloWorld(){
        return "zyys";
    }
}
