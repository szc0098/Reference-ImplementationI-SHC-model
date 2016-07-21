package generatedArtifacts;

public class Expression {
	
	enum ExpressionList {
		TRUE , FALSE
	}

	ExpressionList el;

	public Expression(ExpressionList el) {
		super();
		this.el = el;
	}

	public ExpressionList getEl() {
		return el;
	}

	public void setEl(ExpressionList el) {
		this.el = el;
	}
	
}
