public class TomadaDeDoisPinos{
  public void  LigarNaTomadaDeDoisPinos(){
    System.out.println("Ligado na tomada de dois pinos");
  }
}

public class TomadaDeTresPinos{
  public void ligarNaTomadaDeTresPinos(){
    System.out.println("Ligado na tomada de tres pinos");
  }
}

public class AdapterTomada extends TomadaDeDoisPinos{
  private TomadaDeTresPinos tomadaDeTresPinos;

  public AdapterTomada(TomadaDeTresPinos tomadaDeTresPinos){
    this.TomadaDeTresPinos = tomadaDeTresPinos;
  }

  public void LigarNaTomadaDeDoisPinos(){
    tomadaDeTresPinos.ligarNaTomadaDeTresPinos();
  }
}
