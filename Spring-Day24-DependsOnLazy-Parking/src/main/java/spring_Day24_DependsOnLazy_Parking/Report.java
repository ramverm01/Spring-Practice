package spring_Day24_DependsOnLazy_Parking;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Report
{
    public Report()
    {
        System.out.println("Report Bean Created...");
    }

    public void getReport()
    {
        System.out.println("Daily Parking Report Generated Successfully...");
    }
}
