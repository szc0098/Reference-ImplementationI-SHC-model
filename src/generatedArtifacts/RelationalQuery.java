package generatedArtifacts;

public class RelationalQuery {
	Factor f[];
	ControlVariables c[];
	Response r[];
	float startRange;
	float endRange;
	enum Function{
		MIN , MAX , EXP , INVERSE , SIN , COS , TAN , FACTORIAL , LOG 
	}
	enum Changes{
		CHANGED, INCREASED, DECREASED, CONSTANT
	}
	enum Levels{
		HIGH, MEDIUM, LOW
	}
	Function fun;
	Changes ch;
	Levels lev;
	
	public Factor[] getF() {
		return f;
	}
	public void setF(Factor[] f) {
		this.f = f;
	}
	public ControlVariables[] getC() {
		return c;
	}
	public void setC(ControlVariables[] c) {
		this.c = c;
	}
	public Response[] getR() {
		return r;
	}
	public void setR(Response[] r) {
		this.r = r;
	}

	public float getStartRange() {
		return startRange;
	}
	public void setStartRange(float startRange) {
		this.startRange = startRange;
	}
	public float getEndRange() {
		return endRange;
	}
	public void setEndRange(float endRange) {
		this.endRange = endRange;
	}
	public Function getFun() {
		return fun;
	}
	public void setFun(Function fun) {
		this.fun = fun;
	}
	public Changes getCh() {
		return ch;
	}
	public void setCh(Changes ch) {
		this.ch = ch;
	}
	public Levels getLev() {
		return lev;
	}
	public void setLev(Levels lev) {
		this.lev = lev;
	}
	

}
