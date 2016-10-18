package pl.devpragmatic.lifetimerdesktop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.devpragmatic.lifetimer.service.TimeService;
import pl.devpragmatic.lifetimerdesktop.config.PersistenceContext;

/**
 *
 * @author devpragmatic
 */
public class Application{
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PersistenceContext.class);
        TimeService timeService = ctx.getBean(TimeService.class);
        TimeCircle circle = new TimeCircle();
        circle.run(timeService);
    }
}
