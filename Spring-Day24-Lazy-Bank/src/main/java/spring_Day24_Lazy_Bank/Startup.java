package spring_Day24_Lazy_Bank;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Startup 
{
	public Startup()
	{
		System.out.println("💻 Starting the Bank Server");
		System.out.println("🔐 Verifying Security Certificates");
		System.out.println("🗄️ Connecting to the Database");
		System.out.println("🌐 Establishing Network Connection");
		System.out.println("✅ Displaying Bank is Ready");
	}
}
