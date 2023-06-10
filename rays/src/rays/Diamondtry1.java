package rays;

import java.net.SocketTimeoutException;

public class Diamondtry1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print("  ");}
				for(int k=1;k<=i;k++) {
					System.out.print(" *  ");
				}System.out.println();
			}int n1=1;
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("  ");}
					for(int k=4;k>=i;k--) {
						System.out.print("  * ");
					}System.out.println();
				}
		}

	}
