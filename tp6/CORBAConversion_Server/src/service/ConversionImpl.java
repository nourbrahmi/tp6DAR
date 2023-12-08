package service;
import corbaConversion.IConversionRemotePOA;


public class ConversionImpl extends IConversionRemotePOA {

	@Override
	public double convertirMontant(double mt) {
		// TODO Auto-generated method stub
		return mt*3.3;
	}

}
