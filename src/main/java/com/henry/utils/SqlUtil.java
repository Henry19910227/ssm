package com.henry.utils;

import com.henry.model.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlUtil {
    private SqlSession sqlSession;
    public SqlUtil(String xml) {
        try {
            InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            sqlSession = builder.build(stream).openSession(true); //autocommit = true
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public UserMapper GetUserMapper() {
        return sqlSession.getMapper(UserMapper.class);
    }

    public void close() {
        sqlSession.close();
    }
}
