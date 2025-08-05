programa
{
	
	funcao inicio()
	{
	real notas [3],nota,total=0.0,media=0.0
	cadeia resposta="sim"
    
          enquanto(resposta !="nao")
          {
          	
          
		para (inteiro i=0; i<3; i++)
		{
			escreva("Informe sua nota de prova: ")
			leia(nota)
			notas[i] = nota
			
		}
		para (inteiro i=0; i<3; i++) 
		{
			total = total + notas[i] 
		}
		media = total /3
		total=0.0
		escreva("A média final é : ",media)
		
		escreva("\nDeseja continua? Sim / não?","\n")
		leia(resposta)
          }
	   
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 521; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */