package manj.springframework.sfdependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import manj.springframework.sfdependencyinjection.controllers.ConstructorInjectedController;
import manj.springframework.sfdependencyinjection.controllers.GreetingController;
import manj.springframework.sfdependencyinjection.controllers.I18nController;
import manj.springframework.sfdependencyinjection.controllers.MyController;
import manj.springframework.sfdependencyinjection.controllers.PetController;
import manj.springframework.sfdependencyinjection.controllers.PropertyInjectedController;
import manj.springframework.sfdependencyinjection.controllers.SetterInjectedController;
import manj.springframework.sfdependencyinjection.examplebeans.FakeDataSource;
import manj.springframework.sfdependencyinjection.examplebeans.FakeJMSBroker;

@ComponentScan(basePackages = "manj.springframework.sfdependencyinjection")
@SpringBootApplication
public class SfDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfDependencyInjectionApplication.class, args);

		/*
		 * PetController petController = ctx.getBean("petController",
		 * PetController.class); System.out.println("--- The Best Pet is ---");
		 * System.out.println(petController.whichPetIsTheBest());
		 * 
		 * I18nController i18nController = (I18nController)
		 * ctx.getBean("i18nController"); System.out.println(i18nController.sayHello());
		 */
		
		System.out.println("------Primary Bean");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());
		
		GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
		System.out.println(greetingController.sayGreeting());

		/*
		 * System.out.println("------Property"); PropertyInjectedController
		 * propertyInjectedController = (PropertyInjectedController) ctx
		 * .getBean("propertyInjectedController");
		 * System.out.println(propertyInjectedController.getGreeting());
		 * 
		 * System.out.println("------Setter"); SetterInjectedController
		 * setterInjectedController = (SetterInjectedController) ctx
		 * .getBean("setterInjectedController");
		 * System.out.println(setterInjectedController.getGreeting());
		 * 
		 * System.out.println("------Constructor"); ConstructorInjectedController
		 * constructorInjectedController = (ConstructorInjectedController) ctx
		 * .getBean("constructorInjectedController");
		 * System.out.println(constructorInjectedController.getGreeting());
		 */
		
		System.out.println("------Data Source");
		FakeDataSource fakeDataSource =(FakeDataSource)ctx.getBean(FakeDataSource.class);
		System.out.println("Datasource user :"+fakeDataSource.getUser());
		
		System.out.println("------JMS Broker");
		FakeJMSBroker fakeJMSBroker =(FakeJMSBroker) ctx.getBean(FakeJMSBroker.class);
		System.out.println("JMS user :"+fakeJMSBroker.getUsername());
	}

}
