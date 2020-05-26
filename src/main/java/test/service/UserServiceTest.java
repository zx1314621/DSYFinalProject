package test.service;

import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;

import po.User;
import service.UserService;
import test.SpringTestCase;


public class UserServiceTest extends SpringTestCase {

    @Autowired  
    private UserService userService; 

    @Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(1);  
        System.out.println(user.getUser_id() + ":" + user.getPassword());
    }  
}
