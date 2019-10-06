package DupChar;

public class DupCha {

	public static void main(String[] args) {
		
		String str1="My First Learning program";
		String str=str1.toUpperCase();
		String a[]=str.split(" ");

		
		int[] cnt = new int[255];		 
 
		for (int i = 0; i < str.length(); i++) {

			cnt[str.charAt(i)]++;
		}
 
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			int tt = 0;
			for (int j = 0; j <= i; j++) {
				if (str.charAt(i) == ch[j])
					tt++;
			}
 
			if (tt > 1) {
				System.out.println("Duplicate Characters are " + str.charAt(i) +" " + cnt[str.charAt(i)]);
			}
		}
	}
}
		


