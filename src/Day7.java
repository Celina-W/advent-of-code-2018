import java.util.Arrays;

public class Day7 {
	
	final static int NUM_OF_LETTERS = 26;
	final static char FINAL_LETTER = 'Z';

	public static void main(String[] args) {
		
//		String puzzleInput = "Step C must be finished before step A can begin.\r\n" + 
//				"Step C must be finished before step F can begin.\r\n" + 
//				"Step A must be finished before step B can begin.\r\n" + 
//				"Step A must be finished before step D can begin.\r\n" + 
//				"Step B must be finished before step E can begin.\r\n" + 
//				"Step D must be finished before step E can begin.\r\n" + 
//				"Step F must be finished before step E can begin.";
		String puzzleInput = "Step G must be finished before step M can begin.\r\n" + 
				"Step T must be finished before step E can begin.\r\n" + 
				"Step P must be finished before step M can begin.\r\n" + 
				"Step V must be finished before step L can begin.\r\n" + 
				"Step Y must be finished before step B can begin.\r\n" + 
				"Step K must be finished before step Z can begin.\r\n" + 
				"Step H must be finished before step I can begin.\r\n" + 
				"Step D must be finished before step U can begin.\r\n" + 
				"Step C must be finished before step L can begin.\r\n" + 
				"Step R must be finished before step Z can begin.\r\n" + 
				"Step U must be finished before step B can begin.\r\n" + 
				"Step J must be finished before step M can begin.\r\n" + 
				"Step M must be finished before step E can begin.\r\n" + 
				"Step I must be finished before step X can begin.\r\n" + 
				"Step N must be finished before step O can begin.\r\n" + 
				"Step S must be finished before step F can begin.\r\n" + 
				"Step X must be finished before step A can begin.\r\n" + 
				"Step F must be finished before step Q can begin.\r\n" + 
				"Step B must be finished before step Z can begin.\r\n" + 
				"Step Q must be finished before step W can begin.\r\n" + 
				"Step L must be finished before step W can begin.\r\n" + 
				"Step O must be finished before step Z can begin.\r\n" + 
				"Step A must be finished before step Z can begin.\r\n" + 
				"Step E must be finished before step W can begin.\r\n" + 
				"Step W must be finished before step Z can begin.\r\n" + 
				"Step G must be finished before step R can begin.\r\n" + 
				"Step H must be finished before step A can begin.\r\n" + 
				"Step A must be finished before step W can begin.\r\n" + 
				"Step Y must be finished before step D can begin.\r\n" + 
				"Step O must be finished before step A can begin.\r\n" + 
				"Step V must be finished before step U can begin.\r\n" + 
				"Step H must be finished before step W can begin.\r\n" + 
				"Step K must be finished before step F can begin.\r\n" + 
				"Step J must be finished before step X can begin.\r\n" + 
				"Step V must be finished before step R can begin.\r\n" + 
				"Step Q must be finished before step A can begin.\r\n" + 
				"Step F must be finished before step B can begin.\r\n" + 
				"Step G must be finished before step P can begin.\r\n" + 
				"Step L must be finished before step A can begin.\r\n" + 
				"Step B must be finished before step Q can begin.\r\n" + 
				"Step H must be finished before step J can begin.\r\n" + 
				"Step J must be finished before step L can begin.\r\n" + 
				"Step F must be finished before step E can begin.\r\n" + 
				"Step U must be finished before step A can begin.\r\n" + 
				"Step G must be finished before step Q can begin.\r\n" + 
				"Step G must be finished before step S can begin.\r\n" + 
				"Step K must be finished before step J can begin.\r\n" + 
				"Step N must be finished before step B can begin.\r\n" + 
				"Step F must be finished before step O can begin.\r\n" + 
				"Step C must be finished before step Z can begin.\r\n" + 
				"Step B must be finished before step E can begin.\r\n" + 
				"Step M must be finished before step S can begin.\r\n" + 
				"Step A must be finished before step E can begin.\r\n" + 
				"Step E must be finished before step Z can begin.\r\n" + 
				"Step K must be finished before step I can begin.\r\n" + 
				"Step P must be finished before step A can begin.\r\n" + 
				"Step Y must be finished before step L can begin.\r\n" + 
				"Step Y must be finished before step J can begin.\r\n" + 
				"Step G must be finished before step N can begin.\r\n" + 
				"Step Q must be finished before step L can begin.\r\n" + 
				"Step D must be finished before step X can begin.\r\n" + 
				"Step C must be finished before step I can begin.\r\n" + 
				"Step K must be finished before step B can begin.\r\n" + 
				"Step N must be finished before step F can begin.\r\n" + 
				"Step D must be finished before step M can begin.\r\n" + 
				"Step B must be finished before step A can begin.\r\n" + 
				"Step U must be finished before step J can begin.\r\n" + 
				"Step Q must be finished before step Z can begin.\r\n" + 
				"Step X must be finished before step F can begin.\r\n" + 
				"Step K must be finished before step X can begin.\r\n" + 
				"Step U must be finished before step E can begin.\r\n" + 
				"Step X must be finished before step W can begin.\r\n" + 
				"Step K must be finished before step Q can begin.\r\n" + 
				"Step I must be finished before step E can begin.\r\n" + 
				"Step D must be finished before step J can begin.\r\n" + 
				"Step P must be finished before step I can begin.\r\n" + 
				"Step K must be finished before step D can begin.\r\n" + 
				"Step S must be finished before step X can begin.\r\n" + 
				"Step C must be finished before step R can begin.\r\n" + 
				"Step P must be finished before step W can begin.\r\n" + 
				"Step I must be finished before step O can begin.\r\n" + 
				"Step S must be finished before step O can begin.\r\n" + 
				"Step K must be finished before step C can begin.\r\n" + 
				"Step N must be finished before step Q can begin.\r\n" + 
				"Step L must be finished before step E can begin.\r\n" + 
				"Step L must be finished before step Z can begin.\r\n" + 
				"Step K must be finished before step W can begin.\r\n" + 
				"Step Y must be finished before step A can begin.\r\n" + 
				"Step L must be finished before step O can begin.\r\n" + 
				"Step N must be finished before step W can begin.\r\n" + 
				"Step R must be finished before step W can begin.\r\n" + 
				"Step C must be finished before step O can begin.\r\n" + 
				"Step H must be finished before step X can begin.\r\n" + 
				"Step V must be finished before step Y can begin.\r\n" + 
				"Step S must be finished before step W can begin.\r\n" + 
				"Step V must be finished before step E can begin.\r\n" + 
				"Step Q must be finished before step E can begin.\r\n" + 
				"Step P must be finished before step H can begin.\r\n" + 
				"Step V must be finished before step H can begin.\r\n" + 
				"Step N must be finished before step Z can begin.\r\n" + 
				"Step C must be finished before step A can begin.";
		
		char[][] steps = organize(puzzleInput);
//		for (int i = 0; i < steps.length; i++) {
//			for (int j = 0; j < steps[i].length; j++) {
//				System.out.print(steps[i][j] + " ");
//			}
//			System.out.println();
//		}
		char[] orderedSteps = order(steps);
		System.out.print("The order of steps is: ");
		for (int i = 0; i < orderedSteps.length; i++) {
			System.out.print(orderedSteps[i]);
		}
		System.out.println();

	}
	
	public static char[][] organize(String input) {
		
		// split input up into an array of [unlocked step][prerequisite]
		String[] splitInput = input.split("\r\n");
		int prereqIndex = splitInput[0].indexOf(" ") + 1;
		int unlockedIndex = splitInput[0].indexOf("step ") + "step ".length();
		
		char[][] charInput = new char[splitInput.length][2];
		
		for (int i = 0; i < splitInput.length; i++) {
			charInput[i][0] = splitInput[i].charAt(unlockedIndex);
			charInput[i][1] = splitInput[i].charAt(prereqIndex);
			// System.out.println(charInput[i][0] + " " + charInput[i][1]);
		}
		
		// create an array of [unlocked step][total prerequisites]
		char[][] steps = new char[NUM_OF_LETTERS][NUM_OF_LETTERS];
		int stepSize = 0;
		
		// iterate over alphabet
		for (char alphabet = 'A'; alphabet <= FINAL_LETTER; alphabet++) {
			int prereqSize = 1;
			steps[stepSize][0] = alphabet;
			
			// iterate over input
			for (int i = 0; i < charInput.length; i++) {
				// if the letter is found, add to steps
				if (alphabet == charInput[i][0]) {
					steps[stepSize][prereqSize] = charInput[i][1];
					prereqSize++;
				}
			}
			
			// trim the letter's array
			steps[stepSize] = Arrays.copyOf(steps[stepSize], prereqSize);
			stepSize++;
		}
		
		return steps;
		
	}
	
	public static char[] order(char[][] steps) {
		
		// create an array with the order of steps
		char[] sequence = new char[NUM_OF_LETTERS];
		int sequenceSize = 0;
		
		// repeat until we have the whole order
		while (sequenceSize < sequence.length) {
			
			int i = 0;
			boolean found = false;
			
			while (i < steps.length && !found) {
				
				// find the first letter without prerequisites
				if (steps[i].length == 1) {
					
					// add the letter to the sequence
					char letter = steps[i][0];
					found = true;
					sequence[sequenceSize] = letter;
					sequenceSize++;
					
					// remove the letter from the array
					steps = Arrays.copyOf(remove(steps, steps.length, i), steps.length - 1);
					
					// remove the letter from the prerequisite arrays
					for (int j = 0; j < steps.length; j++) {
						for (int k = 0; k < steps[j].length; k++) {
							if (steps[j][k] == letter) {
								steps[j] = Arrays.copyOf(remove(steps[j], steps[j].length, k), steps[j].length - 1);
							}
						}
					}
					
				}
				
				i++;
				
			}
			
		}
		
		return sequence;
		
	}
	
	public static char[][] remove(char[][] input, int inputSize, int pos) {
		for (int i = pos + 1; i < inputSize; i++) {
			input[i - 1] = Arrays.copyOf(input[i],input[i].length);
		}
		return input;
	}
	
	public static char[] remove(char[] input, int inputSize, int pos) {
		for (int i = pos + 1; i < inputSize; i++) {
			input[i - 1] = input[i];
		}
		return input;
	}

}
