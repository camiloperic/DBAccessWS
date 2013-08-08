package br.sinples.model.view;

import br.sinples.dbmodel.Argument;

public class ArgumentView {
	
	private Argument argument;
	
	private boolean agreed;
	private int agreements;
	
	public Argument getArgument() {
		return argument;
	}
	public void setArgument(Argument argument) {
		this.argument = argument;
	}
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	public int getAgreements() {
		return agreements;
	}
	public void setAgreements(int agreements) {
		this.agreements = agreements;
	}
	
}
