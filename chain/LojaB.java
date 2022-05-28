package chain;


public class LojaB extends LojaChain {

	public LojaB() {
		super(IDLojas.LojaB);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado na Loja B");
	}

}
