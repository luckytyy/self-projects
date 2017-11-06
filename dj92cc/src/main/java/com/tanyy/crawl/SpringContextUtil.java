package com.tanyy.crawl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tanyy.dao.DjUserMapper;
import com.tanyy.model.DjUser;

public class SpringContextUtil {

  private  static ApplicationContext context = null;
  
  public static  ApplicationContext getInstance(){
    if(context == null){
      context = new ClassPathXmlApplicationContext("classpath:config/spring.xml","classpath:config/spring-mybatis.xml");
    }
    return context;
  }
  
  public static void main(String[] args) {
    
    DjUserMapper mapper = SpringContextUtil.getInstance().getBean(DjUserMapper.class);
    System.out.println("mapper = "+mapper);
    System.out.println(mapper.selectByPrimaryKey(1));    
    
  }
}
