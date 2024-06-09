package MessengerApp;

import MessengerApp.Apps.FacebookMessenger;
import MessengerApp.Apps.MSNMessenger;
import MessengerApp.Apps.ServicoMensagemInstantanea;
import MessengerApp.Apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="msn"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
			
		smi.enviarMensagem();
		smi.receberMensagem();
		
	}
}
