package model;

import dbmodel.SignatureId;

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
	
	public dbmodel.Signature getDBModel() {
		SignatureId signatureId = new SignatureId(idCitizen, idProject);
		return new dbmodel.Signature(signatureId);
	}
	
}
