package ProgramaPrincipal;

/*
Autores:
Caio Victor dos Santos - 1904013
Cristhian Ocampo Quinteiro – 1902919
Mirelly Simões Barbosa - 1903911
Thiago Souza do Amparo – 1904089
*/

public class FuncoesRecursivas {
	
	//Função recursão fatorial
	public int RecursaoFatorial(int numero) {
		
		if(numero == 0) {			
			return 1;			
		}else {			
			return numero * RecursaoFatorial(numero - 1);			
		}			
	}
	
	//Função soma linear
	public int SomaLinear(int[] lista, int tamanhoLista) {
		
		if(tamanhoLista == 1) {
			
			return lista[0];
			
		}else {
			
			return SomaLinear(lista, tamanhoLista - 1) + lista[tamanhoLista - 1];
			
		}
	}
	
	//Função reverte array
	public void reverseArray(int[] lista, int inicio, int fim) {
		
		if(inicio < fim) {
			int temp = lista[inicio];
			lista[inicio] = lista[fim];
			lista[fim] = temp;
			reverseArray(lista,inicio +1, fim - 1);
		}
	}
	
	//Função exibi lista em string
	public String ConverteListaString(int[] lista) {
		
		if(lista.length == 0) {
			
			return "[]";
			
		}else {
			
			String listaElementos = "[";
			
			for(int i = 0; i < lista.length; i++) {
				
				listaElementos += Integer.toString(lista[i]);
				
				if(i != lista.length - 1) {
					
					listaElementos += ", ";
					
				}				
			}
			
			listaElementos += "]";
			return listaElementos;
		}
	}
	
	//Função reverte array iterativamente
	public void iterativeReverseArray(int[] lista, int inicio, int fim) {
		
		while(inicio < fim) {
			int temp = lista[inicio];
			lista[inicio] = lista[fim];
			lista[fim] = temp;
			inicio = inicio + 1;
			fim = fim - 1;			
		}
	}
	
	//Função soma array utilizando recursão binaria
	public int SomaBinaria(int[] lista, int inicio, int tamanhoLista) {
		
		if(tamanhoLista == 1) {
			
			return lista[inicio];			
			
		}else {
			
			return SomaBinaria(lista, inicio, (tamanhoLista / 2)) + SomaBinaria(lista, (inicio + (tamanhoLista / 2)), (tamanhoLista / 2));
			
		}
	}
	
	//Função Fibonacci utilizando recursão binaria
	public int BinarioFibonacci(int numero) {
		
		if(numero < 2) {
			
			return numero;
			
		}else {
			
			return BinarioFibonacci(numero - 1) + BinarioFibonacci(numero - 2);
			
		}
	}
	
	//Função Fibonacci utilizando recursão linear
	public int[] LinearFibonacci(int indiceTermo) {
		
		int tupla[] = new int[2];
		
		if(indiceTermo < 2) {
			
			tupla[0] = indiceTermo;
			tupla[1] = 0;
			
			return tupla;

			
		}else {
			
			tupla = LinearFibonacci(indiceTermo - 1);	
			
		}
		
		int temp = tupla[0];
		tupla[0] += tupla[1];
		tupla[1] = temp;
		
		return tupla;

	}
}
