package _02_String_Manipulation;

public class Testing {

	public static void main(String[] args) {
		
		//notReplace("is-is");
		sameEnds("javaXYZjava");
	}
	
	public static String sameEnds(String string) {
		  String same = "";
		  int l;
		  if(string.length()%2 == 1){
		    l = (string.length()-1)/2;
		  }
		  else{
		    l = string.length()/2;
		  }
		  System.out.println("l = " + l);
		  int diff =0;
		  for(int i = 0; i<l; i++){
			  System.out.println("#" + i);
		    String s = string.substring(0,1);
		    System.out.println("s = " + s);
		    for(int j = l; j<string.length()-1; j++){
		      String t = string.substring(j, j+1);
		      System.out.println("t = " + t);
		      if(s.equals(t)){
		        diff = string.length()-j;
		      }
		      String a = string.substring(j, j+diff);
		      System.out.println("a = " + a);
//		      String b = string.substring(string.length()-diff, string.length());
//		      if(a.equals(b)){
//		        same = a;
		      }
		      
		    }
		    
//		  }
		  return same;
		}

	
//	//NOTREPLACE
//	public static String notReplace(String str) {
//		  String replace = str;
//		  
//		  for(int i = 0; i<str.length()-2; i++){
//		String is = str.substring(i, i+2);
//		    char three = str.charAt(i+2);
//		    Boolean c = Character.isLetter(three);
//		    if(i !=0){
//		    char before = str.charAt(i-1);
//		    boolean b = Character.isLetter(before);
//		      if(is.equals("is") && c != true && b != true){
//		      replace = replace.substring(0, i + 2) + " not" + replace.substring(i+2, str.length());
//		     }}
//		          if(is.equals("is") && c != true && i == 0){
//		      replace = replace.substring(0, i + 2) + " not" + replace.substring(i+2, str.length());
//		    }
//		   
//		    if(i==str.length()-3){
//		       char first = str.charAt(str.length()-3);
//			boolean a = Character.isLetter(first);
//				    	is = str.substring(str.length()-2, str.length());
//		      if(is.equals("is") && a != true){
//		        replace = replace + " not";
//		      }
//		    }
//		    
//		  }
//	
//		  return replace;
//		  
//		}
	

}
