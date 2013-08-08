package br.sinples.model;

import br.sinples.dbmodel.FollowingId;

public class Following {
	
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
	
	public br.sinples.dbmodel.Following toDBModel() {
		FollowingId followingId = new FollowingId(this.idCitizen, this.idProject);
		return new br.sinples.dbmodel.Following(followingId);
	}
	
}
