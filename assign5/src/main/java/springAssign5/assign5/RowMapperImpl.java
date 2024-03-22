package springAssign5.assign5;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Trainer>{

	@Override
    public Trainer mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Trainer trainer = new Trainer();
		
        int trainerId = rs.getInt(1);
        String trainerName = rs.getString(2);
        
        trainer.setTrainerId(trainerId);
        trainer.setTrainerName(trainerName);

        List<Session> list = new ArrayList<>();
        
        int sessionId = rs.getInt(3);
        if (sessionId > 0) {
             Session session = new Session();
             session.setSessionId(sessionId);
                
             session.setSessionName(rs.getString(4));

             list.add(session);
         }

        trainer.setSessions(list);
        
        return trainer;
    }

}
