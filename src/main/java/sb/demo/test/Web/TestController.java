package sb.demo.test.Web;

import sb.demo.test.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;


@RestController
@RequestMapping(value="/test")
public class TestController {

    @Autowired
    private HelloService service;

    @RequestMapping(value="/hello", method= RequestMethod.GET, consumes = "application/json")
    public String helloWorld(){
        return this.service.getMassege();
    }

    @RequestMapping(value="/async", method= RequestMethod.GET)
    public Callable<String> helloWorldAsync() {
        return new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "async: " + TestController.this.service.getMassege();
            }
        };

    }

}
