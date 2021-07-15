package contracheque;

public class FolhaDePagamento {
	
	public String nome;
	public double salariobr;
	public double imposto;
	
	public double novosalrio() {
		return salariobr - imposto;
	}
	
	public void salarionovo(double porcento) {
		salariobr += salariobr * porcento /100.0;
		
	}
	
      public String toString() {
    	  return nome+ " , "+ String.format("%.2f",salariobr);
      }
				
	

}
