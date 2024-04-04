package com.xworkz.polymarphism.add;

public class CollegeRunner {

	
	public static void main(String[] args) throws Exception {
//Class<College> c=College.class;
//Object b=c.newInstance();
//	 Method declaredMethod = c.getDeclaredMethod("sports", new Class[] {String.class,int.class});
//	 declaredMethod.setAccessible(true);
//	 declaredMethod.invoke(b, "Ramakumar",10);
	int n=5;
		for(int i=1;i<n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			for(int l=1;l<i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++) {
				System.out.print("*");
			}
			for(int l=i;l<n;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
