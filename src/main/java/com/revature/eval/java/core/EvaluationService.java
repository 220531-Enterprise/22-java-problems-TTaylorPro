package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class EvaluationService {

	/**
	 * 1.A Speed Converter - Convert to MilesPerHour
	 * 
	 * Write a method called toMilesPerHour that has 1 parameter of type double with
	 * the name kilometersPerHour. This method needs to return the rounded value of
	 * the calculation of type long.
	 * 
	 * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour
	 * needs to return -1 to indicate an invalid value.
	 * 
	 * Otherwise if it is positive, calculate the value of miles per hour, round it
	 * and return it. For conversion and rounding use Math.round().
	 */
	static class SpeedConverter {

		public static long toMilesPerHour(double kilometersPerHour) {
			// TODO Write an implementation for this method declaration
			if (kilometersPerHour<0.0)return -1;
			else {
				return (long)Math.round(kilometersPerHour * 0.621371);
			}
		}

		/**
		 * 1.B Speed Converter - Print Conversion
		 * 
		 * Write another method called printConversion with 1 parameter of type double
		 * with the name kilometersPerHour. This method needs to return a String and
		 * needs to calculate milesPerHour from the kilometersPerHour parameter.
		 * 
		 * The String should print in the format: "XX km/h = YY mi/h"
		 * 
		 * XX represents the original value kilometersPerHour. YY represents the rounded
		 * milesPerHour from the kilometersPerHour parameter.
		 * 
		 * If the parameter kilometersPerHour is < 0, then print the text "Invalid
		 * Value"
		 */
		public static String printConversion(double kilometersPerHour) {
			// TODO Write an implementation for this method declaration
			if (kilometersPerHour<0.0) return "Invalid Value";
			else {
				return (kilometersPerHour + " km/h = " + Math.round(kilometersPerHour * 0.621371) + " mi/h");
			}
		}
	}

	/**
	 * 2. MegaBytes and KiloBytes
	 * 
	 * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type
	 * int with the name kiloBytes.
	 * 
	 * The method should return a String and it needs to calculate the megabytes and
	 * remaining kilobytes from the kilobytes parameter.
	 * 
	 * Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
	 * 
	 * XX represents the original value kiloBytes. YY represents the calculated
	 * megabytes. ZZ represents the calculated remaining kilobytes.
	 * 
	 * For examples, when the parameter kiloBytes is 2500 it needs to print "2500 KB
	 * = 2 MB and 452 KB"
	 * 
	 * If the parameter kiloBytes is less than 0 then print the text "Invalid
	 * Value".
	 */
	public String printMegaBytesAndKiloBytes(int XX) {
		// TODO Write an implementation for this method declaration
		if (XX < 0) return "Invalid Value";
		else {
			return (XX + " KB = " + (XX/1024) + " MB and " + XX%1024 + " KB");
		}
	}

	/**
	 * 3. Barking Dog
	 * 
	 * We have a dog that loves to bark. We need to wake up if the dog is barking at
	 * night!
	 * 
	 * Write a method shouldWakeUp that has 2 parameters.
	 * 
	 * 1st parameter should be of type boolean and be named "barking". It represents
	 * if our dog is currently barking. 2nd parameter represents the hour of the day
	 * and is of type int with the name hourOfDay and has a valid range of 0-23.
	 * 
	 * We have to wake up if the dog is barking before 8 or after 22 hours, so in
	 * that case return true.
	 * 
	 * In all other cases return false.
	 * 
	 * If the hourOfDay parameter is less than 0 or greater than 23, return false.
	 */
	public boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
		// TODO Write an implementation for this method declaration
		if (((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay == 23)) && isBarking) return true;
		return false;
	}

	/**
	 * 4. DecimalComparator
	 * 
	 * Write a method areEqualByThreeDecimalPlaces with two parameters of type
	 * double.
	 * 
	 * The method should return boolean and it needs to return true if two double
	 * numbers are the same up to three decimal places.
	 * 
	 * Otherwise, return false;
	 */
	public boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
		// TODO Write an implementation for this method declaration
		if (((double)((int)(firstNum*1000)))/1000 == ((double)((int)(secondNum*1000)))/1000) return true;
		return false;
	}

	/**
	 * 5. Teen Number Checker
	 * 
	 * We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
	 * Write a method named hasTeen with 3 parameters of type int.
	 * 
	 * The method should return boolean and it needs to return true if ONE of the
	 * parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return
	 * false.
	 */
	static class TeenNumberChecker {

		public static boolean hasTeen(int x, int y, int z) {
			// TODO Write an implementation for this method declaration
			if(isTeen(x)||isTeen(y)||isTeen(z)) return true;
			return false;
		}

		// We can initialize isTeen method first
		// Then pass the parameter to hasTeen method

		public static boolean isTeen(int number) {
			// TODO Write an implementation for this method declaration
			if(number >= 13 && number <= 19) return true;
			return false;
		}
	}

	/**
	 * 6. Minutes To Years and Days Calculator
	 * 
	 * Write a method printYearsAndDays with parameter of type long named minutes.
	 * The method should not return anything (void) and it needs to calculate the
	 * years and days from the minutes parameter.
	 * 
	 * If the parameter is less than 0, print text "Invalid Value".
	 * 
	 * Otherwise, if the parameter is valid then it needs to print a message in the
	 * format "XX min = YY y and ZZ d".
	 * 
	 * XX represents the original value minutes. YY represents the calculated years.
	 * ZZ represents the calculated days.
	 */
	public String printYearsAndDays(long minutes) {
		// TODO Write an implementation for this method declaration
		if (minutes < 0) return "Invalid Value";
		else {
			return (minutes + " min = " + minutes/525600 + " y and " + (minutes%525600)/1440 + " d");
		}
	}

	/**
	 * 7. Number In Word
	 * 
	 * Write a method called printNumberInWord. The method has one parameter number
	 * which is the whole number. The method needs to print "ZERO", "ONE", "TWO",
	 * ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other
	 * for any other number including negative numbers. You can use if-else
	 * statement or switch statement whatever is easier for you.
	 */
	public String printNumberInWord(int number) {
		// TODO Write an implementation for this method declaration
		switch (number){
			case 0:
				return "ZERO";
			case 1:
				return "ONE";
			case 2:
				return "TWO";
			case 3: 
				return "THREE";
			case 4:
				return "FOUR";
			case 5:
				return "FIVE";
			case 6: 
				return "SIX";
			case 7:
				return "SEVEN";
			case 8: 
				return "EIGHT";
			case 9:
				return "NINE";
			default: 
				return "OTHER";
		}
	}

	/**
	 * 8. Greatest Common Divisor
	 * 
	 * Write a method named getGreatestCommonDivisor with two parameters of type int
	 * named first and second.
	 * 
	 * If one of the parameters is < 10, the method should return -1 to indicate an
	 * invalid value. The method should return the greatest common divisor of the
	 * two numbers (int).
	 * 
	 * The greatest common divisor is the largest positive integer that can fully
	 * divide each of the integers (i.e. without leaving a remainder).
	 * 
	 * For example 12 and 30: 12 can be divided by 1, 2, 3, 4, 6, 12 30 can be
	 * divided by 1, 2, 3, 5, 6, 10, 15, 30
	 * 
	 * The greatest common divisor is 6 since both 12 and 30 can be divided by 6,
	 * and there is no resulting remainder.
	 */
	public int getGreatestCommonDivisor(int first, int second) {
		// TODO Write an implementation for this method declaration
		if (first < 10 || second < 10) {
			return -1;
		}
		
		else if (first == second) {
			return first;
		}
		
		else {
			
			int larger;
			int smaller;
			
			if (first > second) {
				larger = first;
				smaller = second;
			}
			
			else {
				larger = second;
				smaller = first;
			}
			
			boolean done = false;
			int factorBeingChecked = 2;
			int lastFactorFound = 0;
			ArrayList<Integer> factors= new ArrayList<Integer>();
			factors.add(new Integer(1));
			
			while (!done) {
				if (factorBeingChecked == lastFactorFound) done = true;
				
				else {
					if (larger%factorBeingChecked == 0) {
						factors.add(new Integer(factorBeingChecked));
					
						if (larger/factorBeingChecked != factorBeingChecked) {
							factors.add(new Integer(larger/factorBeingChecked));
						}
					
						else done = true;
					
						lastFactorFound = larger/factorBeingChecked;
						
					}
					factorBeingChecked++;
				}
			}
			
			Collections.sort(factors, Collections.reverseOrder());
			
			for (Integer n: factors) {
				if (smaller%n.intValue() == 0) {
					return n.intValue();
				}
				
			}
			return -1;
		}
	}

	/**
	 * 9. First and Last Digit Sum
	 * 
	 * Write a method named sumFirstAndLastDigit with one parameter of type int
	 * called number.
	 * 
	 * The method needs to find the first and the last digit of the parameter number
	 * passed to the method, using a loop and return the sum of the first and the
	 * last digit of that number.
	 * 
	 * If the number is negative then the method needs to return -1 to indicate an
	 * invalid value.
	 */
	public int sumFirstAndLastDigit(int num) {
		// TODO Write an implementation for this method declaration
		if (num < 0) return -1;
		else if (num < 10) return num+num;
		else {
			String number = Integer.toString(num);
			Integer firstDigit = new Integer(number.substring(0, 1));
			Integer lastDigit = new Integer(number.substring(number.length()-1,number.length()));
			return firstDigit.intValue() + lastDigit.intValue();
		}
	}

	/**
	 * 10. Reverse String
	 * 
	 * Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 */
	public String reverse(String string) {
		// TODO Write an implementation for this method declaration
		
		if (string.length() < 2) return string;
		
		else {
			String reverse = "";
			for (int i = 0;i < string.length();i++) {
				reverse+=string.substring(string.length()-i-1,string.length()-i);
			}
			return reverse;
		}
	}

	/**
	 * 11. Acronyms
	 * 
	 * Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 */
	public String acronym(String phrase) {
		// TODO Write an implementation for this method declaration
		boolean getNextLetter = true;
		String acronym = "";
		
		for (int i = 0; i < phrase.length(); i++) {
			if(getNextLetter) {
				if(Character.isLetter(phrase.charAt(i))){
					acronym+=Character.toUpperCase(phrase.charAt(i));
					getNextLetter = false;
				}
			}
			
			else {
				//Contraction checker
				if(!Character.isLetter(phrase.charAt(i))) {
					if(phrase.charAt(i)=='\'' && i>0) {
						if(Character.isLetter(phrase.charAt(i-1))) {
							//do nothing if it's a contraction
						}
					}
					
					else getNextLetter = true;
				}
			}
		}
		
		return acronym;
	}

	/**
	 * 12. Triangles
	 * 
	 * Determine if a triangle is equilateral, isosceles, or scalene. An equilateral
	 * triangle has all three sides the same length. An isosceles triangle has at
	 * least two sides the same length.
	 * 
	 * (It is sometimes specified as having exactly two sides the same length, but
	 * for the purposes of this exercise we'll say at least two.) A scalene triangle
	 * has all sides of different lengths.
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			// TODO Write an implementation for this method declaration
			if(matchingSides()==3) return true;
			else return false;
		}

		public boolean isIsosceles() {
			if(matchingSides()!=0) return true; // TODO Write an implementation for this method declaration
			else return false;
		}

		public boolean isScalene() {
			// TODO Write an implementation for this method declaration
			if(matchingSides()==0) return true;
			else return false;
		}
		
		private int matchingSides(){
			int matches = 0;
			
			if (sideOne == sideTwo) matches++;
			if (sideTwo == sideThree) matches++;
			if (sideThree == sideOne) matches++;
			
			return matches;
		}

	}

	/**
	 * 13. Scrabble Score
	 * 
	 * Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 */
	public int getScrabbleScore(String string) {
		// TODO Write an implementation for this method declaration
		Map<Character, Integer> scoreSystem = new HashMap<Character, Integer>();
		insertScrabbleMap("AEIOULNRST", 1, scoreSystem);
		insertScrabbleMap("DG", 2, scoreSystem);
		insertScrabbleMap("BCMP", 3, scoreSystem);
		insertScrabbleMap("FHVWY", 4, scoreSystem);
		insertScrabbleMap("K", 5, scoreSystem);
		insertScrabbleMap("JX", 8, scoreSystem);
		insertScrabbleMap("QZ", 10, scoreSystem);
		
		int score = 0;
		
		for (int i = 0; i < string.length(); i++) {
			if(Character.isLetter(string.charAt(i))) {
				score+= scoreSystem.get(Character.toUpperCase(string.charAt(i))).intValue();
			}
		}
		
		return score;
	}
	
	private void insertScrabbleMap(String dict, int value, Map scoreSystem) {
		for (int i = 0; i < dict.length(); i++) {
			scoreSystem.put(dict.charAt(i),value);
		}
	}

	/**
	 * 14. Clean the Phone Number
	 * 
	 * Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) throws IllegalArgumentException {
		String number = "";
		for (int i = 0; i < string.length(); i++) {
			if(Character.isDigit(string.charAt(i))) number += string.charAt(i);
			else if (allowed(string.charAt(i), 0)) {
				//do nothing
			}
			else {
				//throw exception
				throw new IllegalArgumentException();
			}
		}
		
		if (number.length() != 10 && number.length() != 11) {
			//throw exception
			throw new IllegalArgumentException();
		}
		
		int buffer = 0;
		
		if(number.length() == 11) {
			if(number.charAt(0) != 1) {
				//throw exception
				throw new IllegalArgumentException();
			}
			buffer++;
		}
		
		for (int i = buffer; i < number.length(); i++) {
			if ((i - buffer == 0 || i - buffer == 3) && (!(allowed(number.charAt(i),1)))) {
				//throw exception
				throw new IllegalArgumentException();
			}
			
			else {
				if(!(allowed(number.charAt(i),2))) {
					//throw exception
					throw new IllegalArgumentException();
				}
			}
		}
		
		return number;
	}
	
	private boolean allowed(char c, int set) {
		String[] allowed = {"+-() .","23456789","0123456789"};
		
		for(int i = 0; i<allowed[set].length(); i++) {
			if (c == allowed[set].charAt(i)) return true;
		}
		return false;
	}

	/**
	 * 15. Recurring Word Counter
	 * 
	 * Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 */
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		boolean wordFound = false;
		String foundWord = "";
		
		for (int i = 0; i < string.length(); i++) {
			if (!wordFound) {
				if (Character.isLetter(string.charAt(i)) || string.charAt(i) == '\''){
					wordFound = true;
					foundWord+= string.charAt(i);
				}
			}
			
			else {
				if(!(Character.isLetter(string.charAt(i)) || string.charAt(i) == '\'')) {
					wordFound = false;
					
					if (wordCount.containsKey(foundWord)) {
						wordCount.put(foundWord, wordCount.get(foundWord) + 1);
					}
					
					else {
						wordCount.put(foundWord, 1);
					}
					
					foundWord = "";
				}
				
				else {
					foundWord+= string.charAt(i);
				}
			}
		}
		
		if (wordFound) {
			if (wordCount.containsKey(foundWord)) {
				wordCount.put(foundWord, wordCount.get(foundWord) + 1);
			}
			
			else {
				wordCount.put(foundWord, 1);
			}
		}
		
		return wordCount;
	}

	/**
	 * 16. Armstrong Number
	 * 
	 * An Armstrong number is a number that is the sum of its own digits each raised
	 * to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 */
	public boolean isArmstrongNumber(int input) {
		if (input < 0) return false;
		else if (input < 10) return true;
		else {
		
		String in = Integer.toString(input);
		int length = in.length();
		int total = 0;
		for (int i = 0; i < length; i++) {
			total+= Math.pow(Character.getNumericValue(in.charAt(i)), length);//digit at index equals character at index
			
		}
		
		return (total == input);
		}
		
	}

	/**
	 * 17. Prime Factors
	 * 
	 * Compute the prime factors of a given natural number. A prime number is only
	 * evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 */
	
	List<Long> primeFactors;
	
	public List<Long> calculatePrimeFactorsOf(long l) {
		// TODO Write an implementation for this method declaration
		 primeFactors = new LinkedList<Long>();
		
		if (l < 1L) {
			//return primeFactors;
		}
		else if (l < 4L) {
			primeFactors.add(l);
			System.out.println("Found one: " + l);
			//return primeFactors;
		}
		else {
			boolean factorFound = false;
			long foundFactor = 0L;
			for(long m = 2L; m <= l/2; m++) {
				if (l%m == 0) {
					factorFound = true;
					foundFactor = m;
					break;
				}
			}
			
			if (!factorFound) primeFactors.add(l);
			else {
				rCalculatePrimeFactorsOf(foundFactor);
				rCalculatePrimeFactorsOf(l/foundFactor);
			}
		}
		
		
		return primeFactors;
	}
	
	private void rCalculatePrimeFactorsOf(long l) {
		if (l < 1L) {
			//return primeFactors;
		}
		else if (l < 4L) {
			primeFactors.add(l);
			//return primeFactors;
		}
		else {
			boolean factorFound = false;
			long foundFactor = 0L;
			for(long m = 2L; m <= l/2; m++) {
				if (l%m == 0) {
					factorFound = true;
					foundFactor = m;
					break;
				}
			}
			
			if (!factorFound) primeFactors.add(l);
			else {
				rCalculatePrimeFactorsOf(foundFactor);
				rCalculatePrimeFactorsOf(l/foundFactor);
			}
		}
	}

	/**
	 * 18. Calculate Nth Prime
	 * 
	 * Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 */
	public int calculateNthPrime(int k) {
		// TODO Write an implementation for this method declaration
		if (k < 1) throw new IllegalArgumentException();
		else if (k == 1) return 2;
		int[] primes = new int[k];
		primes[0] = 2;
		int primesCount = 1;
		int toCheck = 3;
		boolean done = false;
		boolean prime = true;
		
		while (!done) {
			for (int i = 0; i < primesCount; i++) {
				if (toCheck%primes[i]==0) {
					prime = false;
					break;
				}
			}
			if (prime == true) {
				primes[primesCount]= toCheck;
				primesCount++;
				if (primesCount==k) done = true;
			}
			toCheck++;
			prime = true;
		}
		
		
		
		
		return primes[k-1];
	}

	/**
	 * 19. Pangram
	 * 
	 * Determine if a sentence is a pangram. A pangram (Greek: ?????? ????????????, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 */
	public boolean isPangram(String string) {
		// TODO Write an implementation for this method declaration
		
		Set<Character> alphabet = new HashSet<Character>();
		
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLetter(string.charAt(i))) alphabet.add(Character.toLowerCase(string.charAt(i)));
		}
		
		if (alphabet.size() == 26) return true;
		
		else return false;
	}

	/**
	 * 20. Sum of Multiples 
	 * 
	 * Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 */
	public int getSumOfMultiples(int i, int[] set) {
		int sum = 0;
		boolean found = false;
		for (int j = 1; j < i; j++) {
			for (int k = 0; k < set.length;k++) {
				if (j%set[k] == 0) found = true;
			}
			if (found == true) sum+= j;
			found = false;
		}
		
		return sum;
	}
	
	/**
	 * 21. Three Magic Numbers
	 * 
	 * You work at a casino in Las Vegas.  Your job is to program a slot machine to
	 * return 3 random numbers using the java.util.Random class.
	 * 
	 * Write a method to return an int array of 3 random numbers between 1 - 100.
	 * Generate the 3 random numbers (1 - 100 inclusive) using the java.util.Random class.
	 */
	
	public int[] threeLuckyNumbers() {
		Random rand = new Random();
		int[] threeLuckyNumbers = new int[3];
		for (int i = 0; i < 3; i++) {
			threeLuckyNumbers[i] = (rand.nextInt(99))+1;
		}
		
		return threeLuckyNumbers;
	}
	
	/*
	 * 22. Easy Guessing Game
	 * 
	 * Create a program to generate a number between the given range:
	 * int x = minimum
	 * iny y = maximum (inclusive)
	 * 
	 * You must use the Math.random class to generate a random number between x and y.
	 */
	
	public int guessingGame(int x, int y) {
		Random rand = new Random();
		return rand.nextInt(x,y+1);
	}
}
