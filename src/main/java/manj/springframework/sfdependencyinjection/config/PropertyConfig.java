package manj.springframework.sfdependencyinjection.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import manj.springframework.sfdependencyinjection.examplebeans.FakeDataSource;
import manj.springframework.sfdependencyinjection.examplebeans.FakeJMSBroker;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
@PropertySources({
	@PropertySource("classpath:datasource.properties"),
	@PropertySource("classpath:jms.properties")
})
public class PropertyConfig {
	
	@Autowired
	Environment env;
	
	@Value("${manj.username}")
	String user;

	@Value("${manj.password}")
	String password;

	@Value("${manj.dburl}")
	String url;
	
	@Value("${manj.jms.username}")
	String jmsUsername;
	
	@Value("${manj.jms.password}")
	String jmspassword;
	
	@Value("${manj.jms.jmsurl}")
	String jmsurl;
	
	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(env.getProperty("USERNAME"));//set environmental var USERNAME , value
		fakeDataSource.setPsw(password);
		fakeDataSource.setUrl(url);
		return fakeDataSource;
	}
	
	@Bean
	public FakeJMSBroker FakeJMSBroker() {
		FakeJMSBroker fakeJMSBroker = new FakeJMSBroker();
		fakeJMSBroker.setUsername(jmsUsername);
		fakeJMSBroker.setPassword(jmspassword);
		fakeJMSBroker.setUrl(jmsurl);
		return fakeJMSBroker;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}

}
