package StringLearn;

public class CharDuplicate {
	
	
	public static void duplicatecheck(String strr,char c)
	{ char ch=c;
	int fIndex=strr.indexOf(ch);
	int lIndex=strr.lastIndexOf(ch);
	System.out.println(fIndex+" "+lIndex);
	
		boolean b=fIndex==lIndex;
		
		if(b) 
		{
			
			System.out.println(ch + " is not duplicate string");}
			else 
			{
				System.out.println(ch + " is duplicate string");	
			}
		}
		
	public static void main(String[] args) {
		
		
		 String str = "java";
		 
		 for(int i=0;i<str.length();i++)
		 
		 {char ch=str.charAt(i);
		 
		 //System.out.println(ch);
		 
		duplicatecheck(str,ch);}
	
	}
	
}
