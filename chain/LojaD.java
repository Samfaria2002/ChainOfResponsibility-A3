package chain;


public class LojaD extends LojaChain {

	public LojaD() {
		super(IDLojas.LojaD);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado na Loja D");
	}

}
