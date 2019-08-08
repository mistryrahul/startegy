package rupeevest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zerodhatech.kiteconnect.KiteConnect;

@Controller
@RequestMapping("/Strategy")
public class StrategyController {
   
	
	@RequestMapping("/getTickData")
	public String showTicks()
	{
		if(loginCheck())
		{
			return "tickData-update";
		}
		else
		{   
			
			KiteConnect kiteConnect = new KiteConnect("t8hgzuuqo9fke9j2");
			kiteConnect.setUserId("PS3288");
			String url = kiteConnect.getLoginURL();
//			System.out.println("Url:----"+url);
			
			return url;
		}
		
		
	}

	private boolean loginCheck() 
	{
        // Check Databse if access token exist.	    	
		return false;
	}
		
	
	
	
}
