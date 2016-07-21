package generatedArtifacts;

public class Factor {
	String factorName;
	public enum VariableTypes {QUALITATIVE, QUANTITATIVE, CONTINOUS, DISCRETE , BINARY ,NONBINARY};
	String factorValues;
	Values factorValue;
	VariableTypes factorType;
	Properties factorProperties[];
	
	public Factor(){
		
	}
	
	public Factor(String name, VariableTypes vt, String v){
		this.factorName = name;
		this.factorType = vt;
		this.factorValues =v;
		
	}

	public Factor(String factorName, VariableTypes factorType,
			Properties factorProperties[]) {
		this.factorName = factorName;
		this.factorType = factorType;
		this.factorProperties = factorProperties;
	}
	public Factor(String name, String v){
		this.factorName = name;
		this.factorValues =v;
		
	}

	public Factor(String factorName, Properties factorProperties[]) {
		this.factorName = factorName;
		this.factorProperties = factorProperties;
	}

	public String getFactorName() {
		return factorName;
	}

	public void setFactorName(String factorName) {
		this.factorName = factorName;
	}

	public String getFactorValues() {
		return factorValues;
		
	}

	public void setFactorValues(String factorValues) {
		this.factorValues = factorValues;
	}

	public VariableTypes getFactorType() {
		return factorType;
	}

	public void setFactorType(VariableTypes factorType) {
		this.factorType = factorType;
	}

	public Properties[] getFactorProperties() {
		return factorProperties;
	}

	public void setFactorProperties(Properties factorProperties[]) {
		this.factorProperties = factorProperties;
	}
	

}
