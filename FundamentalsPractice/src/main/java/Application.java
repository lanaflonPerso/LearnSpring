import com.practice.spring.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {

	    //Hard Code way
		//CustomerService service = new CustomerServiceImpl();

        //Setter injection
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service = applicationContext.getBean("customerService", CustomerService.class);

		System.out.println(service.findAll().get(0).getFirstname());
	}

}
