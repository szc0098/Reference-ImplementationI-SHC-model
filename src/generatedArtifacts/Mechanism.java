package generatedArtifacts;

public class Mechanism {
	String mechanismName;
	Reaction rhs;
	Reaction lhs;
	GuardCondition guardCondition;
	
	public Mechanism(String mechanismName, Reaction rhs, Reaction lhs) {
		super();
		this.mechanismName = mechanismName;
		this.rhs = rhs;
		this.lhs = lhs;
	}
	
	public Mechanism(String mechanismName, Reaction rhs, Reaction lhs,
			GuardCondition guardCondition) {
		super();
		this.mechanismName = mechanismName;
		this.rhs = rhs;
		this.lhs = lhs;
		this.guardCondition = guardCondition;
	}

	public String getMechanismName() {
		return mechanismName;
	}
	public void setMechanismName(String mechanismName) {
		this.mechanismName = mechanismName;
	}
	public Reaction getRhs() {
		return rhs;
	}
	public void setRhs(Reaction rhs) {
		this.rhs = rhs;
	}
	public Reaction getLhs() {
		return lhs;
	}
	public void setLhs(Reaction lhs) {
		this.lhs = lhs;
	}
	public GuardCondition getGuardCondition() {
		return guardCondition;
	}
	public void setGuardCondition(GuardCondition guardCondition) {
		this.guardCondition = guardCondition;
	}
	
}
