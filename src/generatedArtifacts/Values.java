package generatedArtifacts;

public class Values {
	String fVal;
	String function;
	double value;
	double factorLevelValue[];
	
	

	public Values(double[] factorLevelValue) {
		super();
		this.factorLevelValue = factorLevelValue;
	}
	public Values(double value) {
		super();
		this.value = value;
	}
	public String getfVal() {
		return fVal;
	}
	public void setfVal(String fVal) {
		this.fVal = fVal;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public String getValue() {
		return Double.toString(value);
	}
	public void setValue(double value) {
		this.value = value;
	}
	public double[] getFactorLevelValue() {
		return factorLevelValue;
	}
	public void setFactorLevelValue(double[] factorLevelValue) {
		this.factorLevelValue = factorLevelValue;
	}
	
}
