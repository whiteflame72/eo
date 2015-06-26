package com.eolinc.utility;

import com.eolinc.exception.EOLException;

public abstract class EOLUtility {

	public static Integer convertToPosInt(String strNumber) throws EOLException {
		if (strNumber == null || strNumber.length()==0 || "0".equals(strNumber)) {
			throw new EOLException("Invalid Screen");
		}
		return Integer.valueOf(strNumber);
	}
	
	public static double round(double number, int nDigits) {
		long power = (long) Math.pow(10.0d, nDigits);
		long longNum = (long) (number * power);
		return ((double) longNum) / power;
	}

}
