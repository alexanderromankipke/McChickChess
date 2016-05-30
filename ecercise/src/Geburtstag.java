
public class Geburtstag {
 String name;
 String nachname;
 int tag;
 int monat;
 int jahr;
 
	public Geburtstag(String n,String nn,int tag,int monat,int jahr){
		this.name=n;
		this.nachname=nn;
		this.jahr=jahr;
		this.monat=monat;
		this.tag=tag;
	}
	
	
	public static void main(String[] args) {
	
		String [] namen={"alex","tobias","tobias"};
		String [] nachname={"kipke","Flittner","lediger"};
		int[] tag={13, 19,21};
		int[] Monat={11, 10,06};
		int[] Jahr={92, 93,92};
		
		Geburtstag[][] bday= new Geburtstag[2][2];
		for (int i=0; i<bday.length;i++){
			for (int  j=0; j<bday.length;j++){
	 bday[i][j]=new Geburtstag(namen[i],nachname[i],tag[i],Monat[i],Jahr[i]);
		}
		}
		
		for (int i=0; i<bday.length;i++){
			for (int  j=0; j<bday.length;j++){
		System.out.println( bday[i][j]);
		
			}
			System.out.println();
		}
	}

}
