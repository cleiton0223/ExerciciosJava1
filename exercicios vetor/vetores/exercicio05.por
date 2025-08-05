programa
{
	
	funcao inicio()
	{
	inteiro a[5]
	real notas=0.0,media,soma=0.0

	para (inteiro i=0; i<5; i++)
	{
		escreva("Informe a primeira nota: ")
		leia(notas)
		a[i]=notas
		soma += notas

	
		
	}
	media = soma /5
		escreva("A média final do aluno é: ",media)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 271; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */