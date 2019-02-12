class BalancoTrimestral{
	public static void main (String[] args){
		int gastoJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastoMarco = 17000;
		int gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
		int mediaMensal = gastoTrimestre/3;

		System.out.println(gastoTrimestre);
		System.out.println("Valor da media mensal: "+mediaMensal);

	}
}