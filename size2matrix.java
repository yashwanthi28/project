package project89;

public class size2matrix {
		public static void main(String[] args) {
	int[][]A= {{5,6},{7,8}};
	int i,j;
	int r=A.length;
	int c=A[0].length;
	for(i=0;i<r;i++) {
		for(j=i;j<c;j++) {
			int temp=A[i][j];
			A[i][j]=A[j][i];
			A[j][i]=temp;
		}
	}

	for( i=0;i<c;i++){
	      int top=0;
	      int bottom = c-1;
	      while(top<bottom){
	         int temp = A[top][i];
	         A[top][i]=A[bottom][i];
	         A[bottom][i] = temp;
	         top++;
	         bottom--;
	      }
	   }
	for(i=0;i<r;i++) {
		for(j=0;j<c;j++) {
			System.out.print(A[i][j]+" ");
		}
	System.out.println();
	}
		}
	}

