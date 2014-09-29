package alphasyshoteis;

import java.util.HashSet;

public class Suite extends Quarto {

	private HashSet<String> frigobar;
	private int arCondicionado;

	void encherFrigobar(){
		frigobar.add("COCA");
		frigobar.add("FANTA");
		frigobar.add("AGUA");
		frigobar.add("CHOCOLATES");
		
	}
	
	void esfriar(int temperatura){
		arCondicionado = temperatura;
	}
}
