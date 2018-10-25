package com.fx;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession= sqlSessionFactory.openSession();
        OrderdetailMapper orderdetailMapper= sqlSession.getMapper(OrderdetailMapper.class);
        List<OrderDetail> orderDetailList = orderdetailMapper.findOrderDetail();
        System.out.println(orderDetailList);
        sqlSession.close();
    }
}
