package com.how2java;
  
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
  
public class TestMybatis {
  
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();


//        xmlWay(session);    
        annotationWay(session);
        
        
        session.commit();
        session.close();
    }

	private static void xmlWay(SqlSession session) {
		Map<String,Object> params = new HashMap<>();
        params.put("start", 0);
        params.put("count", 5);
        List<Category>  cs =session.selectList("listCategory", params);
        for (Category c : cs) {
			System.out.println(c);
		}
	}

	private static void annotationWay(SqlSession session) {
		CategoryMapper mapper = session.getMapper(CategoryMapper.class);
        
        List<Category>  cs =mapper.listByPage(0, 5);
        for (Category c : cs) {
			System.out.println(c);
		}
	}
    

}