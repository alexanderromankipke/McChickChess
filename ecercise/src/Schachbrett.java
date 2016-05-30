
public class Schachbrett {

	
	
	
	public static void befülleBrett(char[][]a){
		
		char[][] erg=new char[a.length][a[0].length];
		
		for (int i=0; i<a.length; i++){
			for(int j=0; j<a[0].length;j++){
				a[i][j]='x';
			}
		}
		
	
	}
	
	public static char[][] gebeAus(char[][]a){
		
		char[][] erg=a;
		for (int i=0; i<a.length; i++){
			for(int j=0; j<a[0].length;j++){
			
				
				System.out.print(" "+erg[i][j]+" ");
			}
			System.out.println();
			}
		return erg;
	}
	
	public static void setzeFigur(char[][]a, int x,int y){
		char[][] erg=a;
		
		for (int i=0; i<a.length;i++){
			
			
				a[x][i]='o';
				a[i][y]='o';
			
		}
		
		
	}
	public static void main(String[] args) {
		
		char[][] schachbrett=new char[8][8];
		
		befülleBrett(schachbrett);
		gebeAus(schachbrett);
		setzeFigur(schachbrett,3,3);
		System.out.println();
		gebeAus(schachbrett);
		
		
	}

}
