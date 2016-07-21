package useCases;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import generatedArtifacts.Query;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ToLTL {
	Query query;
	Document dom;
	
	public ToLTL(Query query) {
		super();
		this.query = query;
	}

	public String toLTL()
	{
		parseXmlFile();
		String ltlFormula = getFormulaFromXml();
		String[] placeholders = {"P", "S", "R", "X", "Z"};
		for(int i = 0; i < query.getEvents().size(); i++)//problem: if the text we replace has a capital P, S, etc in it, we'll replace stuff we shouldn't
		{
			ltlFormula = ltlFormula.replaceAll(placeholders[i], query.getEvents().get(i));
		}
		return ltlFormula;
	}
	
	private void parseXmlFile(){
		//get the factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try {
			
			//Using factory get an instance of document builder
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			//parse using builder to get DOM representation of the XML file
			dom = db.parse("C:/Users/sritika/Documents/Fall 2015/MDE/ReferenceImpl/ReferenceImplementation/Patterns.xml");
			

		}catch(ParserConfigurationException pce) {
			pce.printStackTrace();
		}catch(SAXException se) {
			se.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	private String getFormulaFromXml()
	{
		String formula = "not identified";
		Element docEle = dom.getDocumentElement();
		
		NodeList nl = docEle.getElementsByTagName(query.getPatternType());
		if(nl != null && nl.getLength() > 0) {
			for(int i = 0 ; i < nl.getLength();i++) 
			{
				Element el = (Element)nl.item(i);
				formula = getTextValue(el, "Globally");
			}
		}
		return formula;
	}
	private String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nl = ele.getElementsByTagName(tagName);
		if(nl != null && nl.getLength() > 0) {
			Element el = (Element)nl.item(0);
			textVal = el.getFirstChild().getNodeValue();
		}

		return textVal;
	}


}
