package t1;

import com.ssm.domain.Books;
import com.ssm.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void t1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) applicationContext.getBean("BookServiceImpl");
        for (Books books : bookServiceImpl.queryAllBook()) {
            System.out.println(books);
        }
    }
}
