class p9{
public static void main(String args[]){
/*-----------------------------
	A 
   A B
  A B C
 A B C D
A B C D E
-------------------------------*/
int alpha=65;
for(int i=1;i<=5;i++){
	
	for(int k=4;k>=i;k--){
	System.out.print(" ");
	}
		for(int j=alpha;j<(alpha+i);j++){
			System.out.print((char)j+" ");

		}
		
	System.out.println();
}
}
}