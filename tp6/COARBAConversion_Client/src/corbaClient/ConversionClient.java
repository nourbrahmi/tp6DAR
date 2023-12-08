import javax.naming.Context;
public class ConversionClient {
    public static void main(String[]args)
    {

        Context ctx=new initialContext();
        java.lang.Object ref=ctx.lookup();
        IConversionRemote stub=IConversionRemoteHelper.narrow((org.omg.CORBA.Object)ref);

        System.out.println(stub.conversionMontant(70.00));
        System.out.println(stub.conversionMontant(150.00));
    }
}