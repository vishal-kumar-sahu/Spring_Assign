package springAssign5.assign5;

import java.util.Objects;

public class Session {
	
	private int sessionId;
	private String sessionName;
	
	public Session() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Session(int sessionId, String sessionName) {
		super();
		this.sessionId = sessionId;
		this.sessionName = sessionName;
	}

	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public String getSessionName() {
		return sessionName;
	}

	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sessionId, sessionName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Session other = (Session) obj;
		return sessionId == other.sessionId && Objects.equals(sessionName, other.sessionName);
	}

	@Override
	public String toString() {
		return "sessionId=" + sessionId + ", sessionName=" + sessionName;
	}

}
