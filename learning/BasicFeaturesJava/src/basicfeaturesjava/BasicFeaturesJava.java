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
//import java.lang.*; //Object;

public class BasicFeaturesJava {
		/*Sequencia de exercícios trabalhando
		* com variaveis e comentários no código.
		*/
	public static void main(String[] args){
    
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

		if (diasmn == 1){
			nomedia="domingo";
			gendia="um";
		}
		else if (diasmn == 2){
			nomedia="segunda-Feira";
			gendia="uma";
		}
		else if (diasmn == 3){
			nomedia="terca-Feira";
			gendia="uma";
		}
		else if (diasmn == 4){
			nomedia="quarta-Feira";
			gendia="uma";
		}
		else if (diasmn == 5){
			nomedia="quinta-Feira";
			gendia="uma";
		}
		else if (diasmn == 6){
			nomedia="sexta-Feira";
			gendia="uma";
		}
		
		else {
			nomedia="sabado";
			gendia="um";
		}
		System.out.println("\nDia da semana formatado: "+nomedia);
		
		//Formatando meses:
		String mesnome="";
		int mes=data2.get(Calendar.MONTH);

		if (mes == 0){
			mesnome="Janeiro";
		}
		else if (mes == 1){
			mesnome="Fevereiro";
		}
		else if (mes == 2){
			mesnome="Março";
		}
		else if (mes == 3){
			mesnome="Abril";
		}
		else if (mes == 4){
			mesnome="Maio";
		}
		else if (mes == 5){
			mesnome="Junho";
		}
		else if (mes == 6){
			mesnome="Julho";
		}
		else if (mes == 7){
			mesnome="Agosto";
		}
		else if (mes == 8){
			mesnome="Setembro";
		}
		else if (mes == 9){
			mesnome="Outubro";
		}
		else if (mes == 10){
			mesnome="Novembro";
		}
		else {
			mesnome="Dezembro";
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

		System.out.println("\n\nData completa formatada: ");
		System.out.println(saudacao+", estamos em "+gendia+" "+nomedia+", "+dia+" de "+mesnome+" de "+ano+".\n\n");

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

		
	//Teste contando números primos
	boolean primo;
	long num=10/*9223372036854775807L*/, quociente=2, quocienteant=0, diferenca=0;
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
System.out.println("\nA="+a+", B="+b+", C="+c+"\nApós incremento:");
b=b+a++;
c=c+(++a);	
System.out.println("A="+a+"\nB="+b+"\nC="+c);
	
	
	
	//Já foi utilizado o break, agora o continue
System.out.println("\n\nUsando o comando continue; para rodar o laço sem executar abaixo:");
	for (b=0; b<5; b++){
			if (b > 2 && b < 4){
				continue;
				}
			System.out.print("\n"+b+" ");
		}
System.out.println("\nNo caso acima, foi dado o continue caso o número fosse 3,");
System.out.println("então não executou a exibição deste número que estava abaixo."); 


	
//fecha main
	}
//fecha classe
}
