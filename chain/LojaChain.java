package chain;


public abstract class LojaChain {

	protected LojaChain next;
	protected IDLojas identificadorDaLoja;

	public LojaChain(IDLojas id) {
		next = null;
		identificadorDaLoja = id;
	}

	public void setNext(LojaChain forma) {
		if (next == null) {
			next = forma;
		} else {
			next.setNext(forma);
		}
	}

	public void efetuarPagamento(IDLojas id) throws Exception {
		if (podeEfetuarPagamento(id)) {
			efetuaPagamento();
		} else {
			if (next == null) {
				throw new Exception("Loja não cadastrado");
			}
			next.efetuarPagamento(id);
		}
	}

	private boolean podeEfetuarPagamento(IDLojas id) {
		if (identificadorDaLoja == id) {
			return true;
		}
		return false;
	}

	protected abstract void efetuaPagamento();

}
