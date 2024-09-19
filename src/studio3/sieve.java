package studio3;

import java.util.Scanner;

public class sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println ("enter integer prime");
		int n = in.nextInt();
		boolean [] primeNumbers = new boolean [n] ;
		int p = 2;
		for (int i = 4; i < n; i= i + 2) {
			primeNumbers[i] = true;
		}
		for (int i = 6; i< n; i= i + 3) {
			primeNumbers[i]=true;
		}
		for (int i = 10; i<n; i=i+5) {
			primeNumbers[i]=true;
		}
		for (int i = 14; i<n; i=i+7) {
			primeNumbers[i]=true;
		}
		for (int i=2; i<n; i++){
			if (primeNumbers [i]== false) {
				System.out.println (i);
			}
		}
	}
	}


