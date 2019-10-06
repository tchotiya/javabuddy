package OcurrenceChar;

public class OcurrenceCharCounts {

	public static void main(String[] args) {
		String str1="My First Learning program";
		String str=str1.toUpperCase();
		String a[]=str.split(" ");

		
		int[] cnt = new int[255];		//created int array 
 
		for (int i = 0; i < str.length(); i++) {

			cnt[str.charAt(i)]++;
			//System.out.println(cnt[str.charAt(i)]);  //print array value or position
		}
 
		char[] ch = new char[str.length()];   //new char assinged for comparison
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			int tt = 0;
			for (int j = 0; j <= i; j++) {
				if (str.charAt(i) == ch[j])
					tt++;
			}
 
			if (tt == 1) {
				System.out.println("Occurrence of " + str.charAt(i) + " is " + cnt[str.charAt(i)]);
			}
		}
	}
}