package JUnitTestes;

/*
Autores:
Caio Victor dos Santos - 1904013
Cristhian Ocampo Quinteiro – 1902919
Mirelly Simões Barbosa - 1903911
Thiago Souza do Amparo – 1904089
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ProgramaPrincipal.FuncoesRecursivas;

class FuncoesRecursivasTest {

	@Test
	void testFuncaoRecursicaFatorial() {
		
		//Invoca a classe FuncoesRecursivas para termos acesso as funções recursivas
		FuncoesRecursivas funcoes = new FuncoesRecursivas();
		
		//Testa se o fatorial de 3 é 6
		assertEquals(6, funcoes.RecursaoFatorial(3), "Deve retornar 6");		
		
		//Testa se o fatorial de 5 é 120
		assertEquals(120, funcoes.RecursaoFatorial(5), "Deve retornar 120");
		
		//Testa se o fatorial de 7 é 5040
		assertEquals(5040, funcoes.RecursaoFatorial(7), "Deve retornar 5040");
		
		//Testa se quando o numero 0 for informado retornara o numero 1
		assertEquals(1, funcoes.RecursaoFatorial(0), "Deve retornar 1");
	}
	
	@Test
	void testFuncaoRecursivaSomaLinear() {		

		//Invoca a classe FuncoesRecursivas para termos acesso as funções recursivas
		FuncoesRecursivas funcoes = new FuncoesRecursivas();
		
		//Listas para testar a função SomaLinear
		int lista1[] = {10, 20, 30, 100, 120, 450, 570, 600};
		int lista2[] = {120, 210, 330, 1040, 150, 500, 870, 900};
		
		//Testa se a soma da lista1 é 1900, utilizando a função SomaLinear
		assertEquals(1900, funcoes.SomaLinear(lista1, lista1.length), "Deve retornar 1900");
		
		//Testa se a soma da lista2 é 4120, utilizando a função SomaLinear
		assertEquals(4120, funcoes.SomaLinear(lista2, lista2.length), "Deve retornar 4120");		
	}
	
	@Test
	void testFuncaoRecursivaArrayReverso() {		

		//Invoca a classe FuncoesRecursivas para termos acesso as funções recursivas
		FuncoesRecursivas funcoes = new FuncoesRecursivas();
		
		//Listas para testar a função ReverseArray
		int lista1[] = {10, 20, 30, 100, 120, 450, 570, 600};
		int lista2[] = {120, 210, 330, 1040, 150, 500, 870, 900};
		
		//Invoca a função ReverseArray e passa a lista1
		funcoes.reverseArray(lista1, 0, lista1.length - 1);
		
		//Cria uma variavel String para representar a lista1 e chama a função ConverteListaString que convertera a lista1 para uma sequencia de strings
		String inversoLista1 = funcoes.ConverteListaString(lista1);
		
		//Testa se a função ReverseArray inverteu a lista1
		assertEquals("[600, 570, 450, 120, 100, 30, 20, 10]", inversoLista1, "Deve retornar [600, 570, 450, 120, 100, 30, 20, 10]");
				
		//Invoca a função ReverseArray e passa a lista2
		funcoes.reverseArray(lista2, 0, lista2.length - 1);
		
		//Cria uma variavel String para representar a lista2 e chama a função ConverteListaString que convertera a lista2 para uma sequencia de strings
		String inversoLista2 = funcoes.ConverteListaString(lista2);
		
		//Testa se a função ReverseArray inverteu a lista2
		assertEquals("[900, 870, 500, 150, 1040, 330, 210, 120]", inversoLista2, "Deve retornar [900, 870, 500, 150, 1040, 330, 210, 120]");		
	}
	
	@Test
	void testFuncaoIterativaArrayReverso() {		

		//Invoca a classe FuncoesRecursivas para termos acesso as funções recursivas e iterativa
		FuncoesRecursivas funcoes = new FuncoesRecursivas();
		
		//Listas para testar a função iterativeReverseArray
		int lista1[] = {10, 20, 30, 100, 120, 450, 570, 600};
		int lista2[] = {120, 210, 330, 1040, 150, 500, 870, 900};
		
		//Invoca a função iterativeReverseArray e passa a lista1
		funcoes.iterativeReverseArray(lista1, 0, lista1.length - 1);
		
		//Testa se a função iterativeReverseArray inverteu a lista1
		assertEquals("[600, 570, 450, 120, 100, 30, 20, 10]", funcoes.ConverteListaString(lista1), "Deve retornar [600, 570, 450, 120, 100, 30, 20, 10]");
		
		//Invoca a função iterativeReverseArray e passa a lista2
		funcoes.iterativeReverseArray(lista2, 0, lista1.length - 1);
		
		//Testa se a função iterativeReverseArray inverteu a lista2
		assertEquals("[900, 870, 500, 150, 1040, 330, 210, 120]", funcoes.ConverteListaString(lista2), "Deve retornar [900, 870, 500, 150, 1040, 330, 210, 120]");		
	}
	
	@Test
	void testFuncaoSomaBinaria() {		

		//Invoca a classe FuncoesRecursivas para termos acesso as funções recursivas e iterativa
		FuncoesRecursivas funcoes = new FuncoesRecursivas();		
		
		//Listas para testar a função SomaBinaria
		int lista1[] = {10, 20, 30, 100, 120, 450, 570, 600};
		int lista2[] = {120, 210, 330, 1040, 150, 500, 870, 900};
		
		//Testa se a soma da lista1 é 1900, utilizando a função SomaBinaria
		assertEquals(1900, funcoes.SomaBinaria(lista1, 0, lista1.length), "Deve retornar 1900");		
		
		//Testa se a soma da lista2 é 4120, utilizando a função SomaBinaria
		assertEquals(4120, funcoes.SomaBinaria(lista2, 0, lista2.length), "Deve retornar 4120");		
	}
	
	@Test
	void testFuncaoBinarioFibonacci() {

		//Invoca a classe FuncoesRecursivas para termos acesso as funções recursivas e iterativa
		FuncoesRecursivas funcoes = new FuncoesRecursivas();		
		
		//Testa se o 2° termo é igual a 1
		assertEquals(1, funcoes.BinarioFibonacci(2), "Deve retornar 1");	
		
		//Testa se o 5° termo é igual a 5
		assertEquals(5, funcoes.BinarioFibonacci(5), "Deve retornar 5");		
		
		//Testa se o 7° termo é igual a 13
		assertEquals(13, funcoes.BinarioFibonacci(7), "Deve retornar 13");		
		
		//Testa se o 14° termo é igual a 377
		assertEquals(377, funcoes.BinarioFibonacci(14), "Deve retornar 377");
		
		//Testa se o 0° termo é igual a 0
		assertEquals(0, funcoes.BinarioFibonacci(0), "Deve retornar 0");		
		
		//Testa se o 1° termo é igual a 1
		assertEquals(1, funcoes.BinarioFibonacci(1), "Deve retornar 1");		
	}
	
	@Test
	void testFuncaoLinearFibonacci() {		

		//Invoca a classe FuncoesRecursivas para termos acesso as funções recursivas e iterativa
		FuncoesRecursivas funcoes = new FuncoesRecursivas();
		
		//Testa se o 2° termo é igual a 1 e o termo anterior igual a 1
		assertEquals("[1, 1]", funcoes.ConverteListaString(funcoes.LinearFibonacci(2)), "Deve retornar [1, 1]");
				
		//Testa se o 5° termo é igual a 5 e o termo anterior igual a 3
		assertEquals("[5, 3]", funcoes.ConverteListaString(funcoes.LinearFibonacci(5)), "Deve retornar [5, 3]");
				
		//Testa se o 7° termo é igual a 13 e o termo anterior igual a 8
		assertEquals("[13, 8]", funcoes.ConverteListaString(funcoes.LinearFibonacci(7)), "Deve retornar [13, 8]");
				
		//Testa se o 14° termo é igual a 377 e o termo anterior igual a 233
		assertEquals("[377, 233]", funcoes.ConverteListaString(funcoes.LinearFibonacci(14)), "Deve retornar [377, 233]");
				
		//Testa se o 1° termo é igual a 1 e o termo anterior igual a 0
		assertEquals("[1, 0]", funcoes.ConverteListaString(funcoes.LinearFibonacci(1)), "Deve retornar [1, 0]");
	}

}
