//package com.smbms.test;
//
//import com.smbms.dao.UserDao;
//import com.smbms.pojo.User;
//import com.smbms.util.MybatisUtil;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.Test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class MybatisTest {
//
//    @Test
//    public void test11(){
//        InputStream in = null;
//        SqlSessionFactoryBuilder builder = null;
//        SqlSessionFactory sqlSessionFactory = null;
//        SqlSession sqlSession = null;
//        try {
//            in = Resources.getResourceAsStream("mybatis-config.xml");
//            builder = new SqlSessionFactoryBuilder();
//            sqlSessionFactory = builder.build(in);
//            sqlSession = sqlSessionFactory.openSession();
//            UserDao dao = sqlSession.getMapper(UserDao.class);
//            List<User> user = dao.selectByUserName("李");
//            for (User u :
//                    user) {
//                System.out.println("u = " + u);
//            }
////            System.out.println("user = " + user);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if (sqlSession != null){
//                sqlSession.close();
//            }
//            if (in != null){
//                try {
//                    in.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//    }
//    @Test
//    public void test2(){
//
//        InputStream in = null;
//        SqlSessionFactoryBuilder builder = null;
//        SqlSessionFactory sqlSessionFactory = null;
//        SqlSession sqlSession = null;
//        try {
//            in = Resources.getResourceAsStream("mybatis-config.xml");
//            builder = new SqlSessionFactoryBuilder();
//            sqlSessionFactory = builder.build(in);
//            sqlSession = sqlSessionFactory.openSession();
//            UserDao dao = sqlSession.getMapper(UserDao.class);
//            Map<String, String> map = new HashMap<>();
//            map.put("userCode","admin");
//            map.put("userPassword","1");
//            User user = dao.login(map);
//            System.out.println("user = " + user);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if (sqlSession != null){
//                sqlSession.close();
//            }
//            if (in != null){
//                try {
//                    in.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//    @Test
//    public void test3(){
//        InputStream in = null;
//        SqlSessionFactoryBuilder builder = null;
//        SqlSessionFactory sqlSessionFactory = null;
//        SqlSession sqlSession = null;
//        try {
//            in = Resources.getResourceAsStream("mybatis-config.xml");
//            builder = new SqlSessionFactoryBuilder();
//            sqlSessionFactory = builder.build(in);
//            sqlSession = sqlSessionFactory.openSession();
//            UserDao dao = sqlSession.getMapper(UserDao.class);
//
//            User s = dao.selectByIdDuo(5);
//            System.out.println("user = " + s);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if (sqlSession != null){
//                sqlSession.close();
//            }
//            if (in != null){
//                try {
//                    in.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//    @Test
//    public void test44(){
//        SqlSession sqlSession = MybatisUtil.getSqlSession();
//        UserDao dao = sqlSession.getMapper(UserDao.class);
//        List<User> user = dao.selectByUserName("王");
//        System.out.println("user = " + user);
//        sqlSession.close();
//    }
//}
