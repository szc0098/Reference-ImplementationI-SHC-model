package generatedArtifacts;
import java.util.ArrayList;


public class Events {
	String eventName;
	String EventDefinition;
	
	public Events(String eventName, String eventDefinition) {
		super();
		this.eventName = eventName;
		EventDefinition = eventDefinition;
	}
	
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventDefinition() {
		return EventDefinition;
	}
	public void setEventDefinition(String eventDefinition) {
		EventDefinition = eventDefinition;
	}
	
}
