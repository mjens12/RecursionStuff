package package1;

public class CountPairs {
	public int countPairs(String str) {
		  if (str.length()<3)
		  return 0;
		  if (str.charAt(0) == str.charAt(2))
		  return 1 + countPairs(str.substring(1));
		  else return countPairs(str.substring(1));
		}
}