package net.iessanclemente.a13juanlr.katafizzbuzz;

public class metodos {
	public String comprobacionNumeros(int num){
		String result = ""+num;
		if(num%3 == 0 && num%5 == 0){
			result = "FizzBuzz";
		}else if(num%5 == 0){
			result = "Buzz";
		}else if(num%3 == 0){
			result = "Fizz";
		}
		return result;
	}
}
