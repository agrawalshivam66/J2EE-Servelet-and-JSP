

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class CountUser implements HttpSessionListener {


    public CountUser() {
          }

    int currentUsers=0;
    int totalUsers=0;
    public void sessionCreated(HttpSessionEvent arg0)  { 
       currentUsers++;
       totalUsers++;
       
       System.out.println("Number of users currently connected: "+currentUsers);
       System.out.println("Total Number of users connected: "+totalUsers);
    }


    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    
    	currentUsers--;
    }
	
}
