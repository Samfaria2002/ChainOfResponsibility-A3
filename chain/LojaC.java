package chain;


public class LojaC extends LojaChain {

	public LojaC() {
		super(IDLojas.LojaC);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado na Loja C");
	}

}
