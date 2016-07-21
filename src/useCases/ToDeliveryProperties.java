package useCases;

import generatedArtifacts.ModelSection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class ToDeliveryProperties {

	
	public void convertToProperties(ModelSection m){
	Properties prop = new Properties();
	OutputStream output = null;
	
	try {
		int count = -1;
		output = new FileOutputStream("C:/Users/sritika/Documents/Fall 2015/MDE/ReferenceImpl/ReferenceImplementation/Delivery.properties");
		prop.setProperty("deliveryType", "bolus");
		prop.setProperty("useContinualDoseFunction", "false");
		prop.setProperty("repeatDose", "true");
		prop.setProperty("infusionStopTime", "120.0");
		prop.setProperty("numDoses", "1");
		prop.setProperty("time.0", "1.0");
		prop.setProperty("time.1", "10.0");
		prop.setProperty("dose.0.alpha", "2000");
		prop.setProperty("dose.0.beta", "-1");
		prop.setProperty("dose.0.gamma", "-2");
		prop.setProperty("dose.0.numEntries", "7");
		
		for(int i =0; i<m.getF().length; i++){
			if(m.getF()[i]!= null){
				if(m.getF()[i].getFactorProperties()!= null){
					count++;
					for(int j=0; j<m.getF()[i].getFactorProperties().length; j++){
						if(m.getF()[i].getFactorProperties()[j]!= null){
							String pName = m.getF()[i].getFactorProperties()[j].getParameterName();
							String parameterName = "dose."+count+".solute."+count+"."+pName;
							prop.setProperty(parameterName, m.getF()[i].getFactorProperties()[j].getParameterValue());
					}
						else break;
					}
	
				}
				else break;
		}
		}
		
		
	prop.store(output, null);
	} 
	catch (IOException io) {
		io.printStackTrace();
	} 
	finally {
		try{
			prop.store(output, null);
		}catch(Exception e){
			e.printStackTrace();
		}
		if (output != null) {
			try {
				output.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	}


}
