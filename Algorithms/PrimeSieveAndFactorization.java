import java.util.Arrays;

/* This sieve runs in O(sqrt(N)log(log(N)))*/
public class PrimeSieveAndFactorization {
	static int N = 100; //per example
	static int[] primes = new int[N];
	static boolean[] composite = new boolean[N];
	static int counter = 0; // count number of primes

	static int[] smf = new int[N];//sieveSMF

	public static void main(String[] args) {
		sieve();
		System.out.println(Arrays.toString(primes));
		composite = new boolean [N];
		sieveSMF();
		System.out.println(Arrays.toString(smf));
		primeFactorization(96);
	}

	public static void sieve() {
		composite[0] = true;
		composite[1] = true;

		//runs in root of N
		for(int i = 2; i * i <= N; i++) {
			//if a number is composite than we loop over its factors in N
			//and set them to true (as composite numbers)
			if(!composite[i]) {
				for(int j = i + i; j < N; j += i) {
					composite[j] = true;
				}
			}
		}

		//each item in composite that has its vlue as false is a prime
		//we insert it in the primes array and increment the counter
		for(int i = 2; i < N; i++) {
			if(!composite[i]) primes[counter++] = i;
		}
	}

	/*
	 * smf[i] contains smallest prime factor of i
	 * instead of looping all primes, it directly locates the smallest prime and divides by it
	 */
	public static void sieveSMF() {
		Arrays.fill(smf, N + 1);
		for(int i = 2; i < composite.length; i++) {
			if(!composite[i]) {
				smf[i] = i; //if it is a prime then its smallest prime that divides it is itself
				//and we loop over its factors and set them to true
				for(int j = i + i; j < composite.length; j += i) {
					composite[j] = true;
					smf[j] = Math.min(smf[j], i);	//smf[i] is initially N+1
				}
			}
		}
	}

	/* This method uses the sieveSMF. It goes directly to the number and finds its
	 * smallest prime factor, prints it, then divides the number by it and call the
	 * method again until no remainder is found.
	 * If N is prime > 10000000000 it requires one iteration using this solution,
	 * however, it requires N / log(N) with normal sieve
	 */
	public static void primeFactorization(int n) {
		System.out.print(n+" = ");
		while(n != 1) {
			int poweri = 0;
			int prime = smf[n];
			while(n % prime == 0) {
				poweri++;
				n /= prime;
			}
			System.out.print( prime + "^" + poweri + " ");
			if(n!=1) System.out.print("* ");
		}
	}
}