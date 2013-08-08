package br.sinples.model;

import br.sinples.dbmodel.TaggedId;

public class Tagged {

	private int idCitizen;
	
	private int idProject;
	
	private int idTag;

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

	public int getIdTag() {
		return idTag;
	}

	public void setIdTag(int idTag) {
		this.idTag = idTag;
	}
	
	public br.sinples.dbmodel.Tagged toDBModel() {
		TaggedId taggedId = new TaggedId(this.idCitizen, this.idProject, this.idTag);
		return new br.sinples.dbmodel.Tagged(taggedId);
	}
	
}
