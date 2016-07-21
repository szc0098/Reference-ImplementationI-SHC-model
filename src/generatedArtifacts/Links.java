package generatedArtifacts;

public class Links {
	enum LinksList{
		IS, OCCURS, TO, IN
	}

	LinksList ll;

	public Links(LinksList ll) {
		super();
		this.ll = ll;
	}

	public LinksList getLl() {
		return ll;
	}

	public void setLl(LinksList ll) {
		this.ll = ll;
	}
	
}
