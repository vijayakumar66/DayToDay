package problems;

public class LetterCount {

	public static void main(String[] args) {
		String str = "Zsgs22Batch2008";
		countLetter(str);
	}

	private static void countLetter(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= '0' && c <= '9') {
				System.out.println(sb);
				int numberOftime = Character.getNumericValue(c);	
				sb.append(countNumberOfTimes(numberOftime, sb));
			} else {
				sb.append(c);	
			}
		}
	}

	private static StringBuffer countNumberOfTimes(int numberOftime, StringBuffer sb) {
		StringBuffer sbcopy = new StringBuffer();
		for (int j = 0; j < numberOftime; j++) {
			String strcopy = sb.toString();
			sbcopy.append(strcopy);
		}
		return sbcopy;
	}
}
/*
Output
Zsgs
ZsgsZsgsZsgs
ZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsBatch
ZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsBatchZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsBatchZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsBatch
ZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsBatchZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsBatchZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsBatch
ZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsBatchZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsBatchZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsZsgsBatch
*/
