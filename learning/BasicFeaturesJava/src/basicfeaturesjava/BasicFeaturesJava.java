/*
 * BasicFeaturesJava
 *
 * Versão 1.0
 *
 * 23/03/2017
 *
 * GNU Public license
 *
 * Início dos estudos de programação  em Java
 * Jaider Xavier Jr.
 *  
 * Histórico de alterações
 * 23/03/2017 - Alterado arquivo fonte com convenção de códigos Java
 * 23/03/2017 - Inseridas variáveis para melhor legibilidade no trecho de data
 * 23/03/2017 - Trabalhando com package, compilando e executando
 * 23/03/2017 - Inserida a variável gendia, para dar gênero ao dia da semana
 * 23/03/2017 - Melhorado aninhamento if/else - Jaider
 *
 */
 	
package basicfeaturesjava;

import java.util.Calendar;
//import java.util.*; //Date;

public class BasicFeaturesJava {
		/*Sequencia de exercícios trabalhando
		* com variaveis e comentários no código.
		*/
	public static void main(String[] args){
		
		//definição  da variável com valor a ser usado nas próximas repetições
	byte repet=10;
    
		//pequenos cálculos
		int um = 5%2; //usando percentual para extrair o mod
		int dois = um+um;
		int tres = 27/9;
		int quatro = 2+dois;
		int cinco = 15-um-dois-tres-quatro;
		int seis = tres*dois;
		int sete = ((((seis*cinco)/tres)-quatro)+um);
		int oito = (int)Math.pow(dois,tres);
		int nove = 3*tres;
		
		//exibindo calculos
		System.out.println("\n\n"+um+", "+dois+", "+tres+", "+quatro+", "+cinco+", "+seis+", "+sete+", "+oito+", "+nove);

		//-------------Trabalhando com data / classe Calendar
		final Calendar data2 = Calendar.getInstance();
		
		//Usando Método getTime
		System.out.println("\nData usando Metodo getTime na classe Calendar:");
		System.out.println(data2.getTime());
	
		
		//Formatando dias da semana:
		String nomedia ="";
		String gendia ="";
		int diasmn=data2.get(Calendar.DAY_OF_WEEK);
		
		switch(diasmn){
			case 1:
			nomedia="domingo";
			gendia="um";
			break;
			case 2:
			nomedia="segunda-Feira";
			gendia="uma";
			break;
			case 3:
			nomedia="terca-Feira";
			gendia="uma";
			break;
			case 4:
			nomedia="quarta-Feira";
			gendia="uma";
			break;
			case 5:
			nomedia="quinta-Feira";
			gendia="uma";
			break;
			case 6:
			nomedia="sexta-Feira";
			gendia="uma";
			break;
			case 7:
			nomedia="sabado";
			gendia="um";
			break;
			default: nomedia="Dia inválido";
					 gendia=" - ";
		}
		System.out.println("\nDia da semana formatado: "+nomedia);
		
		//Formatando meses:
		String mesnome="";

		int mes=data2.get(Calendar.MONTH);

		switch(++mes){
		case 1: mesnome="Janeiro";
		break;
		case 2:	mesnome="Fevereiro";
		break;
		case 3: mesnome="Março";
		break;
		case 4: mesnome="Abril";
		break;
		case 5: mesnome="Maio";
		break;
		case 6: mesnome="Junho";
		break;
		case 7: mesnome="Julho";
		break;
		case 8: mesnome="Agosto";
		break;
		case 9: mesnome="Setembro";
		break;
		case 10: mesnome="Outubro";
		break;
		case 11: mesnome="Novembro";
		break;
		case 12: mesnome="Dezembro";
		break;
		default: mesnome="Mês inválido";
		}
		//Exibindo dados formatados do calendário:
		
		String saudacao="";
		int dia = data2.get(Calendar.DAY_OF_MONTH);
		int horaint = data2.get(Calendar.HOUR_OF_DAY);
		int ano = data2.get(Calendar.YEAR);
		
		if (horaint > 5 && horaint < 12){	
		saudacao="Bom dia";
		}
		else if (horaint >= 12 && horaint < 18){
		saudacao="Boa tarde";
		}
		else {
		saudacao="Boa noite";
		}
		System.out.println("\nData completa formatada: ");
		System.out.println(saudacao+", estamos em "+gendia+" "+nomedia+", "+dia+" de "+mesnome+" de "+ano+".\n");

	//Testes usando OR no if
	boolean aberto = true;
	if (saudacao == "Bom dia" || saudacao == "Boa tarde"){
		System.out.println("é de dia");

	}
	else {
		System.out.println("É de noite");
		aberto=false;
	}

	//Teste usando negação
	if (!aberto){
	System.out.println ("Estabelecimento Fechado!");
	}

		
	//Teste contando números primos /*9223372036854775807L*/
	System.out.println("\nNúmeros primos com cálculo da diferença para o anterior:");
	boolean primo;
	long num=10, quociente=2, quocienteant=0, diferenca=0;
	while(quociente <= num){
		long divisor=2;
		primo=true;
		while(divisor < quociente) {
			if(quociente % divisor == 0){
			primo=false;
			break;
			}
			divisor++;
		}
		if (primo){
			diferenca=quociente-quocienteant;
			System.out.println(quociente+" - "+quocienteant+" = "+diferenca);
			quocienteant=quociente;			
		}
		quociente++;
	}
	//FIM PRIMOS
	
	
//TESTES COM INCREMENTO
int a=53, b=5, c=2;
System.out.println("\nA="+a+", B="+b+", C="+c+"\n\nApós incremento:");
b=b+a++;
c=c+(++a);	
System.out.print("A="+a+"\nB="+b+"\nC="+c);
	
	
//Usando o do-while e labeled loop
//Laço com alias para que o break pare no escopo anterior
teste:
do{
	c++;
	int w=2;
		if (c==60){
		break teste;
	}
	System.out.print(c+" ");
	++c;
} while (c<80);
System.out.print(c+" ");//60


//DIVISÃO POR ZERO E POR 0,0:

//COMPILA, MAS DA ERRO DE ARITHMETIC EXCEPTION DIVISAO POR ZERO NA EXECUÇÃO
//System.out.println(2/0);	
//Apos o erro na execução, nada mais em diante é executado. Linha acima comentada em razao disso.

//COMPILA, EXECUTA, MAS DA "INFINITY" COMO RESULTADO
//System.out.println("\n"+2/0.0);	
	

	
//exercícios de fixação

	//imprimir números de 150 a 300
	System.out.println("\n\nExibe múltiplos de 20, do 100 ao 500");
	for (int i=100; i<500; i++){
		if (i % 20 == 0){
		System.out.print(i+" ");
		}
	}
	
	
	
	System.out.println("\n\nExibe a soma de um até "+repet+" (Fibonacci)\n");  //imprime a soma de um até mil (Fibonacci)

	int somai=0;
	for (int i=1; i<=repet; i++){
		somai=somai+i;
		System.out.print(somai+" ");
	}

	
		
	System.out.println("\n\nExibe os múltiplos de 3 até 60\n");  //imprime múltiplos de 3 até 100

	for (int i=1; i<=60; i++){
		if(i % 3 == 0){
			System.out.print(i+" ");
		}
	}
	

	System.out.println("\n\nExibe o fatorial de "+repet+":\n");	//exibe os fatoriais com algoritmo enxuto
		long f=1;
		String m="";
		for (int i=repet; i>1; i--){
			f *=i;
			m +=i+" x ";
		}
		System.out.println(m+"1 = "+f);


System.out.println("\nExibe o fatorial de todos os números abaixo do escolhido\n"); 	
	for (int j=repet; j >=0; j--){
		long fat=1;
		String mult="("+j+"!): ";
		if (j == 1 ){
			mult +="1 x 1";
			System.out.println(mult+" = "+fat);
			continue;
		}
		if (j == 0 ){
			System.out.println(mult+fat);
			continue;
		}
		for (int i=j; i>1; i--){
			fat *=i;
			mult +=i+" x ";
		}
		System.out.println(mult+"1 = "+fat);
	}
	
	
	
//fecha main
	}
	
public class Fatorial{
	public int fatorialRecursivo(int num){
		if (num == 0)
			return 1;
		return num * fatorialRecursivo(num-1);
	}
}
	
//fecha classe
}
