package lab1;

public class PktMat { 

	private int m; //deklaracja prywatnej zmiennej
    public PktMat(){ //wartosc konstruktora domyslnego
    	m=6;
    }
public PktMat(int a){ //konstruktor z parametrem
	m=a;
}
	
public int getMasa(){ //akcesor
	return m;
	}
public int setMasa(int b){ //zmiana masy punktu
	m=b;
	return m;
	}
public int MBezwl(){ //moment bezwladnosci dla punktu rowny 0
	int i=0;
	return i;
	}
public int Steiner(int d){ //moment bezwladnosci z Tw. Steinera. "d" - odleglosc od osi
	int id=MBezwl()+m*d*d;
	return id;
	}
}