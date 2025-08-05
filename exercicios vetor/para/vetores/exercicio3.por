programa
{
	
	funcao inicio()
	{
	inteiro vasco[3],inter[3],torneio[3],soma=0,numero,numeros,num


	
	para(inteiro i=0; i<3; i++)
	{
		escreva("Digite o numero de gols do vasco: ")
		leia(numero)
		vasco [i] = numero
		soma += vasco [i]
	}
	para(inteiro i=0; i<3; i++)
	{
      escreva("Digite  o numero de gols do inter: ")
      leia(numeros)
      inter [i] = numeros
      soma+= inter [i]
	}
	para (inteiro i=0; i<3; i++)
	{
		escreva("A soma dos numeros ficou de : ",soma,"\n")
	}
}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 497; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */