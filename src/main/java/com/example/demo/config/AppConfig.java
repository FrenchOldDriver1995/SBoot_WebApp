package com.example.demo.config;

import com.example.demo.business.*;
import com.example.demo.repository.*;
import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
public class AppConfig {//只用修改config而不需要修改代码，就能实现功能
    //通过bean实现各种功能，在AppConfig中直接调用注入就可以实现

    @Bean
    StoryRepository storyRepository() {
//        return new InMemoryStoryRepository();
//    	return new JdbcStoryRepository(datasource());
    	return new JpaStoryRepository();  //利用jpa实现数据库链接
    }
    @Bean
    DataSource datasource() {
    	MysqlDataSource dataSource = new MysqlDataSource();//连接本地数据库
    	dataSource.setURL("jdbc:mysql://localhost:3306/polyNet?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        dataSource.setUser("root");
        dataSource.setPassword("zts19950208");
        dataSource.setDatabaseName("polyNet");
        return dataSource;
    }
    @Bean
    FeedService FeedService() {
    	return new FeedServiceImpl(storyRepository());
    }
    
    @Bean
    PublicationService publicationService(){
        return new PublicationServiceImpl(storyRepository());
    }

    @Bean
    UserRepository userRepository(){
        return new JpaUserRepository();
    }
    @Bean
    RegisterService registerService(){ return new RegisterServiceImpl(userRepository()); }


}
