package sb.demo.init;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class Init implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println(" .....init spring boot...... ");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
