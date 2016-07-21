package generatedArtifacts;

public class FactorLevels {
	String facName;
	double l;
	public enum Levels{
		HIGH, MEDIUM, LOW
	}
	Levels l1;
	double start1;
	double end1;
	
	public FactorLevels(String facName, double l) {
		super();
		this.facName = facName;
		this.l = l;
	}
	
	public FactorLevels(String facName, Levels l1, double start1,
			double end1) {
		super();
		this.facName = facName;
		this.l1 = l1;
		this.start1 = start1;
		this.end1 = end1;
	}

	public FactorLevels() {
		// TODO Auto-generated constructor stub
	}

	public String getFacName() {
		return facName;
	}
	public void setFacName(String facName) {
		this.facName = facName;
	}
	public double getL() {
		return l;
	}
	public void setL(double l) {
		this.l = l;
	}
	public Levels getL1() {
		return l1;
	}
	public void setL1(Levels l1) {
		this.l1 = l1;
	}
	public double getStart1() {
		return start1;
	}
	public void setStart1(double start1) {
		this.start1 = start1;
	}
	public double getEnd1() {
		return end1;
	}
	public void setEnd1(double end1) {
		this.end1 = end1;
	}
	
	

}
