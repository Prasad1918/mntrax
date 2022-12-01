package prasad.in.com.myntrax.in;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S="Prasad";
		String h="PP";
		String k=S.replace('a','L');
System.out.println(k);

String name="Prasad Relangi";
//Prasad RelHKgi---out put

  int lenth=name.length();
  System.out.println("Lenth"+":"+lenth);
  
  char []arr=name.toCharArray();
  //System.out.println("arr"+":"+arr);
  
  for(int i=0;i<lenth;i++) {
	  //System.out.println("I valu"+":"+i);
	  //System.out.println("Print each valu in arry"+":"+arr[i]);
	  
	  if(arr[i]=='i') {
	  
	  int count=arr[i];
	  System.out.println("P count"+":"+count);
	  continue;
	  
  }
	  else {System.out.println("name");}
	 
	}
	}}


