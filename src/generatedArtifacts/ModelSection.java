package generatedArtifacts;

public class ModelSection {
	String modelName;
	Mechanism mechanism[];
	Events e;
	Factor f[];
	
	public ModelSection(String modelName, Factor[] f) {
		super();
		this.modelName = modelName;
		this.f = f;
	}
	public ModelSection(String modelName, Mechanism[] mechanism, Events e2,
			Factor[] f) {
		super();
		this.modelName = modelName;
		this.mechanism = mechanism;
		this.e = e2;
		this.f = f;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Mechanism[] getMechanism() {
		return mechanism;
	}
	public void setMechanism(Mechanism mechanism[]) {
		this.mechanism = mechanism;
	}
	public Events getE() {
		return e;
	}
	public void setE(Events e) {
		this.e = e;
	}
	public Factor[] getF() {
		return f;
	}
	public void setF(Factor[] f) {
		this.f = f;
	}
	

}
