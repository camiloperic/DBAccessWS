package model;

import dbmodel.FollowingId;

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
	
	public dbmodel.Following getDBModel() {
		FollowingId followingId = new FollowingId(idCitizen, idProject);
		return new dbmodel.Following(followingId);
	}
	
}
