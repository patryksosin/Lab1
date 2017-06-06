package lab1;

public class Main {

	public static void main(String args[]){
		
		PktMat obiekt1 = new PktMat(); //tworzenie 1 obiektu z konstruktorem domyslnym
		obiekt1.setMasa(20);
		PktMat obiekt2 = new PktMat(8); //tworzenie 2 obiektu z konstruktorem z parametrem
		System.out.println("Punkt 1 - Masa: "+obiekt1.getMasa()+
				", Moment bezwladnosci: "+obiekt1.MBezwl()+
				", Moment wzgledem osi 'd': "+obiekt1.Steiner(7)+".");
		System.out.println("Punkt 2 - Masa: "+obiekt2.getMasa()+
				", Moment bezwladnosci: "+obiekt2.MBezwl()+
				", Moment wzgledem osi 'd': "+obiekt2.Steiner(7)+".");
		obiekt1.setMasa(30); //zmiana masy obiektu pierwszego
		System.out.println("Punkt 1 ze zmieniona masa: "+obiekt1.getMasa()+" "
				+ ", Moment bezwladnosci: "+ ""+obiekt1.MBezwl()+", "
				+ ", Moment wzgledem osi 'd': "+obiekt1.Steiner(7)+".");
		PktMat[] tablica = new PktMat[5];
		for (int i=0; i<5; i++){ //stworzenie elementow w tablicy
		PktMat pkt = new PktMat((i+1)*15);
		tablica[i]=pkt;
		}
		for(PktMat p : tablica){ //wypisanie elementow z tablicy
			System.out.println("Punkt o masie: "+p.getMasa()+" "
					+ ", Moment bezwladnosci: "+ ""+p.MBezwl()+", "
					+ ", Moment wzgledem osi 'd': "+p.Steiner(7)+".");
			}
		
	}
}
