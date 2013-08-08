package br.sinples.model;

import br.sinples.dbmodel.AgreeArgumentId;

public class AgreeArgument {

	private int idCitizen;
	
	private int idArgument;

	public int getIdCitizen() {
		return idCitizen;
	}

	public void setIdCitizen(int idCitizen) {
		this.idCitizen = idCitizen;
	}

	public int getIdArgument() {
		return idArgument;
	}

	public void setIdArgument(int idArgument) {
		this.idArgument = idArgument;
	}
	
	public br.sinples.dbmodel.AgreeArgument toDBModel() {
		AgreeArgumentId agreeArgumentId = new AgreeArgumentId(this.idCitizen, this.idArgument);
		return new br.sinples.dbmodel.AgreeArgument(agreeArgumentId);
	}
	
}
