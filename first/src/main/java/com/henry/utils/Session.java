package com.henry.utils;

import com.henry.model.CourseMapper;
import com.henry.model.PlanMapper;
import com.henry.model.UserMapper;
import org.apache.ibatis.session.SqlSession;

public class Session {
    private String sessionID;
    private SqlSession sqlSession;

    public Session(String sessionID, SqlSession sqlSession) {
        this.sessionID = sessionID;
        this.sqlSession = sqlSession;
    }

    public UserMapper userMapper() {
        return sqlSession.getMapper(UserMapper.class);
    }
    public CourseMapper courseMapper() {
        return sqlSession.getMapper(CourseMapper.class);
    }
    public PlanMapper planMapper() {
        return sqlSession.getMapper(PlanMapper.class);
    }
    public void close() {
        sqlSession.close();
    }

    public String getSessionID() {
        return sessionID;
    }
}
