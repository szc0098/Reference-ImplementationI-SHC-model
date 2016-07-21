package generatedArtifacts;

public class PerformanceMeasure {

	Response expectedResults;
	double errorRange;
	double std;
	
	public PerformanceMeasure(Response r, double errorRange, double std){
		this.expectedResults = r;
		this.errorRange = errorRange;
		this.std =std;
	}

	public Response getExpectedResults() {
		return expectedResults;
	}

	public void setExpectedResults(Response expectedResults) {
		this.expectedResults = expectedResults;
	}

	public double getErrorRange() {
		return errorRange;
	}

	public void setErrorRange(double errorRange) {
		this.errorRange = errorRange;
	}

	public double getStd() {
		return std;
	}

	public void setStd(double std) {
		this.std = std;
	}

}
