import java.io.*;
public class Proov{
	public static void main(String[] args) throws IOException{
		Kronoloogiline krono= new Kronoloogiline(1,1,1);
		System.out.println(krono.ylesanne1(10 , 10 , 10));
		System.out.println(krono.ylesanne1(0 , -10 , 0));
		System.out.println(krono.ylesanne1(7 , 122 , 5));
		System.out.println(krono.ylesanne1(14 , 0 , 1));
	}
}