package sb.demo.test.Web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/play")
public class PlayController {

    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public String helloWorld(){
        return "{\"msg\":\"I'm play now!\"}";
    }
}
