package com.how2java;

import java.io.InputStream;

import java.util.List;

//import com.how2java.mapper.CategoryMapper;

//import com.how2java.pojo.Category;
//import com.how2java.pojo.CategoryExample;
//import com.how2java.mapper.CategoryMapper;
//import com.how2java.pojo.CategoryExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class TestMybatis {
    public static void main(String args[]) throws Exception {
        System.out.println("������TestMybatisGenerator����mapper,pojo,xml ���ļ���Ȼ��ȡ��import�ﱻע�͵ģ��Լ���������ע�ͣ���ִ�д���");


//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession session=sqlSessionFactory.openSession();
//        CategoryExample example = new CategoryExample();
//        example.createCriteria().andNameLike("%9%");
//        CategoryMapper mapper = session.getMapper(CategoryMapper.class);
//        List<Category> cs= mapper.selectByExample(example);
//        for (Category c : cs) {
//            System.out.println(c.getName());
//        }


        


    }
}
