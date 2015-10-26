/*
 * Calculates the inverse of a number (mod m)
 */
public class ModInverse {

	public static void main(String[] args) {

	}

	/* The gcd (mod m) = s * a + t * m (mod m) = s * a because t*m (mod m)=0
	 * Thus we have 1 = s * a, and the inverse of a is s
	 * We calculate s in bezout() recursively
	 */
	public static int modInverse(int a, int m) {
		int[] val = bezout(a, m);
		int gcd = val[0];
		int s = val[1];
		
		//if gcd(a, m) is not 1, then a does not has an mod m inverse
		if(gcd > 1) return -1;
		//if gcd(a, m)==1, then s is its modular inverse
		//if negative, we add m to s
		else return s > 0? s : m + s;
	}

	/* return [gcd, s, t] where gcd = s * a + t * m 
	 * by recursion 
	 */
	public static int[] bezout(int a, int b) {
		if(b == 0) return new int[] {a, 1, 0}; // base case
		int[] val = bezout(b, a % b);
		int gcd = val[0];
		int s = val[1];
		int t = val[2];
		return new int[] { gcd, t, s - t * (a / b) };
	}
}