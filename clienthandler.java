import java.io.*;
import java.net.*;
import java.util.*;

class clientHandler extends Thread {
	final DataInputStream dis; 
    final DataOutputStream dos; 
    final Socket socket;


    public clientHandler(Socket socket, DataInputStream dis, DataOutputStream dos){
    	this.socket = socket;
    	this.dis = dis;
    	this.dos = dos;
    }

    public void run(){
		int hasil = 1;
    	while(true){
    		try {
	            
    			 // wait for input 
	            String input = dis.readUTF(); 
	  
	            if(input.equals("quit")) 
	                break; 
	  
	            // Use StringTokenizer to break the equation into operand and 
	            // operation 
	            StringTokenizer st = new StringTokenizer(input); 
	  
	            int pilihan = Integer.parseInt(st.nextToken()); 
				int bilangan = Integer.parseInt(st.nextToken()); 
				int bilangan1 = Integer.parseInt(st. nextToken());
				int bilangan2 = Integer.parseInt(st. nextToken());
	  
				// perform the required operation. 
	            
				if(pilihan == 1) {
	            	System.out.println("\nOperasi yang dijalankan : Romawi");
	            	System.out.println("\nNilai input = " +bilangan);
					System.out.println("Sedang dalam prosess ...");
					//TimeUnit.SECONDS.sleep(2);

					String strRomawi = "";
					String result="";
					
					for (int i = 0; i <= 1; i++) {       		//perulangan untuk romawi          
						do{                     	
							if (bilangan >= 900) {
								bilangan = bilangan - 900;
								strRomawi = strRomawi + "CM";
							} else if (bilangan >= 500) {
								bilangan = bilangan - 500;
								strRomawi = strRomawi + "D";
							} else if (bilangan >= 400) {
								bilangan = bilangan - 400;
								strRomawi = strRomawi + "CD";
							} else if (bilangan >= 100) {
								bilangan = bilangan - 100;
								strRomawi = strRomawi + "C";
							} else if (bilangan >= 90) {
								strRomawi = strRomawi + "XC";
								bilangan = bilangan - 90;
							} else if (bilangan >= 50) {
								bilangan = bilangan - 50;
								strRomawi = strRomawi + "L";
							} else if (bilangan >= 40) {
								bilangan = bilangan - 40;
								strRomawi = strRomawi + "XL";
							} else if (bilangan >= 10) {
								bilangan = bilangan - 10;
								strRomawi = strRomawi + "X";
							} else if (bilangan >= 9) {
								bilangan = bilangan - 9;
								strRomawi = strRomawi + "IX";
							} else if (bilangan >= 5) {
								bilangan = bilangan - 5;
								strRomawi = strRomawi + "V";
							} else if (bilangan >= 4) {
								bilangan = bilangan - 4;
								strRomawi = strRomawi + "IV";
							} else if (bilangan >= 1) {
								bilangan = bilangan - 1;
								strRomawi = strRomawi + "I";
							}
						} while (bilangan > 0);
		
						if (i == 0){
							System.out.print("Angka Romawi\t: " + strRomawi);
							result=strRomawi;
							
						}
					}

		            System.out.println("\nMengirim hasil..."); 
		            
					// send the result back to the client. 

					dos.writeUTF(result);
				}
				else if(pilihan == 2) {
	            	System.out.println("\nOperasi yang dijalankan : Yunani");
	            	System.out.println("\nNilai input = " +bilangan);
					System.out.println("Sedang dalam prosess ...");
					//TimeUnit.SECONDS.sleep(2);

					String strYunani = "";
					String result1="";
					
					for (int i = 0; i <= 1; i++) {       		//perulangan untuk romawi          
						do{                     	
							if (bilangan >= 800) {
								bilangan = bilangan - 800;
								strYunani = strYunani + " Ω ω = Omega " ;
							} else if (bilangan >= 700) {
								bilangan = bilangan - 700;
								strYunani = strYunani + " Ψ ψ = Psi";
							} else if (bilangan >= 600) {
								bilangan = bilangan - 600;
								strYunani = strYunani + " Χ χ = Kihi";
							} else if (bilangan >= 500) {
								bilangan = bilangan - 500;
								strYunani = strYunani + " Φ φ = Fi";
							} else if (bilangan >= 400) {
								strYunani = strYunani + " Υ υ = Upsilon";
								bilangan = bilangan - 400;
							} else if (bilangan >= 300) {
								bilangan = bilangan - 300;
								strYunani = strYunani + " Τ τ = Tau";
							} else if (bilangan >= 200) {
								bilangan = bilangan - 200;
								strYunani = strYunani + " Σ σ = Zigma";
							} else if (bilangan >= 100) {
								bilangan = bilangan - 100;
								strYunani = strYunani + " Ρ ρ = Ro" ;
							} else if (bilangan >= 80) {
								bilangan = bilangan - 80;
								strYunani = strYunani + " Π π = Pai";
							} else if (bilangan >= 70) {
								bilangan = bilangan - 70;
								strYunani = strYunani + " Ο ο = Omrikon";
							}else if (bilangan >= 60) {
								bilangan = bilangan - 60;
								strYunani = strYunani + " Ξ ξ = Xi";
							}else if (bilangan >= 50) {
								bilangan = bilangan - 50;
								strYunani = strYunani + " Ν ν = Nu";
							}else if (bilangan >= 40) {
								bilangan = bilangan - 40;
								strYunani = strYunani + " Μ μ = Mu";
							}else if (bilangan >= 30) {
								bilangan = bilangan - 30;
								strYunani = strYunani + " Λ λ = Lamda";
							}else if (bilangan >= 20) {
								bilangan = bilangan - 20;
								strYunani = strYunani + " Κ κ = Kapa";
							}else if (bilangan >= 10) {
								bilangan = bilangan - 10;
								strYunani = strYunani + " Ι ι = Iota";
							}else if (bilangan >= 9) {
								bilangan = bilangan - 9;
								strYunani = strYunani + " Θ θ = Teta";
							}else if (bilangan >= 8) {
								bilangan = bilangan - 8;
								strYunani = strYunani + " Η η = Eta";
							}else if (bilangan >= 7) {
								bilangan = bilangan - 7;
								strYunani = strYunani + " Ζ ζ = Zeta";
							}else if (bilangan >= 5) {
								bilangan = bilangan - 5;
								strYunani = strYunani + " Ε ε = Elipson";
							}else if (bilangan >= 4) {
								bilangan = bilangan - 4;
								strYunani = strYunani + " Δ δ = Delta";
							}else if (bilangan >= 3) {
								bilangan = bilangan - 3;
								strYunani = strYunani + " Γ γ = Gamma";
							}else if (bilangan >= 2) {
								bilangan = bilangan - 2;
								strYunani = strYunani + " Β β = Betta";
							}else if (bilangan >= 1) {
								bilangan = bilangan - 1;
								strYunani = strYunani + " Α α = Alfa";
							}
						} while (bilangan > 0);
		
						if (i == 0){
							System.out.print("Angka Romawi\t: " + strYunani);
							result1=strYunani;
							
						}
					}

		            System.out.println("\nMengirim hasil..."); 
		            
					// send the result back to the client. 

					dos.writeUTF(result1);
				}
				else if(pilihan == 3) {
	            	System.out.println("Operasi yang dijalankan : Volume Balok");
	            	System.out.println("Nilai input Panjang" +bilangan+ " Nilai input Lebar" +bilangan1 + " Nilai input Tinggi"+ bilangan2);
		            //System.out.println("Proses = " +bilangan+ "x" +bilangan);
					
					//Rumus S3
		            hasil = bilangan*bilangan1*bilangan2;	
		            
		            System.out.println("Mengirim hasil..."); 
		            
		            // send the result back to the client. 
		            dos.writeUTF(Integer.toString(hasil)); 
		            
		            hasil = 1;
				}
				else if(pilihan == 4) {
	            	System.out.println("Operasi yang dijalankan : Luas Balok");
	            	System.out.println("\nNilai input Panjang " +bilangan+ "\nNilai input Lebar " +bilangan1 + "\nNilai input Tinggi "+ bilangan2);
		            //System.out.println("Proses = " +bilangan+ "x" +bilangan);

					//Luas Balok =2*((p*l)+(p*t)+(l*t));

		            hasil = 2*((bilangan*bilangan1)+(bilangan*bilangan2)+(bilangan1*bilangan2));	
					
					
		            System.out.println("Mengirim hasil..."); 
		            
		            // send the result back to the client. 
		            dos.writeUTF(Integer.toString(hasil)); 
		            
		            hasil = 1;
				}
				else if(pilihan == 5) {
	            	System.out.println("Operasi yang dijalankan : Volume Kubus");
	            	System.out.println("\nNilai input Sisi " +bilangan);
		            //System.out.println("Proses = " +bilangan+ "x" +bilangan);

					hasil = bilangan*bilangan*bilangan;
					
		            System.out.println("Mengirim hasil..."); 
		            
		            // send the result back to the client. 
		            dos.writeUTF(Integer.toString(hasil)); 
		            
		            hasil = 1;
				}
				else if(pilihan == 6) {
	            	System.out.println("Operasi yang dijalankan : Luas Kubus");
	            	System.out.println("\nNilai input Sisi " +bilangan);
		            //System.out.println("Proses = " +bilangan+ "x" +bilangan);

					hasil = 6*bilangan*bilangan;
					
		            System.out.println("Mengirim hasil..."); 
		            
		            // send the result back to the client. 
		            dos.writeUTF(Integer.toString(hasil)); 
		            
		            hasil = 1;
				}
			} 
			
			catch(Exception e){
    			System.out.print("Klien : "+this.socket+" terputus");
    			break;
    		}
		
    	}
    }

}
