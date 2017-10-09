package is.ru.Calculator;

public class Calculator {
	
	public static int add(String text){
		String new_text = text.replaceAll("\\n", ",");

		if(new_text.equals("")){
			return 0;
		}
		else{
			if(text.contains(",")){
				String numbers[] = new_text.split(",");
				return sum(numbers);
			}
			return toInt(new_text);
		}
		
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static int sum(String [] numbers){
		int total = 0;
		String neg = "";
		boolean negativ = false;
		for(String n : numbers){
			if(toInt(n) > 1000){
				continue;
			}
			if(toInt(n) < 0){
				neg = negatives(neg, n);
				negativ = true;
			}
			else{
				total += toInt(n);
			}
		}

		if(negativ){
			throw new IllegalArgumentException("Negatives not allowed: " + neg);

		}
		return total;
	}

	private static String negatives(String negativs, String n){
		if(negativs.isEmpty()){
			negativs += n;
		}
		else{
			negativs += "," + n;
		}
		return negativs;
	}


}

