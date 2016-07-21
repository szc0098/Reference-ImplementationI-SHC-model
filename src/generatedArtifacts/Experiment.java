package generatedArtifacts;

public class Experiment {
	String expName;
	Design expDesign;
	PerformanceMeasure perfMeasure;
	public Experiment(String expName, Design expDesign,
			PerformanceMeasure perfMeasure) {
		super();
		this.expName = expName;
		this.expDesign = expDesign;
		this.perfMeasure = perfMeasure;
	}
	
	public Experiment(String expName, Design expDesign) {
		super();
		this.expName = expName;
		this.expDesign = expDesign;
	}

	public String getExpName() {
		return expName;
	}
	public void setExpName(String expName) {
		this.expName = expName;
	}
	public Design getExpDesign() {
		return expDesign;
	}
	public void setExpDesign(Design expDesign) {
		this.expDesign = expDesign;
	}
	public PerformanceMeasure getPerfMeasure() {
		return perfMeasure;
	}
	public void setPerfMeasure(PerformanceMeasure perfMeasure) {
		this.perfMeasure = perfMeasure;
	}
	
}
