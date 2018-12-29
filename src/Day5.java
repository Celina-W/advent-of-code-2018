import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day5 {

	public static void main(String[] args) throws FileNotFoundException {
		
		// String puzzleInput = "dabAcCaCBAcCcaDA";
		
		// Read and store in puzzle input
		Scanner in = new Scanner(new File("Day5PuzzleInput"));
		String puzzleInput = in.useDelimiter("\\A").next();
		in.close();
		
		// PART 1
		System.out.printf("Number of units: %d\n", react(puzzleInput).length());
		
		// PART 2
		System.out.printf("Shortest polymer: %d\n", optimize(puzzleInput));

	}
	
	public static String react(String polymer) {
		
		String originalPolymer = polymer;
		
		// iterate through the polymer and cause necessary reactions
		for (int pointer = 0; pointer < polymer.length() - 1; pointer++) {
			if (Character.isUpperCase(polymer.charAt(pointer)) && Character.isLowerCase(polymer.charAt(pointer+1))) {
				if (polymer.charAt(pointer) == Character.toUpperCase(polymer.charAt(pointer+1))) {
					polymer = polymer.substring(0,pointer) + polymer.substring(pointer+2);
				}
			}
			else if (Character.isLowerCase(polymer.charAt(pointer)) && Character.isUpperCase(polymer.charAt(pointer+1))) {
				if (polymer.charAt(pointer) == Character.toLowerCase(polymer.charAt(pointer+1))) {
					polymer = polymer.substring(0,pointer) + polymer.substring(pointer+2);
				}
			}
		}
		
		// keep reacting until there is nothing left to react
		if (originalPolymer.length() == polymer.length()) {
			return polymer;
		}
		else {
			return react(polymer);
		}
		
	}
	
	public static int optimize(String polymer) {
		
		int shortest = Integer.MAX_VALUE;
		
		for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
			
			// remove both unpolarized and polarized alphabet unit
			String optimizedPolymer = polymer.replace(Character.toString(alphabet),"");
			optimizedPolymer = optimizedPolymer.replace(Character.toString(Character.toUpperCase(alphabet)),"");
			
			// fully react the new polymer
			optimizedPolymer = react(optimizedPolymer);
			
			// store the length of the polymer if it is the shortest polymer so far
			if (optimizedPolymer.length() < shortest) {
				shortest = optimizedPolymer.length();
			}
			
		}
		
		return shortest;
		
	}

}
