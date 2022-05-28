package chain;


public class Cliente {
	public static void main(String[] args) {
		LojaChain lojas = new LojaA();
		lojas.setNext(new LojaB());
		lojas.setNext(new LojaC());
		lojas.setNext(new LojaD());
		
		try {
			lojas.efetuarPagamento(IDLojas.LojaC);
			lojas.efetuarPagamento(IDLojas.LojaD);
			lojas.efetuarPagamento(IDLojas.LojaA);
			lojas.efetuarPagamento(IDLojas.LojaB);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
