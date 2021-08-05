package ss;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

public class ContextLoaderListener2 extends ContextLoaderListener {

	public ContextLoaderListener2() {
		super();
		System.out.println("00. ContextLoaderListener2");
	}
	public void contextInitialized(ServletContextEvent event) {
		super.contextInitialized(event);
		System.out.println("01. ContextLoaderListener2 > contextInitialized, event:" + event);
	}
	public ContextLoaderListener2(WebApplicationContext context) {
		super(context);
		System.out.println("ContextLoaderListener2 ??");
	}
}
