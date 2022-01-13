import com.qiufen.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml","bean.xml");
        //我们现在的对象都在spring中管理，需要使用就直接去取出来
        Hello hello = (Hello)context.getBean("hello");
        System.out.println(hello.toString());
    }
}
