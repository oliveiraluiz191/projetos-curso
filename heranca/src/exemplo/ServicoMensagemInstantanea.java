package exemplo;

public class ServicoMensagemInstantanea {
	
	public void enviarMensagem() {
		validarConectatoInternet();
		System.out.println("Enviando mensagem");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	//MÉTODOS PRIVADOS. VISIVEIS SOMENTE NA CLASSE ONDE FORAM CRIADOS
	private void validarConectatoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}

}
