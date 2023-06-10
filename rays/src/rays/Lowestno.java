package rays;

public class Lowestno {
public static void main(String[] args) {
   int a[] = {12,1,11,7,6,5,0,1};
   //int i=0;
int min =a[0];
   for (int i=1;i<8;i++) {
	   if (a[i]<min)
	   min=a[i];
   }System.out.println(min);

}
}

