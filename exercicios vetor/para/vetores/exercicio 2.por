programa
{
	
	funcao inicio()
	{
	real temperatura [3],temp,nota,total=0.0,media=0.0
	cadeia resposta="sim"
    
          enquanto(resposta !="nao")
          {
          	
          
		para (inteiro i=0; i<3; i++)
		{
			escreva("Informe a temperatura: ")
			leia(temp)
			temperatura[i] = temp
			
		}
		para (inteiro i=0; i<3; i++) 
		{
			total = total + temperatura[i] 
		}
		media = total /3
		total=0.0
		escreva("A média da temperatura é : ",media," °Graus ")
		
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
 * @POSICAO-CURSOR = 561; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */