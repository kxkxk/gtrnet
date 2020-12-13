package com.gtr;

import com.gtr.Bean.H;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisTest {
//    public static void testName() throws Exception {
//        //加载核心配置文件
//        String resource = "mybatis-config.xml";
//        InputStream in = Resources.getResourceAsStream(resource);
//
//        //sessionFactory类
//        SqlSessionFactory sessionFactory =  new SqlSessionFactoryBuilder().build(in);
//
//        //sqlSession
//        SqlSession sqlSession = sessionFactory.openSession();
//
//        //执行sql语句
//        H house = sqlSession.selectOne("test.findAllHouse");
//
//        house.testPrent();
//
//        sqlSession.close();
//    }
    public static void main(String[] args) throws Exception{
        //加载核心配置文件
        String resource = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resource);

        //sessionFactory类
        SqlSessionFactory sessionFactory =  new SqlSessionFactoryBuilder().build(in);

        //sqlSession
        SqlSession sqlSession = sessionFactory.openSession();

        //执行sql语句
        H house = sqlSession.selectOne("test.findAllHouse");

        house.testPrent();

        sqlSession.close();
    }
}
