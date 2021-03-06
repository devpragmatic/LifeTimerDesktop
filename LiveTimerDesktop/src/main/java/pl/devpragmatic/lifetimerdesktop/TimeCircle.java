package pl.devpragmatic.lifetimerdesktop;

import java.util.List;
import pl.devpragmatic.lifetimer.domain.Time;
import pl.devpragmatic.lifetimer.service.TimeService;

/**
 *
 * @author devpragmatic
 */
public class TimeCircle {
    
    public void run(TimeService timeService){
        Time time = new Time();
        timeService.add(time);
        System.out.println(time);
        Time timeSecond = new Time();
        timeSecond.setParent(time);
        timeService.add(timeSecond);
        List<Time> times = timeService.getAll();
        System.out.println(times);
        System.out.println(times.get(times.size()-1));
        System.out.println(times.get(times.size()-1).getParent());
    }
}
