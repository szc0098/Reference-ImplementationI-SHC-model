package generatedArtifacts;

public class Temporal {
	enum TemporalProperties{
		precedes , between , eventually , always , before , after , until , never , leads , absent , exists
	}

	TemporalProperties tp;

	public Temporal(TemporalProperties tp) {
		super();
		this.tp = tp;
	}

	public TemporalProperties getTp() {
		return tp;
	}

	public void setTp(TemporalProperties tp) {
		this.tp = tp;
	}
	
}
