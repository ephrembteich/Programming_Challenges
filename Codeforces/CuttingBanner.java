/* we basically can try to eliminate every possible substring and check if the concatenation of the remaining substrings is equal to "CODEFORCES".
 * but we  can also decrease the cost of this operation by eliminating the substrings with a specific length where the remaining two substrings
 * have exactly the length of "CODEFORCES"*/

import java.util.Scanner;

public class CuttingBanner {
	
	static String banner = "CODEFORCES";
	static int bannerLen = banner.length();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		scan.close();
		
		int wordLen = word.length();
		int cutLen = wordLen - bannerLen;
		
		String feasable = "NO";
		if(wordLen>bannerLen){
			for(int i=0; i<word.length()-cutLen+1; i++){
				String remain = word.substring(0, i)+word.substring(i+cutLen, wordLen);
				if(remain.equals(banner)){
					feasable = "YES";
					break;
				}
			}
		}
		System.out.println(feasable);
	}
}