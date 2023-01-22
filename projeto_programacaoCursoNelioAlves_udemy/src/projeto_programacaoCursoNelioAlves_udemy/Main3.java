package projeto_programacaoCursoNelioAlves_udemy;

import java.util.Locale;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//String x;
//		x = sc.next();		
		//int x;
		
		
		//char x;
		//double x;
		
		//x = sc.nextDouble();
		//x = sc.next().charAt(0);
		//x = sc.nextInt();

//		String x;
//		int y;
//		double z;
//		
//		x = sc.next();
//		y = sc.nextInt();
//		z = sc.nextDouble();
//		
//		System.out.println("Dados digitados:");
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//		
		
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("Dados digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
				
		
		
		//System.out.println("Voce digitou: " + x);
		
		
		
		sc.close();
	}

}
