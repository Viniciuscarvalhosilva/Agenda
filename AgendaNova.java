package agendaNova;
import java.util.Scanner;
public class AgendaNova {

	public static void main(String[] args) 
	{
		Scanner read =  new Scanner(System.in);
		int i,j,k;																//variaveis do tipo inteiro
		String dados[] = {"NOME","ENDERECO","CODIGO POSTAL","BAIRRO","TELEFONE"};// vetor unidirecional com 5 posiçoes com valores iniciados
		String agenda[][] = new String[10][5];									// matriz com 5 linhas e 5 colunas ,entrada pelo teclado
		
		for(i=0;i<10;i++)
		{
			for(k = 0 ; k < 5 ; k++)											//laço da matriz
			{
			System.out.printf("%s:  \n",dados[k]);								//exibe na tela as informacoes da string dados
			agenda[i][k] = read.nextLine();										//grava na linha 'i' os dados digitados de 'k'
			}	
				for(j=0;j<5;j++) {												//segundo laco da matriz
				}
											
				System.out.printf("\n");
				System.out.print("----------------------------------\n");			
		}
				
				for(i=0;i<10;i++)
				{
					for(j=0;j<5;j++)
					{
					System.out.printf("%s  ",agenda[i][j]);						//exibe na tela os valores digitados na matriz
					}			
		
				System.out.printf("\n");
			
				}
		}
}
