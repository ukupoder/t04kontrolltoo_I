import java.io.*;
import java.util.*;
import java.net.*;

public class Kronoloogiline{
	String failiAsukoht;
	double keskmineKolmest=0;
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
	
	
}