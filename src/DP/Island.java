package DP;

import java.util.ArrayList;
import java.util.List;

public class Island {
	public static List<Integer> riverSizes(int[][] matrix) {
			List<Integer> list =new ArrayList<>();
			int c=0;
			int k=0;
	    for(int i=0;i<matrix.length;i++)
			{
				for(int j=0;j<matrix[0].length;j++)
				{
					if(matrix[i][j]==1)
					{
						c=0;
						k++;
						System.out.println(get(matrix,list,i,j));
						
					}
				}
			}
	    return list;
	  }

	public static int get(int[][] matrix, List<Integer> list, int i, int j) {
		int n = matrix.length;
		int m = matrix[0].length;
		if (i >= n || i < 0 || j >= m || j < 0 || matrix[i][j] != 1) {
			return 0;
		}
		matrix[i][j] = 0;
		int area = 1;
		area+=get(matrix, list, i + 1, j);
		area+=get(matrix, list, i - 1, j);
		area+=get(matrix, list, i, j + 1);
		area+=get(matrix, list, i, j - 1);
		//System.out.println("jii "+c);
		return area;
	}
	
	public static void main(String[] args) {
		int a[][]= {
		           {1, 0, 0, 1, 0},
		           {1, 0, 1, 0, 0},
		           {0, 0, 1, 0, 1},
		           {1, 0, 1, 0, 1},
		           {1, 0, 1, 1, 0}
		};
		System.out.println(riverSizes(a));
		
	}

}
