package solid_ocp_v2;



public class TestaLivro {

	public static void main(String[] args) {

		Livro livro = new Livro ("Livro 1","Autor1",1990, 100, "BR9999888777");
		Fatura fatura = new Fatura (livro, 10, 0.50, 0.50);
		
		
		
		ImpressaoDeFatura print = new ImpressaoDeFatura(fatura);
		
		print.imprimir();
	}

}
