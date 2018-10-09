import com.gt.SpringMVC.Demo.Services.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

    @Test
    public void TestAOP()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.add();
    }
}