import com.qiufen.dao.UserDaoMysqlImpl;
import com.qiufen.dao.UserDaoOracleImpl;
import com.qiufen.service.UserService;
import com.qiufen.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //用户实际调用的是业务层
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl)userService).setUserDao(new UserDaoMysqlImpl());
//        userService.setUserDao(new UserDaoOracleImpl());
//        userService.getUser();
        //获取ApplicationContext：拿到spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("UserServiceImpl");
        userService.getUser();
    }
}
