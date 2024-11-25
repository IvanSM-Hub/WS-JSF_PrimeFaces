package com.jsfstarterproject.internationalization;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class NameBean {
	
	private String name;
	private String greeting;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	public void submit() {
		if ( name != null && !name.isEmpty() ) greeting ="Hello, " + name + "!";
	}

}
