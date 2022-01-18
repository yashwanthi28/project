package project90;

public class size3matrix {
		public static void main(String[] args) {
	int[][]a= {{4,2,8},{3,1,4},{5,9,6}};
	for(int i=0;i<3;i++) {
		for(int j=i;j<3;j++) {
			int temp=a[i][j];
			a[i][j]=a[j][i];
			a[j][i]=temp;
		}
	}
	for(int i=0;i<3;i++) {
		int li=0,ri=2;
		while(li<ri) {
			int temp=a[i][li];
			a[i][li]=a[i][ri];
			a[i][ri]=temp;
			li++;
			ri--;
		}
	}
	for(int i=0;i<3;i++) {	
		for(int j=0;j<3;j++) {
	System.out.print(a[i][j]+" ");	
		}
		System.out.println();
	}
	}
		}

