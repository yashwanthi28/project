package project82;

public class lower_triangular_matrix {
	    public static void main(String[] args) {    
	    int row , col;    
	        int a[][] = {       
	                        {1, 2, 3} ,  
	                        {8, 6, 4} ,   
	                        {4, 5, 6} ,   
	                    }; 
	          row = a.length;    
	          col = a[0].length;    
	            
	          if(row != col){    
	              System.out.println("Matrix should be a square matrix");    
	          }    
	          else {    
	              System.out.println("Lower triangular matrix: ");    
	              for(int i = 0; i < row; i++){    
	                  for(int j = 0; j < col; j++){    
	                    if(j > i)    
	                      System.out.print("0 ");    
	                    else    
	                      System.out.print(a[i][j] + " ");    
	                }    
	                System.out.println();    
	            }    
	        }    
	    }    
	}    

