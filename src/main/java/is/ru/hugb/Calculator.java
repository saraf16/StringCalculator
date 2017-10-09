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
			return 1;
		}
		
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static int sum(String [] numbers){
		int total = 0;
		for(String n : numbers){
			total += toInt(n);
		}
		return total;
	}
}

