public class DiasNoMes{
	public static void main(String[]args){

	String mes = "Abril";
	int dias = 0;
	
	switch(mes){

	case "Janeiro":
	case "Março":
	case "Maio":
	case "Julho":
	case "Agosto":
	case "Outubro":
	case "Dezembro":

	 	dias = 31;
	 	System.out.println("O mês de " + mes + " tem " + dias + " dias");
	 	break;

	case "Abril":
	case "Junho":
	case "Setembro":
	case "Novembro":

		dias = 30;
		System.out.println("O mês de " + mes + " tem " + dias + " dias");
		break;

	case "Fevereiro":

		dias = 28;
		System.out.println("O mês de " + mes + " tem " + dias + " dias");
		break;

	default:

		System.out.println("Mês desconhecido");
		break;


		}
	}
}