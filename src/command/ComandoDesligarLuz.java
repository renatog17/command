package command;

public class ComandoDesligarLuz implements Comando {

	private Luz luz;

	public ComandoDesligarLuz(Luz luz) {
		super();
		this.luz = luz;
	}

	@Override
	public void executar() {
		luz.desligar();

	}
}
