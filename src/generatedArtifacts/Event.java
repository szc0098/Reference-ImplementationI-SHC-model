package generatedArtifacts;

public class Event {
	Dispersed d;
	Simultaneous s;
	public Event(Dispersed d) {
		super();
		this.d = d;
	}
	public Event(Simultaneous s) {
		super();
		this.s = s;
	}

	public Dispersed getD() {
		return d;
	}
	public void setD(Dispersed d) {
		this.d = d;
	}
	public Simultaneous getS() {
		return s;
	}
	public void setS(Simultaneous s) {
		this.s = s;
	}
	
}
