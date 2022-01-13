import com.qiufen.mapper.UserMapper;
import com.qiufen.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    //spring整合mybatis之前
    @Test
    public void test() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUser();
        for (User user : users) {
            System.out.println(user);
        }
    }
    //之后
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        SqlSession sqlSession = (SqlSession) context.getBean("sqlSessionTemplate");
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        for (User user : mapper.getUser()) {
//            System.out.println(user);
//        }
        UserMapper userMapperImpl = context.getBean("userMapperImpl", UserMapper.class);
        for (User user : userMapperImpl.getUser()) {
            System.out.println(user);
        }
    }
}
