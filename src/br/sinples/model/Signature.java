package br.sinples.model;

import br.sinples.dbmodel.SignatureId;

public class Signature {

	private int idCitizen;
	
	private int idProject;

	public int getIdCitizen() {
		return idCitizen;
	}

	public void setIdCitizen(int idCitizen) {
		this.idCitizen = idCitizen;
	}

	public int getIdProject() {
		return idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}
	
	public br.sinples.dbmodel.Signature toDBModel() {
		SignatureId signatureId = new SignatureId(this.idCitizen, this.idProject);
		return new br.sinples.dbmodel.Signature(signatureId);
	}
	
}
