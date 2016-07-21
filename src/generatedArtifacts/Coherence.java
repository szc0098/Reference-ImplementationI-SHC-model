package generatedArtifacts;

public class Coherence {
	public enum CoherenceType{
		EXPLAIN, ANALOGOUS, DATA, CONTRADICT
	}

	CoherenceType ct;
	String h;
	String e;
	float activationweight1;
	float activationweight2;
	
	public Coherence(CoherenceType ct, String h, String e) {
		super();
		this.ct = ct;
		this.h = h;
		this.e = e;
	}
	public Coherence(CoherenceType ct, String h, String e, float activationweight1,
			float activationweight2) {
		super();
		this.ct = ct;
		this.h = h;
		this.e = e;
		this.activationweight1 = activationweight1;
		this.activationweight2 = activationweight2;
	}
	
	public Coherence() {
		// TODO Auto-generated constructor stub
	}
	public CoherenceType getCt() {
		return ct;
	}
	public void setCt(CoherenceType ct) {
		this.ct = ct;
	}
	public String getH() {
		return h;
	}
	public void setH(String h) {
		this.h = h;
	}
	public String getE() {
		return e;
	}
	public void setE(String e) {
		this.e = e;
	}
	public float getActivationweight1() {
		return activationweight1;
	}
	public void setActivationweight1(float activationweight1) {
		this.activationweight1 = activationweight1;
	}
	public float getActivationweight2() {
		return activationweight2;
	}
	public void setActivationweight2(float activationweight2) {
		this.activationweight2 = activationweight2;
	}
	
}
