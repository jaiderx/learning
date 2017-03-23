/*
 * Início dos estudos de programação  em Java
 * Jaider Xavier Jr.s
 */
import java.util.Calendar;
package basicfeatturesjava;

/**
 *
 * @author administrator
 */
public class BasicFeatturesJava {
		/*SequÃªncia de exercÃ­cios trabalhando
		** com variÃ¡veis e comentÃ¡rios no cÃ³digo.
		*/

	public static void main(String[] args){
            
		//pequenos cÃ¡lculos
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


		//-------------Trabalhando com data
		
		

		//Trabalhando com a classe Calendar
		Calendar data2 = Calendar.getInstance();
		
		//Usando MÃ©todo getTime
		System.out.println("\nData usando Metodo getTime na classe Calendar:");
		System.out.println(data2.getTime());

/*		
		//Exibindo MÃ©todo get(Calendar.objeto)
		
		System.out.println("\n\nData usando metodo get(Calendar.objeto)");
		System.out.println("Ano: "+data2.get(Calendar.YEAR));
		System.out.println("Mes: "+data2.get(Calendar.MONTH));
		System.out.println("Dia: "+data2.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da Semana: "+data2.get(Calendar.DAY_OF_WEEK));
*/		
		
		//Formatando dias da semana:
		String nomedia ="";
		if (data2.get(Calendar.DAY_OF_WEEK)==1){
			nomedia="um domingo";
		}
		if (data2.get(Calendar.DAY_OF_WEEK)==2){
			nomedia="uma segunda-Feira";
		}
		if (data2.get(Calendar.DAY_OF_WEEK)==3){
			nomedia="uma terca-Feira";
		}
		if (data2.get(Calendar.DAY_OF_WEEK)==4){
			nomedia="uma quarta-Feira";
		}
		if (data2.get(Calendar.DAY_OF_WEEK)==5){
			nomedia="uma quinta-Feira";
		}
		if (data2.get(Calendar.DAY_OF_WEEK)==6){
			nomedia="uma sexta-Feira";
		}
		if (data2.get(Calendar.DAY_OF_WEEK)==7){
			nomedia="um sabado";
		}
		System.out.println("\nDia da semana formatado: "+nomedia);
		
		//Formatando meses:
		String mes="";
		if (data2.get(Calendar.MONTH)==1){
			mes="Janeiro";
		}
		if (data2.get(Calendar.MONTH)==2){
			mes="Fevereiro";
		}
		if (data2.get(Calendar.MONTH)==3){
			mes="Marco";
		}
		if (data2.get(Calendar.MONTH)==4){
			mes="Abril";
		}
		if (data2.get(Calendar.MONTH)==5){
			mes="Maio";
		}
		if (data2.get(Calendar.MONTH)==6){
			mes="Junho";
		}
		if (data2.get(Calendar.MONTH)==7){
			mes="Julho";
		}
		if (data2.get(Calendar.MONTH)==8){
			mes="Agosto";
		}
		if (data2.get(Calendar.MONTH)==9){
			mes="Setembro";
		}
		if (data2.get(Calendar.MONTH)==10){
			mes="Outubro";
		}
		if (data2.get(Calendar.MONTH)==11){
			mes="Novembro";
		}
		if (data2.get(Calendar.MONTH)==12){
			mes="Dezembro";
		}
		
			
		//Exibindo dados formatados do calendÃ¡rio:

		if (data2.get(Calendar.HOUR_OF_DAY)>5 && data2.get(Calendar.HOUR_OF_DAY) < 12){
		//System.out.println("\n\nData completa formatada: ");
		System.out.println("Bom dia, estamos em "+nomedia+", "+data2.get(Calendar.DAY_OF_MONTH)+" de "+mes+" de "+data2.get(Calendar.YEAR)+".\n\n");
		//System.out.println(data2);
		//System.out.println(data2.get(Calendar.HOUR_OF_DAY));
		}
		else if (data2.get(Calendar.HOUR_OF_DAY)>=12 && data2.get(Calendar.HOUR_OF_DAY)< 18){
		System.out.println("Boa tarde, estamos em "+nomedia+", "+data2.get(Calendar.DAY_OF_MONTH)+" de "+mes+" de "+data2.get(Calendar.YEAR)+".\n\n");
		}
		else {
		System.out.println("Boa noite, estamos em "+nomedia+", "+data2.get(Calendar.DAY_OF_MONTH)+" de "+mes+" de "+data2.get(Calendar.YEAR)+".\n\n");
		}
		//Fim testes com data
		
		
		//InÃ­cio testes com nÃºmeros
		
	/*	
		double pi=3.14;
		double x=5*10;
		System.out.println("pi: "+pi+" e X: "+(int)x);
                
        */
                
                
                
    }
    
}
