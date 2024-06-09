package MessengerApp.Apps;

public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem() ;
	public abstract void receberMensagem();

    //protected, pois somente quem herda pode ver
    protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	
    
}
