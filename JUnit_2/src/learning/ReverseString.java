package learning;

public class ReverseString {

//	public static void main(String[] args) {
//		ReverseString r = new ReverseString();
//		String reverse = r.reverseString("java python");
//		System.out.println(reverse);
//	}
	
	public String reverseString(String str) {
		char[] charArray = str.toCharArray();
		
		int left = 0;
		int right = charArray.length-1;
		
		while(left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			
			left++;
			right--;
		}
		return new String(charArray);
	}
}
