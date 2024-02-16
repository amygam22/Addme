package StringLearn;

public class FindingIndexCharDupli {

	
	
	public static void duplicatechecking(String strr,char b)
	
	{char ch = b;
	int Findex = strr.indexOf(ch);
	int Lindex = strr.lastIndexOf(ch);
	
	System.out.println(Findex+""+Lindex);
	
	boolean c = Findex==Lindex;
	
	if (c){
		
	System.out.println(ch + "is not a Duplicate string");}
	else {
		
		System.out.println(ch + "is a Duplicate string");	
	}
	
	}
	
	
	
}
