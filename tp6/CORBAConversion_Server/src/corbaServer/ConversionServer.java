package corbaServer;

import javax.naming.Context;

import service.ConversionImpl;


public class ConversionServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ORB orb=ORB.init(args,null);
        POA poa=POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
        Context ctx=new initialContext();
        poa.the_POAManager().activate();
        ConversionImpl od = new ConversionImpl();
        ctx.rebind("OD", poa.servant_to_reference(od));
        orb.run();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
        
	}

}
