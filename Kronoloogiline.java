import java.io.*;
import java.util.*;
import java.net.*;

public class Kronoloogiline{
	String failiAsukoht;
	double keskmineKolmest=0;
	double ridadeArv=0;
	public Kronoloogiline(String failiAsukoht){
		this.failiAsukoht = failiAsukoht;
	}
	public Kronoloogiline(int arv1, int arv2, int arv3){
		this.failiAsukoht = failiAsukoht;
	}
		
		BufferedReader kysiLugeja(){
		try{
			if(failiAsukoht.startsWith("http://")){
				return new BufferedReader(new InputStreamReader(
					new URL(failiAsukoht).openConnection().getInputStream()));
			} else {
				return new BufferedReader(new FileReader(failiAsukoht));
			}
		} catch (Exception ex){
			return null;
		}
	}
	
	
	public double ylesanne1(double arv1, double arv2, double arv3) throws IOException{

		try{
			arv1=arv1/2;
			arv3=arv3/2;
			keskmineKolmest=(arv1+arv2+arv3)/2;	
		} catch(Exception viga){
			System.out.println("error");
		}
		return keskmineKolmest;
	}

	public double ylesanne2(int tulbanr) throws IOException{
		
		BufferedReader lugeja=kysiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		int kogus=0;
		int ridu=0;
		double esimene=0;
		double viimane=0;
		double koik=0;
		while(rida!=null){
		String[] m=rida.split(" ");
			try{
				if (ridu==0){
					esimene=Double.parseDouble(m[tulbanr])/2;
					kogus++;
					ridu++;
				}else{
					koik = koik+(Double.parseDouble(m[tulbanr]));
					kogus++;
					ridu++;
					
				}
			viimane=Double.parseDouble(m[tulbanr])/2;
			} catch(Exception veaandmed){
				 System.out.println("Viga.");
			}
			rida=lugeja.readLine();
		}
		System.out.println("kogus "+kogus);
		System.out.println("ridu "+ridu);
		System.out.println("koik "+koik);
		System.out.println("esimene "+esimene);
		System.out.println("viimane "+viimane);
		double keskmine=((esimene+viimane+koik)/kogus);
		lugeja.close();
		return keskmine;
		
/*
		
		[ukupode@greeny t04kontrolltoo_I]$ java Proov
		kogus 7
		ridu 7
		koik 38.67
		esimene 0.89
		viimane 1.77
		Keskmine on : 5.904285714285714
*/
	}
	
	public double ylesanne3() throws IOException{
		
		BufferedReader lugeja=kysiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		int ridu=0;
		double koik=0;
		double esimene=0;
		double viimane=0;
		double keskmine=0;
		int kuupaev=0;
		while(rida!=null){
		String[] m=rida.split(" ");
		
			try{
				
				kuupaev=Integer.parseInt(m[0]);
				if (Integer.parseInt(m[2])==0){
					esimene=Double.parseDouble(m[1])/2;
				}else if(Integer.parseInt(m[2])==24){
					viimane=Double.parseDouble(m[1])/2;
				}else{
					koik = koik+(Double.parseDouble(m[1]));
				}
				
				ridu++;
				/*
				kuupaev=Integer.parseInt(m[0]);
				esimene=Double.parseDouble(m[1])/2;
				viimane=Double.parseDouble(m[5])/2;
				keskmine=(esimene+viimane+Double.parseDouble(m[2])+Double.parseDouble(m[3])+Double.parseDouble(m[4]))/ridu;
				*/
			} catch(Exception veaandmed){
				 System.out.println("Viga.");
			}
			
			
			rida=lugeja.readLine();
		}
		//System.out.println("ridu "+ridu);
		//System.out.println("koik "+koik);
		//System.out.println("esimene "+esimene);
		//System.out.println("viimane "+viimane);
		keskmine=((esimene+viimane+koik)/ridu);
		lugeja.close();	
		PrintWriter writer = new PrintWriter("valjund.txt", "UTF-8");
		writer.println("Kuupäeval "+kuupaev+ "oli keskmine temp : "+keskmine);
		writer.close();
		return keskmine;
		
	}
	

	
}
	
