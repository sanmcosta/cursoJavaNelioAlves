package classAbstract;

public class PessoaFisica extends Pessoa {

	private Double despesasComSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaMensal, Double despesasSaude) {
		super(nome, rendaMensal);
		this.despesasComSaude = despesasSaude;
	}

	public Double getDespesasComSaude() {
		return despesasComSaude;
	}

	public void setDespesasComSaude(Double despesasComSaude) {
		this.despesasComSaude = despesasComSaude;
	}

	@Override
	public Double calcImposto() {
		double txImposto = 0.0;
		if (getRendaMensal() < 20000.00) {
			txImposto = 0.15;
		} else {
			txImposto = 0.25;
		}
		return (getRendaMensal() * txImposto) - (getDespesasComSaude() * 0.5);
	}

}
