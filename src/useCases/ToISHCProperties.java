package useCases;

import generatedArtifacts.Factor;
import generatedArtifacts.ModelSection;
import generatedArtifacts.Values;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class ToISHCProperties {
	
			public void convertToProperties(ModelSection m){
			Properties prop = new Properties();
			OutputStream output = null;
			
			try {
				output = new FileOutputStream("C:/Users/sritika/Documents/Fall 2015/MDE/ReferenceImpl/ReferenceImplementation/ISHC.properties");
				for(int i =0; i<m.getF().length; i++){
					if(m.getF()[i]!= null){
						if(m.getF()[i].getFactorValues()!= null){
							String pVal = m.getF()[i].getFactorValues();
							
								prop.setProperty(m.getF()[i].getFactorName(), 
										pVal);
						}
					}
				}
				prop.store(output, null);
			} catch (IOException io) {
				io.printStackTrace();
			} finally {
				if (output != null) {
					try {
						output.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
		
			}
			}
}

