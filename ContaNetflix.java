public class ContaNetflix {
  private String idiomaPrerencial;
  private String resolucaoTela;

  public void entrar (){
  System.out.println ("Bem-vindo a sua Conta Netflix");
  buscarIdiomaPrefencial ();
  buscarInformacaoResolucaoTela ();
   
    
  } 


  public void assistirFilme (String nomeFilme){

    System.out.println ("Filme escolhido " + nomeFilme);
    System.out.println ("Resolucao da tela \n" + resolucaoTela);
    System.out.println ("Idioma Preferencial\n" + idiomaPrerencial);
    System.out.println ("Carregando filme.....");
    
  }


  private void buscarIdiomaPrefencial (){  
  
    idiomaPrerencial = "PT-BR";
  }


  private void buscarInformacaoResolucaoTela (){
  
    resolucaoTela = "FULL-HD"; 
  }


  private void carregarAudioFilme (){
    
  if (idiomaPrerencial == "PT - BR" || idiomaPrerencial == "EN - US")
  {
  System.out.println ("Carregando audio em" + idiomaPrerencial);
    } else {
    System.out.println ("Carregando audio em EN-US");
  }
      }

  
}