package springAssign5.assign5;

import java.sql.*;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	System.out.println("Question 5 : ");
        
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	JdbcTemplate template = context.getBean(JdbcTemplate.class);
    	
    	// SQL query to join trainer and session tables
        String sql = "SELECT trainer.id, trainer.name, session.id as session_id, session.session_name " +
                     "FROM trainer LEFT JOIN session ON trainer.id = session.trainer_id";

        RowMapper<Trainer> rowMapper = new RowMapperImpl();
        List<Trainer> list = template.query(sql, rowMapper);
        
        for(Trainer t : list) {
        	System.out.println(t);
        }
    	
    }
}
