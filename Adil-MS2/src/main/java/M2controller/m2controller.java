package M2controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import di.DI;

@Controller
public class m2controller {
	@Autowired
	DI d;
	
	@RequestMapping("/mi2")
	public String home(@RequestBody User object)
	{
		
		System.out.println(object);
		d.save(object);
		return "hello";
	}
	
}
