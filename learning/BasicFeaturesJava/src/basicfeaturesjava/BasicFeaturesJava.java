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

/*		
		//Exibindo Método get(Calendar.objeto)
	*	
		System.out.println("\n\nData usando metodo get(Calendar.objeto)");
		System.out.println("Ano: "+data2.get(Calendar.YEAR));
		System.out.println("Mes: "+data2.get(Calendar.MONTH));
		System.out.println("Dia: "+data2.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da Semana: "+data2.get(Calendar.DAY_OF_WEEK));
*/		
		
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

		if (mes == 1){
			mesnome="Janeiro";
		}
		else if (mes == 2){
			mesnome="Fevereiro";
		}
		else if (mes == 3){
			mesnome="Marco";
		}
		else if (mes == 4){
			mesnome="Abril";
		}
		else if (mes == 5){
			mesnome="Maio";
		}
		else if (mes == 6){
			mesnome="Junho";
		}
		else if (mes == 7){
			mesnome="Julho";
		}
		else if (mes == 8){
			mesnome="Agosto";
		}
		else if (mes == 9){
			mesnome="Setembro";
		}
		else if (mes == 10){
			mesnome="Outubro";
		}
		else if (mes == 11){
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
		System.out.println("Data simples: "+dia+"/"+mes+"/"+ano+".");

		//Fim testes com data
		
		//Início dos testes com números
		double pi=3.14;
		double x=5*10;
		System.out.println("\n\npi: "+pi+" e X: "+(int)x);
               
    }
}
