package command;

public class Main {

	public static void main(String[] args) {
		 Luz luz = new Luz();
	        ArCondicionado arCondicionado = new ArCondicionado();

	        // Criar comandos
	        Comando comandoDesligarLuz = new ComandoDesligarLuz(luz);
	        Comando comandoLigarArCondicionado = new ComandoLigarArCondicionado(arCondicionado);

	        // Criar agendador
	        Agendador agendador = new Agendador();

	        // Agendar o desligamento das luzes às 22:20 todas as noites
	        agendador.agendar(comandoDesligarLuz, 13, 21);

	        // Agendar a ligação do ar-condicionado às 19:40 todos os dias
	        agendador.agendar(comandoLigarArCondicionado, 19, 40);

	}

}
