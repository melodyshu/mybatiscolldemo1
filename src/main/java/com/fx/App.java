package com.fx;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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
        System.out.println("=======================");
        List<Integer> idsList=new ArrayList<Integer>();
        idsList.add(1);
        idsList.add(2);
        List<OrderDetail> orderDetailList2 = orderdetailMapper.findOrderDetailByIds(idsList);
        System.out.println(orderDetailList2);
        System.out.println("=======================");
        Query query=new Query();
        query.setName("huang");
        query.setIdList(idsList);
        List<OrderDetail> orderDetailList3 = orderdetailMapper.findOrderDetailByQuery(query);
        System.out.println(orderDetailList3);
        sqlSession.close();
    }
}
