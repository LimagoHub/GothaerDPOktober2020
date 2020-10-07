package de.composite;

public class Konto extends AbstractKontoNode {

	private double saldo = 0;
	
	public Konto(final String label) {
		super(label);
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(final double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Konto [saldo=");
		builder.append(saldo);
		builder.append(", getParent()=");
		builder.append(getParent());
		builder.append("]");
		return builder.toString();
	}

	

}
