package com.Stock.test;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Stock.Entities.Company;
import com.Stock.Services.UserService;


public class TestException {

@Test
public void testEmptyCompanyList()
{
     ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
        UserService userservice = (UserService) context.getBean("userservice");
        List<Company> user= userservice.searchCompany("BCT");
        Assert.assertNull(user);
}


}
