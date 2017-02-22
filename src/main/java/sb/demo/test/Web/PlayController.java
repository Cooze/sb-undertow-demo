package sb.demo.test.Web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.support.DefaultMultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;


@RestController
@RequestMapping(value="/play")
public class PlayController {

    @RequestMapping(value="/hello", method= RequestMethod.GET)
    @ResponseBody
    public String helloWorld(HttpServletRequest request){
        String accessToken = request.getHeader("accessToken");
        Map<String,String[]> map = request.getParameterMap();
        return "{\"msg\":\"I'm play now!\",\"accessToken\":\""+accessToken+"\"}";
    }

    @RequestMapping(value="/hello", method= RequestMethod.POST)
    @ResponseBody
    public String helloWorldPOST(HttpServletRequest request){
        String accessToken = request.getHeader("accessToken");
        StringBuffer requetsBody = new StringBuffer();
        if (request instanceof DefaultMultipartHttpServletRequest) {//多媒体类型（上传）
        } else {//读取请求body中的内容

            byte[] b = new byte[1024];
            try {
                int len;
                while((len = request.getInputStream().read(b)) != -1){
                    requetsBody.append(new String(b, 0, len));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        String body = requetsBody.toString();//json String
        return "{\"msg\":\"I'm play now!\",\"accessToken\":\""+accessToken+"\"}";
    }
}
