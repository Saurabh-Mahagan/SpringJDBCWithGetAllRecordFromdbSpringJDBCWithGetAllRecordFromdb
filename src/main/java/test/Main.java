package test;

import org.example.dao.ProjectDeo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application-context.xml");
        ProjectDeo projectDeo=applicationContext.getBean("projectDao",ProjectDeo.class);
        projectDeo.getAllProjects();
    }

}