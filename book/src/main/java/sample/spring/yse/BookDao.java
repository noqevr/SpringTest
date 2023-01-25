package sample.spring.yse;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class BookDao {
 @Autowired
 SqlSessionTemplate sqlSessionTemplate;
 
 
 public int insert(Map<String, Object> map) {
	 
	 for (Map.Entry<String, Object> entry : map.entrySet())
	 {
	     System.out.println("key : " + entry.getKey() + " / " + "value : " + entry.getValue());
	 }
	 
	  return this.sqlSessionTemplate.insert("book.insert", map);
	}
 
 public Map<String, Object> selectDetail(Map<String, Object> map) {
	    return this.sqlSessionTemplate.selectOne("book.select_detail", map);
	}
 
 
}

