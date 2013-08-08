package br.sinples.model;

import br.sinples.dbmodel.KeywordedId;

public class Keyworded {

	private int idCitizen;
	
	private int idProject;
	
	private int idKeyword;

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

	public int getIdKeyword() {
		return idKeyword;
	}

	public void setIdKeyword(int idKeyword) {
		this.idKeyword = idKeyword;
	}
	
	public br.sinples.dbmodel.Keyworded toDBModel() {
		KeywordedId keywordedId = new KeywordedId(this.idCitizen, this.idProject, this.idKeyword);
		return new br.sinples.dbmodel.Keyworded(keywordedId);
	}
	
}
