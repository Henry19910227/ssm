package com.henry.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class SqlUtil {
    private InputStream stream;
    private SqlSessionFactory factory;

    private HashMap<String, Session> sessionMap;

    public SqlUtil(String xml) {
        try {
            stream = Resources.getResourceAsStream(xml);
            factory = new SqlSessionFactoryBuilder().build(stream);
            sessionMap = new HashMap<>();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public SqlUtil() {

    }

    public Session getSession(String sessionID) {
        Session session = sessionMap.get(sessionID);
        if (session == null) {
            session = new Session(sessionID, factory.openSession(true));
            sessionMap.put(sessionID, session);
            return session;
        }
        return session;
    }

    public void close(Session session) {
        session.close();
        sessionMap.remove(session.getSessionID());
    }
}
