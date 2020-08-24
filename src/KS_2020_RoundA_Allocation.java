import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//KickStart - 2020 - RoundA - Allocation
//https://codingcompetitions.withgoogle.com/kickstart/round/000000000019ffc7
public class KS_2020_RoundA_Allocation{

	public static void main(String[] args) {
	    Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter w = new PrintWriter(System.out);
	
		int numberOfTestCases = sc.nextInt();

		for(int i = 1; i <= numberOfTestCases;i++) {
			
			int numberOfHouses = sc.nextInt();
			int budget = sc.nextInt();

			long[] houseCosts= new long[numberOfHouses];

			for(int j = 0; j <numberOfHouses ; j++) {
				houseCosts[j] = sc.nextLong();
			}

			w.println("Case #" + i + ": " + FindMaxHousesToBuy(budget, houseCosts));
		}

		w.close();
		sc.close();
	}

	private static int FindMaxHousesToBuy(int budget, long[] sortedCosts) {
	
		Arrays.sort(sortedCosts);;
		int sum = 0;
		int index = 0;
		
		for(;index < sortedCosts.length; index++) 
			if(sum + sortedCosts[index] <= budget)
				sum += sortedCosts[index];
			else 
				break;
		
		return index;
	}
}
