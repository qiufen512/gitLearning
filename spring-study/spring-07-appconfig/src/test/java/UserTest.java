import com.qiufen.config.MyConfig;
import com.qiufen.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

// 该注解自动创建spring应用的上下文
// 以下为使用java代码实现spring自动装配
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfig.class)
public class UserTest {

    @Autowired
//    @Inject
    private User user;

    @Test
    public void user(){
        user.getPhone().call();
        System.out.println(user.getPhone().getName());;
    }

}
