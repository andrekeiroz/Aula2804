import java.util.Scanner;

public class TestaValores {
	public static void main(String[] args) {
		Tabela tab = new Tabela();
		//tab.criar();
		new Insert().inTable();
		
		System.out.println(new Select().lista().toString());
		
	}
}
