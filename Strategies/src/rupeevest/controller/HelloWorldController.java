package rupeevest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	
	@RequestMapping("/showForm")
	public String showform()
	{
		return "hellowworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "process-Form";
	}
	
	@RequestMapping("/processFormTwo")
//	public String LetsShout(HttpServletRequest req , Model model)
	public String LetsShout(@RequestParam("StudentName") String name , Model model)
	{
//		String name = req.getParameter("StudentName"); 
		
		name = name.toUpperCase();
		
		model.addAttribute("message", name);
		return "process-Form";
	}
	
}
