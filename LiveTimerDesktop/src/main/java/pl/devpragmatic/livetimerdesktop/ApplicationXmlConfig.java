package pl.devpragmatic.livetimerdesktop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.devpragmatic.lifetimer.service.TimeService;

/**
 *
 * @author devpragmatic
 */
public class ApplicationXmlConfig {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationconfig.xml");
        TimeService timeService = ctx.getBean(TimeService.class);
        TimeCircle circle = new TimeCircle();
        circle.run(timeService);
    }
}
