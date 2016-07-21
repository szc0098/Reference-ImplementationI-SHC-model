package generatedArtifacts;

public class Design {
	
	public enum Types {FULLFACTORIAL, FRACTIONALFACTORIAL, OTHERS};
	Types designType;
	Variables variables;
	String constraints;
	Iteration iter;
	
	public Design(Variables variables){
		this.variables = variables;
	}	
	public Design(Types designType, Variables variables, String constraints,
			Iteration iter) {
		super();
		this.designType = designType;
		this.variables = variables;
		this.constraints = constraints;
		this.iter = iter;
	}
	public Design(Types designType, Variables variables) {
		super();
		this.designType = designType;
		this.variables = variables;
	}
	public Design(Types designType, Variables variables, String constraints) {
		super();
		this.designType = designType;
		this.variables = variables;
		this.constraints = constraints;
	}
	public Design(Types designType, Variables variables, Iteration iter) {
		super();
		this.designType = designType;
		this.variables = variables;
		this.iter = iter;
	}
	public Types getDesignType() {
		return designType;
	}
	public void setDesignType(Types designType) {
		this.designType = designType;
	}
	public Variables getVariables() {
		return variables;
	}
	public void setVariables(Variables variables) {
		this.variables = variables;
	}
	public String getConstraints() {
		return constraints;
	}
	public void setConstraints(String constraints) {
		this.constraints = constraints;
	}
	public Iteration getIter() {
		return iter;
	}
	public void setIter(Iteration iter) {
		this.iter = iter;
	}
	
}
