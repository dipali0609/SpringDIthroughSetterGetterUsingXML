package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppSetterGetter {

	public static void main(String[] args)
	{
    ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    
    Student st=(Student)context.getBean("student");
    st.display();
	}

}
