package br.com.erudio.services;

import org.springframework.stereotype.Service;

import br.com.erudio.exceptions.UnsuportedMathOperationException;

@Service
public class MathService {

	public Double sum(String numberOne, String numberTwo) {
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		 
		return convertToDouble(numberOne) + convertToDouble(numberTwo);
	}
	
	public Double subtraction(String numberOne, String numberTwo) {
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		 
		return convertToDouble(numberOne) - convertToDouble(numberTwo);
	}
	
	public Double multiplication(String numberOne, String numberTwo) {
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		 
		return convertToDouble(numberOne) * convertToDouble(numberTwo);
	}
	
	public Double division(String numberOne, String numberTwo) {
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		 
		return convertToDouble(numberOne) / convertToDouble(numberTwo);
	}
	
	public Double mean(String numberOne, String numberTwo) {
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		 
		return (convertToDouble(numberOne)+ convertToDouble(numberTwo)) / 2;
	}
	
	public Double squareRoot(String number) {
		if(!isNumeric(number)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		 
		return Math.sqrt(convertToDouble(number));
	}
	
	
	private Double convertToDouble(String strNumber) {
		if(strNumber == null) return 0D;
		String number = strNumber.replaceAll(",", ".");
		if(isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}

	private boolean isNumeric(String strNumber) {
		if(strNumber == null) return false;
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
}
