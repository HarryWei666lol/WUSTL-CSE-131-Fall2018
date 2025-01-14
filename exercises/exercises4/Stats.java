package exercises4;

import sedgewick.StdIn;
import cse131.ArgsProcessor;

public class Stats {

	public static void main(String[] args) {
		// prompt the user for the file to be used for this run
		ArgsProcessor.useStdInput("datafiles/average");

		// verify we are on the right track by reading in the doubles and printing them
		//  Read in the data from the opened file, computing the
		//     sum, average, count, max, and min
		//  of the data
		double sum = 0;
		int count = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		while (!StdIn.isEmpty()) {//another double to be read
			double d = StdIn.readDouble();
			if (d > max) {
				max = d;
			}
			if (d < min) {
				min = d;
			}
			sum = sum + d;
			count = count + 1;
			
				
		}
		System.out.println("Sum " + sum);
		System.out.println("Count " + count);
		System.out.println("Average " + (sum / count));
		System.out.println("Min " + min);
		System.out.println("Max " + max);
		//  count is the number of doubles read from the file
		//  The other statistics should be clear from their names
		//

	}

}
