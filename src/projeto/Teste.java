package projeto;

import lombok.Getter;
import lombok.Setter;

public class Teste {
	
	// getter cria um metodo getter a
	@Setter @Getter int a;
	
	public static void main(String[] args) {
		Teste t = new Teste();
		t.setA(2);
		System.out.println(t.getA());
	}
	
}
