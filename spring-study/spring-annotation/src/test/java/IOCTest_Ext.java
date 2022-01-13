import com.qiufen.aop.MathCalculator;
import com.qiufen.config.MainConfigOfAOP;
import com.qiufen.config.MainConfigOfLifeCycle;
import com.qiufen.ext.ExtConfig;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Ext {
    @Test
    public void test1() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(ExtConfig.class);
        // 发布一个事件
        app.publishEvent(new ApplicationEvent(new String("此事件由我发布~")) {
        });
        app.close();

    }

}
