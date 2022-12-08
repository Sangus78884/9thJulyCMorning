package string1;

public class StringMethods 
{
public static void main(String[] args) 

{
	//string length method
	System.out.println("==============");
	//1stway of printing string length
	String s ="sangmeshwar";
	
	System.out.println(s.length());
	
	//2nd way of printing string length we can reuse the length  by creating reference variable 
	 int stringlength = s.length();
	 System.out.println(stringlength);
	System.out.println("==============");
	 
	//toUppercase and toLowercase
	System.out.println(s.toUpperCase());
	
	//useing reference variable
       String S1 = s.toUpperCase();
       System.out.println(S1);
	 
   System.out.println(S1.toLowerCase());
   System.out.println("==============");
   
   //equals method use
   String x="pune";
   String y="pune";
   String p=new String("pune");
   String q=new String("pune");
   String r=new String("Pune");
   System.out.println(x.equals(y));
   System.out.println(p.equals(q));
   System.out.println(x.equals(p));
   System.out.println(p.equals(r));
   System.out.println(p.equalsIgnoreCase(r));
   System.out.println("==============");
   
   //use of contains
   System.out.println(s.contains("war"));
   
   //using reference variable
   boolean S2 = s.contains("san");
   System.out.println(S2);
   System.out.println("==============");
   
   //IsEmpty
   String a1="Pune";    
   String a2="";    
   String a3=" "; 
   
   System.out.println("a1 result is "+a1.isEmpty());    
   System.out.println("a2 result is "+a2.isEmpty());    
   System.out.println("a3 result is "+a3.isEmpty()); 
 
   //IsBlank
   System.out.println("a1 result is "+a1.isBlank());    
   System.out.println("a2 result is "+a2.isBlank());    
   System.out.println("a3 result is "+a3.isBlank()); 
   
   System.out.println("==============");
 
   //use of charAt
   System.out.println(s.charAt(2));
   //System.out.println(s.charAt(-2));
   
   //using reference variable
   char S3 = s.charAt(9);
   System.out.println(S3);
   System.out.println("==============");
   
   //endswith(),startswith()
   System.out.println(s.startsWith("san"));
   System.out.println(s.endsWith("war"));
   System.out.println(s.endsWith("sangmeshwar"));
   System.out.println(s.startsWith("ngm", 2));
   System.out.println("==============");
// substring() method use-->   
   String d="I am in Pune";
   System.out.println(d.substring(8));
   System.out.println(d.substring(2));
   System.out.println(d.substring(5, 7));
   
   System.out.println("==============");
// concat() methos use--> 
   String e1="Good ";   
   String e2="Morning"; 
   System.out.println(e1.concat(e2));
   System.out.println(e1.concat("night"));
   System.out.println("==============");
   
// indexOf()--> 
   
   
   String m="Hello Hello"; 
   System.out.println(m.indexOf("l"));
   System.out.println(m.lastIndexOf("l"));
   System.out.println(m.indexOf("o",5));
   System.out.println("==============");
   
 //replace() method use--> 
   String n="UnHappy"; 
   System.out.println(n.replace("Un", "very "));
   System.out.println(n.replace("Un", ""));
   
   
   
 }
}
