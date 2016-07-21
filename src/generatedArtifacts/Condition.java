package generatedArtifacts;

public class Condition {
	Event e;
	LinkOperators lo;
	Event condition;
	Expression exp1;
	float v;
	
	public Condition(Event e) {
		super();
		this.e = e;
	}
	public Condition(Event e, LinkOperators lo, Event condition,
			Expression exp1, float v) {
		super();
		this.e = e;
		this.lo = lo;
		this.condition = condition;
		this.exp1 = exp1;
		this.v = v;
	}
	

	public Event getE() {
		return e;
	}
	public void setE(Event e) {
		this.e = e;
	}
	public LinkOperators getLo() {
		return lo;
	}
	public void setLo(LinkOperators lo) {
		this.lo = lo;
	}
	public Event getCondition() {
		return condition;
	}
	public void setCondition(Event condition) {
		this.condition = condition;
	}
	public Expression getExp1() {
		return exp1;
	}
	public void setExp1(Expression exp1) {
		this.exp1 = exp1;
	}
	public float getV() {
		return v;
	}
	public void setV(float v) {
		this.v = v;
	}
	

}
