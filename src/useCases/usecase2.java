package useCases;

import generatedArtifacts.Events;
import generatedArtifacts.Factor;
import generatedArtifacts.GuardCondition;
import generatedArtifacts.LinkOperators;
import generatedArtifacts.Mechanism;
import generatedArtifacts.ModelSection;
import generatedArtifacts.OtherAgent;
import generatedArtifacts.Properties;
import generatedArtifacts.Reaction;
import generatedArtifacts.Values;

public class usecase2 {
	public static void main(String[] args)
	{
	Factor f1[] = new Factor[100];
	Properties []p1 = new Properties[100];
	p1[0] = new Properties();
	p1[0].setParameterName("tag");
	p1[0].setParameterValue("LPS");
	p1[1] = new Properties();
	p1[1].setParameterName("bolusRatio");
	p1[1].setParameterValue("1.0");
	p1[2] = new Properties();
	p1[2].setParameterName("pExitMedia");
	p1[2].setParameterValue("0.1");
	f1[0]= new Factor();
	f1[0].setFactorName("LPS");
	f1[0].setFactorProperties(p1);
	f1[1] = new Factor();
	f1[1].setFactorName("forwardBias");
	Values v = new Values(0.5);
	f1[1].setFactorValues("0.5");
	f1[2] = new Factor();
	f1[2].setFactorName("lateralBias");
	v = new Values(0.5);
	f1[2].setFactorValues("0.5");
	
	Mechanism mech[] = new Mechanism[100];
	//OtherAgent oa = new OtherAgent("KupfferCells");
	Reaction lhs1 = new Reaction("inflammatoryAgent", "KupfferCells");
	LinkOperators lo1 = new LinkOperators(">");
	GuardCondition guardCondition1 = new GuardCondition("InflammatoryAgent", 
			"inflammatorythreshold", lo1);
	Reaction rhs1 = new Reaction("Cytokine");
	
	mech[0] = new Mechanism("M1", rhs1, lhs1, guardCondition1);
	
	//oa = new OtherAgent("KupfferCells");
	Reaction lhs2 = new Reaction("inflammatoryAgent", "KupfferCells");
	LinkOperators lo2 = new LinkOperators("<");
	GuardCondition guardCondition2 = new GuardCondition("noOfCytokines", 
			"cytokinethreshold", lo2);
	Reaction rhs2 = new Reaction("Cytokine");
	
	mech[1] = new Mechanism("M1", rhs2, lhs2, guardCondition2);
	
	Events e = new Events("inflammation", "void ishc.model.KupfferCell.handleInflammation()");
	
	
	ModelSection ms = new ModelSection("ISHC", mech, e, f1);
	
	ToDeliveryProperties delivery = new ToDeliveryProperties();
	delivery.convertToProperties(ms);
	
	
	ToISHCProperties ishc = new ToISHCProperties();
	ishc.convertToProperties(ms);
	}

}
