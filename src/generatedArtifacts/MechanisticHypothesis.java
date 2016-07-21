package generatedArtifacts;

public class MechanisticHypothesis {
	String mName;
	Evidences assoMech;
	String mechHypothesis;
	
	public MechanisticHypothesis(String mName, Evidences assoMech) {
		super();
		this.mName = mName;
		this.assoMech = assoMech;
	}
	public MechanisticHypothesis(String mName, String mechHypothesis) {
		super();
		this.mName = mName;
		this.mechHypothesis = mechHypothesis;
	}
	public MechanisticHypothesis() {
		// TODO Auto-generated constructor stub
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public Evidences getAssoMech() {
		return assoMech;
	}
	public void setAssoMech(Evidences assoMech) {
		this.assoMech = assoMech;
	}
	public String getMechHypothesis() {
		return mechHypothesis;
	}
	public void setMechHypothesis(String mechHypothesis) {
		this.mechHypothesis = mechHypothesis;
	}
	

}
