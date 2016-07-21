package generatedArtifacts;

public class Logical {

	enum LogicalProperties{
		and, or, not
	}
	LogicalProperties lp;
	
	public Logical(LogicalProperties lp) {
		super();
		this.lp = lp;
	}
	public LogicalProperties getLp() {
		return lp;
	}
	public void setLp(LogicalProperties lp) {
		this.lp = lp;
	}
	
}
