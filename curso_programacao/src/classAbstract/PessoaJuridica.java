package classAbstract;

public class PessoaJuridica extends Pessoa {

	private Integer qteFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaMensal, Integer qteFuncionarios) {
		super(nome, rendaMensal);
		this.qteFuncionarios = qteFuncionarios;
	}

	public Integer getQteFuncionarios() {
		return qteFuncionarios;
	}

	public void setQteFuncionarios(Integer qteFuncionarios) {
		this.qteFuncionarios = qteFuncionarios;
	}

	@Override
	public Double calcImposto() {
		double txImposto = 0.0;
		if (getQteFuncionarios() > 10) {
			txImposto = 0.14;
		} else {
			txImposto = 0.16;
		}
		return (getRendaMensal() * txImposto);
	}
}
