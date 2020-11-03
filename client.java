import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client {


		public static void main(String[] args) {
		
		int port = 5555;
		boolean running = true;
		String jawab;
		Scanner scan = new Scanner(System.in);
		
		try {
			//membuat koneksi ke server dengan socket
        	
			String pilih = null;
			Scanner sc = new Scanner(System.in);
			Socket socket = new Socket("127.0.0.1", port);
			DataInputStream dis = new DataInputStream(socket.getInputStream()); 
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            
            //new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            
            while(running){
 	        	

	        	System.out.print("\t\t\t====Layanan Server====");
	            System.out.print("\n\nMasukkan angka dengan ketentuan berikut :");
				System.out.print("\n(1 n n n)   =  Penerjamahan Romawi");
				System.out.print("\n(2 n n n)   =  Penerjamahan Yunani");
				System.out.print("\n(3 n n n)   =  Volume Balok (Panjang, Lebar, Tinggi)");
				System.out.print("\n(4 n n n)   =  Luas Balok (Panjang, Lebar, Tinggi)");
				System.out.print("\n(5 n n n)   =  Volume Kubus (Sisi)");
				System.out.print("\n(6 n n n)   =  Luas Kubus (Sisi)");
	
	            System.out.print("\n(quit)  =  Keluar");
	            System.out.print("\n\nInput : ");
	            
	            String inp = sc.nextLine(); 
	  
	            if (inp.equals("quit")) 
	                break; 
	  
	            // send the equation to server 
	            dos.writeUTF(inp); 
	  
	            // wait till request is processed and sent back to client 
	            String ans = dis.readUTF(); 
	            System.out.println("Hasil = " + ans + "\n");
	            
	            System.out.println("Apakah anda ingin lanjut?");
	            System.out.print("Jawab [y/n] : ");

	            jawab = scan.nextLine();

	            // cek jawabnnya, kalau ya maka berhenti mengulang
	            if( jawab.equalsIgnoreCase("n") ){
	                running = false;
	            }
	       }
            //dis.close();
            //dos.close();
       
}

		catch (Exception e) {
            System.out.println("Anda Keluar dari Aplikasi");
		}
	}

}
