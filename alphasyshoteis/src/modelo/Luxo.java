package modelo;

import java.util.HashSet;

public class Luxo extends Quarto {
	private HashSet<String> frigobar;
	
	void encherFrigobar(){
		frigobar.add("COCA");
		frigobar.add("FANTA");
		frigobar.add("AGUA");
		frigobar.add("CHOCOLATES");
		
	}
}
