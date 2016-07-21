package generatedArtifacts;

public class GuardCondition {
	String condition1;
	String condition2;
	LinkOperators link;
	
	public GuardCondition(String condition1, String condition2, LinkOperators link) {
		super();
		this.condition1 = condition1;
		this.condition2 = condition2;
		this.link = link;
	}
	public String getCondition1() {
		return condition1;
	}
	public void setCondition1(String condition1) {
		this.condition1 = condition1;
	}
	public String getCondition2() {
		return condition2;
	}
	public void setCondition2(String condition2) {
		this.condition2 = condition2;
	}
	public LinkOperators getLink() {
		return link;
	}
	public void setLink(LinkOperators link) {
		this.link = link;
	}
	

}
