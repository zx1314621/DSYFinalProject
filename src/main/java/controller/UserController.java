package controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import po.User;
import service.UserService;

@Controller  
@RequestMapping("/user")
public class UserController {  

    @Resource  
    private UserService userService; 
    
    
    @RequestMapping("/login")
	public ModelAndView signin(HttpSession session,String user_id, String password) throws Exception
	{
    	

    	 User user = userService.selectUserById(Integer.valueOf(user_id));
    	 
		if(user==null)
		{
			ModelAndView modelandview = new ModelAndView();
			modelandview.setViewName("loginfailed");
			return modelandview;
		}
		if(user.getPassword().equals(password)) {
			
			// flag 代表是否登陆 存在session中 可以在其他地方调用
			int flag = 1;
			session.setAttribute("flag", flag); 
			
			session.setAttribute("user_id",user.getUser_id());
			ModelAndView modelandview = new ModelAndView();
			modelandview.setViewName("loginsuccess");
			return modelandview;
		}else {
			ModelAndView modelandview = new ModelAndView();
			modelandview.setViewName("loginfailed");
			return modelandview;
		}
		
	
		
	}
}
