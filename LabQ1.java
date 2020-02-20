public class LabQ1
{
	public static void main(String args[])
	{
		String s="The quick brown fox jumps over the lazy dog";
		System.out.println(s.charAt(12));
		boolean a=s.contains("is");
		System.out.println(a);
		System.out.println(s.concat("and killed it")+"(concat)");
		System.out.println(s+"and killed it"+"(add)");
		System.out.println(s.endsWith("dogs"));
		String s2="The quick brown Fox jumps over the lazy Dog";
		System.out.println(s.contentEquals(s2));
		String s3="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		System.out.println(s.matches(s3));
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('e'));
		System.out.println(s.length());
		String s4="The quick brown Fox jumps over the lazy Dog";
		System.out.println(s.contentEquals(s4));
		System.out.println(s.replace("The", "A"));
		String s5="The quick brown fox @jumps over the lazy dog";
	    String[] arrOfStr = s5.split("@", 2); 
	    for (int i=0;i<arrOfStr.length;i++) 
	    {
	    	System.out.println(arrOfStr[i]); 
	    }
	    int b= s.indexOf("fox");
	    int c= s.indexOf("dog");
	    System.out.println(s.substring(b,b+3));
	    System.out.println(s.substring(c,c+3));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}
}