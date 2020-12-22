package com.gtr;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class SqlUnit {
    public SqlSession openSql() throws Exception {
        String resource = "src/mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resource);

        //sessionFactory类
        SqlSessionFactory sessionFactory =  new SqlSessionFactoryBuilder().build(in);

        //sqlSession
        SqlSession sqlSession = sessionFactory.openSession();
        return sqlSession;
    }
    public void closeSql(SqlSession sql) {
        sql.close();
    }
}
