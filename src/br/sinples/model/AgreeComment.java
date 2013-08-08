package br.sinples.model;

import br.sinples.dbmodel.AgreeCommentId;

public class AgreeComment {

	private int idCitizen;
	
	private int idComment;

	public int getIdCitizen() {
		return idCitizen;
	}

	public void setIdCitizen(int idCitizen) {
		this.idCitizen = idCitizen;
	}

	public int getIdComment() {
		return idComment;
	}

	public void setIdComment(int idComment) {
		this.idComment = idComment;
	}
	
	public br.sinples.dbmodel.AgreeComment toDBModel() {
		AgreeCommentId agreeCommentId = new AgreeCommentId(this.idCitizen, this.idComment);
		return new br.sinples.dbmodel.AgreeComment(agreeCommentId);
	}
	
}
