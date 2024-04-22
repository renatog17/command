package command;

public class ComandoLigarArCondicionado implements Comando {

	private ArCondicionado arCondicionado;

	public ComandoLigarArCondicionado(ArCondicionado arCondicionado) {
		super();
		this.arCondicionado = arCondicionado;
	}

	@Override
	public void executar() {
		arCondicionado.ligar();

	}

}
