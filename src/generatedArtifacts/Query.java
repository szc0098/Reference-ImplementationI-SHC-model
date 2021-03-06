package generatedArtifacts;
import java.util.ArrayList;


public class Query {

	private ArrayList<String> events = new ArrayList<String>();
	private String query;
	private String patternType;

	public final String[] patternIdentifier = {"absent", "eventually exists", "always exists", "precedes", "leads to"};
	public final String[] patterns = {"Absence", "Existence", "Universality", "Precedence", "Response"};

	/**
	 * Creates a new query object.
	 * 
	 * @param queryIn The query from the DSL as a string. For example, "LookingForNewSite = true is absent"
	 */
	public Query(String queryIn)
	{
		this.query = queryIn;
		detectPattern();
		detectEvents();
	}
	
	/**
	 * Helper function that detects the type of pattern the query is by looking for keywords.
	 */
	private void detectPattern()
	{
		for(int i = 0; i < patternIdentifier.length; i++)
		{
			if(query.contains(patternIdentifier[i]))
			{
				patternType = patterns[i];
			}
		}
	}
	
	/**
	 * Helper function that detects the events in the query by searching before and after the pattern keywords
	 */
	private void detectEvents()
	{
		switch(patternType)
		{
		case "Absence":
			events.add(query.substring(0, query.indexOf("is") - 1));
			break;
		case "Existence":
			events.add(query.substring(0, query.indexOf("eventually") - 1));
			break;
		case "Universality":
			events.add(query.substring(0, query.indexOf("always") - 1));
			break;
		case "Precedence":
			events.add(query.substring(0, query.indexOf("precedes") - 1));
			events.add(query.substring(query.indexOf("precedes")+ 9));
			break;
		case "Response":
			events.add(query.substring(0, query.indexOf("leads") - 1));
			events.add(query.substring(query.indexOf("to") + 3));
			break;
		default:
			break;

		}
	}
	
	/**
	 * Gets the pattern type
	 * 
	 * @return patternType The name of the specification pattern used in the query
	 */
	public String getPatternType() {
		return patternType;
	}

	/**
	 * Sets the patterns type
	 * 
	 * @param patternType The name of the new specification pattern to be used in the query
	 */
	public void setPatternType(String patternType) {
		this.patternType = patternType;
	}

	/**
	 * Gets the list of events
	 * 
	 * @return patternType The name of the specification pattern used in the query
	 */
	public ArrayList<String> getEvents() {
		return events;
	}

	/**
	 * Sets the list of events
	 * 
	 * @param e the new list of events
	 */
	public void setEvents(ArrayList<String> e) {
		this.events = e;
	}
}
