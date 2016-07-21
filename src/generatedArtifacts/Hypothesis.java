package generatedArtifacts;

public class Hypothesis {
	MechanisticHypothesis mechHypothesis[];
	Evidences evid[];
	Coherence cModel[];
	RelationalQuery relHypothesis[];
	public MechanisticHypothesis[] getMechHypothesis() {
		return mechHypothesis;
	}
	public void setMechHypothesis(MechanisticHypothesis[] mechHypothesis) {
		this.mechHypothesis = mechHypothesis;
	}
	public Evidences[] getEvid() {
		return evid;
	}
	public void setEvid(Evidences[] evid) {
		this.evid = evid;
	}
	public Coherence[] getcModel() {
		return cModel;
	}
	public void setcModel(Coherence[] cModel) {
		this.cModel = cModel;
	}
	public RelationalQuery[] getRelHypothesis() {
		return relHypothesis;
	}
	public void setRelHypothesis(RelationalQuery[] relHypothesis) {
		this.relHypothesis = relHypothesis;
	}
	

}
