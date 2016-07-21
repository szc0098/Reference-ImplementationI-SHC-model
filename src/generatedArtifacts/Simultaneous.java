package generatedArtifacts;

public class Simultaneous {

	Re sim1;
	Re sim2;
	Logical log[];
	
	public Simultaneous(Re sim1, Re sim2, Logical[] log) {
		super();
		this.sim1 = sim1;
		this.sim2 = sim2;
		this.log = log;
	}
	public Re getSim1() {
		return sim1;
	}
	public void setSim1(Re sim1) {
		this.sim1 = sim1;
	}
	public Re getSim2() {
		return sim2;
	}
	public void setSim2(Re sim2) {
		this.sim2 = sim2;
	}
	public Logical[] getLog() {
		return log;
	}
	public void setLog(Logical[] log) {
		this.log = log;
	}
	
	
}
