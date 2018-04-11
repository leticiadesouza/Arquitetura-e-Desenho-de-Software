public abstract class JanelaAbstrata {
	
	private JanelaImplementadora janela;
	
	public JanelaAbstrata(JanelaImplementadora j){
		this.janela = j;
	}
	
	public void desenharJanela(String titulo){
		janela.desenharJanela(titulo);
	}
	
	public void desenharBotao(String titulo){
		janela.desenharBotao(titulo);
	}
	
	public abstract void desenhar();
}
