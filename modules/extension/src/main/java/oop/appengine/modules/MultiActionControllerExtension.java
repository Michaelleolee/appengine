package oop.appengine.modules;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Kevin
 * Date: 13-4-2
 * Time: 下午3:43
 * To change this template use File | Settings | File Templates.
 */
public class MultiActionControllerExtension extends MultiActionController {
    public void writeStream(HttpServletResponse response, String stream) {
        try {
            response.setContentType("application/json; charset=UTF-8");
            response.getWriter().print(stream);
            response.getWriter().flush();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    protected String getHostUrl(HttpServletRequest request) {
        String host = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
        return host;
    }
}
