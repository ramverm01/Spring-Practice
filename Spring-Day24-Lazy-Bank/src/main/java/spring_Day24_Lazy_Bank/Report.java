package spring_Day24_Lazy_Bank;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Report 
{
	public void generateReport()
	{
		System.out.println("Report Generated successfully");
	}
}
