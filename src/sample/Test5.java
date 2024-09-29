package sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Test5 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in); 
			System.out.print("Please enter the number of numbers you want to enter: ");   
			Integer[] a = new Integer [sc.nextInt()];      
   
			for (int i = 0; i < a.length; i++)   
			{  
				a[i] = sc.nextInt();  
			}  
			System.out.println(Arrays.toString(a));
			//Integer a[] ={3,5,8};
			Arrays.sort(a,Collections.reverseOrder());
			System.out.println(Arrays.toString(a));
			int len=a[0];
			String mat[][] =new String[len][len];
			
			for(int k=0;k<a.length;k++)
			{

				for(int i=0;i<a[k];i++)
				{
				if(i==0 || i==(a[k]-1))
				{
					for(int j=0;j<a[k];j++)
					{
						mat[i][j] ="#";
						
						
					}
					
				}
				else
				{
					for(int j=0;j<a[k];j++)
					{
						if(j==0 || j==a[k]-1)
						{
							mat[i][j] ="#";
						}
						
					}
				}
				
			}
				
			
			}
			StringBuilder sb1 =new StringBuilder();
			for(int l=0;l<mat.length;l++)
			{
				for(int n=0;n<mat[0].length;n++)
				{
					if(mat[l][n]==null)
					{
						sb1.append(" ");
					}
					else
						sb1.append("#");
					
				}
				 sb1.append("\n");
			}
			 System.out.println(sb1);
			 
		}
}
