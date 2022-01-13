import com.qiufen.aop.MathCalculator;
import com.qiufen.bean.Car;
import com.qiufen.config.MainConfigOfAOP;
import com.qiufen.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {
    @Test
    public void test1() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成~~~");
        app.close();
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
        MathCalculator mathCalculator = (MathCalculator) app.getBean("mathCalculator");
        mathCalculator.div(1, 1);
    }

}
