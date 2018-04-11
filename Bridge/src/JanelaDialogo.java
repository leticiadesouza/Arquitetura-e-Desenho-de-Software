
public class JanelaDialogo extends JanelaAbstrata{
	public JanelaDialogo(JanelaImplementadora j){
		super(j);
	}
	
	public void desenhar(){
		desenharJanela("Dialogo");
		desenharBotao("Sim");
		desenharBotao("Não");
		desenharBotao("Cancelar");
	}
}
