package generatedArtifacts;

public class Goals {
	String objectOfStudy;
	String purpose;
	String focus;
	String viewPoint;
	String context;
	public Goals(){
		
	}
	
	public Goals(String objectOfStudy, String purpose, String focus,
			String viewPoint, String context) {
		super();
		this.objectOfStudy = objectOfStudy;
		this.purpose = purpose;
		this.focus = focus;
		this.viewPoint = viewPoint;
		this.context = context;
	}
	public String getObjectOfStudy() {
		return objectOfStudy;
	}
	public void setObjectOfStudy(String objectOfStudy) {
		this.objectOfStudy = objectOfStudy;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getFocus() {
		return focus;
	}
	public void setFocus(String focus) {
		this.focus = focus;
	}
	public String getViewPoint() {
		return viewPoint;
	}
	public void setViewPoint(String viewPoint) {
		this.viewPoint = viewPoint;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	

}
