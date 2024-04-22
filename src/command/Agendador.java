package command;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Agendador {

	private Timer timer;

	public Agendador() {
		timer = new Timer();
	}

	public void agendar(Comando comando, int hora, int minuto) {
		Calendar now = Calendar.getInstance();
		int horaAtual = now.get(Calendar.HOUR_OF_DAY);
		int minutoAtual = now.get(Calendar.MINUTE);

		// Criar uma instância de Calendar para o horário especificado
		Calendar scheduledTime = Calendar.getInstance();
		scheduledTime.set(Calendar.HOUR_OF_DAY, hora);
		scheduledTime.set(Calendar.MINUTE, minuto);
		scheduledTime.set(Calendar.SECOND, 0);

		// Se o horário especificado já passou hoje, adiciona um dia ao agendamento
		if (horaAtual > hora || (horaAtual == hora && minutoAtual > minuto)) {
			scheduledTime.add(Calendar.DAY_OF_MONTH, 1);
		}

		// Calcular o atraso em milissegundos
		long delay = scheduledTime.getTimeInMillis() - now.getTimeInMillis();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				comando.executar();
			}
		}, delay);
	}
}
