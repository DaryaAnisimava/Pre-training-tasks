package by.epam.part1.main;

import java.util.Random;

public class Multimatrix {
	//Перемножить матрицы
public static void main(String[] args) {
		
		int n =3;
		int m =4;
		int p = 4;
		int r =5;
		
		int a[][]= new int [n][m];
		int b[][]= new int [p][r];
		int c[][]= new int [n][r];
	

		Random rand = new Random();
		
		 
		for (int i =0; i<a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(10);
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	System.out.println();
	
	
	for (int i =0; i<b.length; i++) {
		for (int j = 0; j < b[i].length; j++) {
			b[i][j] = rand.nextInt(10);
			System.out.print(b[i][j] + "\t");
		}
		System.out.println();
	}

System.out.println();



if (a[0].length == b.length) {
for (int i = 0; i < a.length; i++) {
	for (int k = 0; k < b[0].length; k++){ 
		for (i = 0; i < a.length; i++){
		int t = 0;
      for (int j = 0; j < b.length; j++) {
    	  t += a[ i ][j]*b[j][k];
    	     c[ i ][k] = t;
      }
      }
		
    }
 }
}else {
	System.out.println("Такие матрицы нельзя перемножать");
}

for (int i =0; i<c.length; i++) {
	for (int j = 0; j < c[i].length; j++) {
		System.out.print(c[i][j] + "\t");
	}
	System.out.println();
}

}
}
