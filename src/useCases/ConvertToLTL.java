package useCases;

import generatedArtifacts.Query;


public class ConvertToLTL {
	public static  void convert(Query q)
	{
		
		ToLTL l = new ToLTL(q);
		String LTL = l.toLTL();
		
		System.out.println(LTL);
	}
	
	public static void main(String []args){
		Query q = new Query("inflammation is absent after cytokine < cytokineThreshold");
		convert(q);
	}

}
