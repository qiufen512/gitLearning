package com.qiufen.mapper;

import com.qiufen.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    //原来我们使用的都是sqlSession，现在我们用sqlSessionTemplate替换
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> getUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUser();
    }
}
