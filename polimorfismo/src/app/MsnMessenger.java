package app;

public class MsnMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Messenger");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Messenger");
		
	}

}
