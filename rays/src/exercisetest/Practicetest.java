package exercisetest;

public class Practicetest {
	public static void main(String[] args) {
 int[] note= {2000,500,200,100,50,20,10,5,2,1};
 int amount= 3451;
 int count = 0;
  for(int i=0;i<note.length;i++) {
	  count=amount/note[i];
	  amount-=count*note[i];
	  System.out.println(note[i]+"="+count);
	  
  }
}
}