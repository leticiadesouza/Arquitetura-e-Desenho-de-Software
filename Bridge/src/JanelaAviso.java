
public class JanelaAviso extends JanelaAbstrata{
	public JanelaAviso(JanelaImplementadora j){
		super(j);
	}
	
	public void desenhar(){
		desenharJanela("Aviso");
		desenharBotao("ok");
	}
}