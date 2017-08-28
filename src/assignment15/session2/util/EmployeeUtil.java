package assignment15.session2.util;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;

import assignment15.session2.bean.Employee;  
  
public class EmployeeUtil {  
public static void main(String[] args) {  
      
    //creating configuration object  
    Configuration cfg=new Configuration();  
    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
      
    //creating session factory object  
    SessionFactory factory=cfg.buildSessionFactory();  
      
    //creating session object  
    Session session=factory.openSession();  
      
    //creating transaction object  
    Transaction t=session.beginTransaction();  
          
    Employee e1=new Employee();  
    e1.setFirstName("Vikas");  
    e1.setLastName("Varshney");  
      
    session.saveOrUpdate(e1);//persisting the object  
      
    t.commit();//transaction is committed  
    session.close();  
    System.out.println("Hibernate Hello World!!!!");
    System.out.println("Employee successfully saved");  
      
}  
}