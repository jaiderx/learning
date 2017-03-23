/*
 * Início dos estudos de programação  em Java
 * Jaider Xavier Jr.

 * 
 * Histórico de alterações (inserido em 23/03/2017)
 * Inseridas variáveis para melhor legibilidade no trecho de data
 * Trabalhando com package, compilando e executando
 * Inserida a variável gendia, para dar gênero ao dia da semana
 * Melhorado aninhamento if/else - Jaider
 *
 */
package basicfeaturesjava;
import java.util.Calendar;

public class BasicFeaturesJava {
		/*Sequencia de exercícios trabalhando
		** com variaveis e comentários no código.
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
		Calendar data2 = Calendar.getInstance();
		
		//Usando Método getTime
		System.out.println("\nData usando Metodo getTime na classe Calendar:");
		System.out.println(data2.getTime());

/*		
		//Exibindo Método get(Calendar.objeto)
		
		System.out.println("\n\nData usando metodo get(Calendar.objeto)");
		System.out.println("Ano: "+data2.get(Calendar.YEAR));
		System.out.println("Mes: "+data2.get(Calendar.MONTH));
		System.out.println("Dia: "+data2.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da Semana: "+data2.get(Calendar.DAY_OF_WEEK));
*/		
		
		//Formatando dias da semana:
		String nomedia ="";
		String gendia ="";
		if (data2.get(Calendar.DAY_OF_WEEK)==1){
			nomedia="domingo";
			gendia="um";
		}
		else if (data2.get(Calendar.DAY_OF_WEEK)==2){
			nomedia="segunda-Feira";
			gendia="uma";
		}
		else if (data2.get(Calendar.DAY_OF_WEEK)==3){
			nomedia="terca-Feira";
			gendia="uma";
		}
		else if (data2.get(Calendar.DAY_OF_WEEK)==4){
			nomedia="quarta-Feira";
			gendia="uma";
		}
		else if (data2.get(Calendar.DAY_OF_WEEK)==5){
			nomedia="quinta-Feira";
			gendia="uma";
		}
		else if (data2.get(Calendar.DAY_OF_WEEK)==6){
			nomedia="sexta-Feira";
			gendia="uma";
		}
		//if (data2.get(Calendar.DAY_OF_WEEK)==7){
		else {
			nomedia="sabado";
			gendia="um";
		}
		System.out.println("\nDia da semana formatado: "+nomedia);
		
		//Formatando meses:
		String mes="";
		if (data2.get(Calendar.MONTH)==1){
			mes="Janeiro";
		}
		else if (data2.get(Calendar.MONTH)==2){
			mes="Fevereiro";
		}
		else if (data2.get(Calendar.MONTH)==3){
			mes="Marco";
		}
		else if (data2.get(Calendar.MONTH)==4){
			mes="Abril";
		}
		else if (data2.get(Calendar.MONTH)==5){
			mes="Maio";
		}
		else if (data2.get(Calendar.MONTH)==6){
			mes="Junho";
		}
		else if (data2.get(Calendar.MONTH)==7){
			mes="Julho";
		}
		else if (data2.get(Calendar.MONTH)==8){
			mes="Agosto";
		}
		else if (data2.get(Calendar.MONTH)==9){
			mes="Setembro";
		}
		else if (data2.get(Calendar.MONTH)==10){
			mes="Outubro";
		}
		else if (data2.get(Calendar.MONTH)==11){
			mes="Novembro";
		}
		//if (data2.get(Calendar.MONTH)==12){
		else {
			mes="Dezembro";
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
		System.out.println(saudacao+", estamos em "+gendia+" "+nomedia+", "+dia+" de "+mes+" de "+ano+".\n\n");
		
		//Fim testes com data
		
		//Início dos testes com números
		double pi=3.14;
		double x=5*10;
		System.out.println("pi: "+pi+" e X: "+(int)x);
               
    }
}
