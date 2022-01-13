import com.qiufen.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理代理的是接口！
        UserService userService = context.getBean("userService", UserService.class);
        UserService managerService = context.getBean("managerService", UserService.class);
        managerService.query();
//        managerService.add();
//        userService.add();
        userService.query();
    }
}
