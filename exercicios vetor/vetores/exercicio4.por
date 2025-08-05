programa
{
	
	funcao inicio()
	{
	inteiro a[10],numeros,negativo=0

	para (inteiro i=0; i<10; i++)
	{
		escreva("Informe um numero: ")
		leia(numeros)
		a[i] = numeros 
		se (a [i] < 0)
		negativo++
	}
		escreva("Total de numeros negativos são : ",negativo)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 263; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */