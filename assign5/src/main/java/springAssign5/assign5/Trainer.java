package springAssign5.assign5;

import java.util.*;

public class Trainer {
	
	private int trainerId;
	private String trainerName;
	private List<Session> sessions;
	
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trainer(int trainerId, String trainerName) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.sessions = new ArrayList<>();
	}
	
	public Trainer(int trainerId, String trainerName, List<Session> sessions) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.sessions = sessions;
	}

	public int getTrainerId() {
		return trainerId;
	}
	
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	
	public String getTrainerName() {
		return trainerName;
	}
	
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	
	public List<Session> getSessions() {
        return sessions;
    }

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(sessions, trainerId, trainerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainer other = (Trainer) obj;
		return Objects.equals(sessions, other.sessions) && trainerId == other.trainerId
				&& Objects.equals(trainerName, other.trainerName);
	}

	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", sessions=" + sessions + "]";
	}
	
}
