
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Valores implements ValoresITF{
	List<Integer> lista = new ArrayList<Integer>();
	
	@Override
	public boolean ins(int v) {		
		if(lista.size() < 10){
			lista.add(v);
			return true;
		}
		return false;
	}

	public List<Integer> getLista() {
		return lista;
	}

	@Override
	public int del(int i) {
		if(lista.size() != 0){
			int a = lista.get(i);
			lista.remove(i);
			return a;
		}
		return -1;
	}

	@Override
	public int size() {
		return lista.size();
	}

	@Override
	public double mean() {
		int soma = 0;
		for(int i = 0; i < lista.size(); i++){
			soma += lista.get(i);
		}
		return (double)soma / (double)lista.size();
	}

	@Override
	public int greater() {
		if(lista.size() != 0){
			return Collections.max(lista);
		}
		return -1;
	}

	@Override
	public int lower() {
		if(lista.size() != 0){
			return Collections.min(lista);
		}
		return -1;
	}
	
}
