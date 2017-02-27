import java.io.*;
public class Proov{
	public static void main(String[] args) throws IOException{
		//Kronoloogiline krono1= new Kronoloogiline(1,1,1);
		//System.out.println(krono1.ylesanne1(10 , 10 , 10));
		//System.out.println(krono1.ylesanne1(0 , -10 , 0));
		//System.out.println(krono1.ylesanne1(7 , 122 , 5));
		//System.out.println(krono1.ylesanne1(14 , 0 , 1));
		Kronoloogiline krono2 = new Kronoloogiline("arvud.txt");
		System.out.println("Keskmine on : "+krono2.ylesanne2(1));
		
	}
}