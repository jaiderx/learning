import java.util.Calendar;
//testando sincronia pelo git
//Transformar isso aqui em método depois

public class Datacompleta{
	public static void main(String[] args){
		
	//Formatando Dias da semana
	Calendar data2 = Calendar.getInstance();
	String nomedia ="";
	
		if (data2.get(Calendar.DAY_OF_WEEK)==1){
			nomedia="Domingo";
		}
		if (data2.get(Calendar.DAY_OF_WEEK)==2){
			nomedia="Segunda-Feira";
		}
		if (data2.get(Calendar.DAY_OF_WEEK)==3){
			nomedia="Terca-Feira";
		}
		if (data2.get(Calendar.DAY_OF_WEEK)==4){
			nomedia="Quarta-Feira";
		}
		if (data2.get(Calendar.DAY_OF_WEEK)==5){
			nomedia="Quinta-Feira";
		}
		if (data2.get(Calendar.DAY_OF_WEEK)==6){
			nomedia="Sexta-Feira";
		}
		if (data2.get(Calendar.DAY_OF_WEEK)==7){
			nomedia="Sábado";
		}
		
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
		
		String completa="";
			completa=nomedia+", "+data2.get(Calendar.DAY_OF_MONTH)+" de "+mes+" de "+data2.get(Calendar.YEAR)+".";
	//Exibindo dados formatados do calendário:
		System.out.println(completa);
//Criar return para ser usado em outra aplicação
}

}

 