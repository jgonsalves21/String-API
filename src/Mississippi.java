
public class Mississippi {

	public static void main(String[] args) 
	{
		
		String river = "Mississippi";
		int length = river.length();
		String greeting = "Hello, world";
		String replace = river.replace("p", "s");
		String upper = river.toUpperCase();
		
		System.out.println(length);
		
		System.out.println(greeting.toUpperCase());
		
		System.out.println(replace);
		/* OR */
		System.out.println(river.replace("p", "s"));
		
		System.out.println(upper);
		
		/* You can't say "river.println();", because System.out.print has to be before it
		Also, river is a string that is an object. println is a system method, and cannot be called on a string */
		
		// The arguments in the method river.replace("p", "s") are "p" and "s"
		
		
	}

}
