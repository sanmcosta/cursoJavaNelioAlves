package util;

public class CurrencyConverter {

	public double precoDolar;
	private double taxaIOF = 1.06;
	public double qteDolarComprado;

	public double calculaValorPagoEmReais() {
		return (precoDolar * qteDolarComprado) * taxaIOF;
	}
}
