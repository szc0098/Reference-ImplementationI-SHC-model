package generatedArtifacts;

public class Evidences {
	String eName;
	SpecPattern query;
	Query q;

	public Evidences(SpecPattern query) {
		super();
		this.query = query;
	}
	

	public Evidences(Query q) {
		super();
		this.q = q;
	}


	public Evidences(String eName, Query q) {
		super();
		this.eName = eName;
		this.q = q;
	}


	public Evidences(String eName, SpecPattern query) {
		super();
		this.eName = eName;
		this.query = query;
	}


	public Evidences() {
		// TODO Auto-generated constructor stub
	}


	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public SpecPattern getQuery() {
		return query;
	}


	public void setQuery(SpecPattern query) {
		this.query = query;
	}


	public Query getQ() {
		return q;
	}


	public void setQ(Query q) {
		this.q = q;
	}


	

}
