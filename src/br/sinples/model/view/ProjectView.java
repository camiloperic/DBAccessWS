package br.sinples.model.view;

import br.sinples.dbmodel.Project;

public class ProjectView {

	private Project project;
	
	private boolean signed;
	private int signatures;
	
	private boolean following;
	private int followers;
	
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public boolean isSigned() {
		return signed;
	}
	public void setSigned(boolean signed) {
		this.signed = signed;
	}
	public int getSignatures() {
		return signatures;
	}
	public void setSignatures(int signatures) {
		this.signatures = signatures;
	}
	public boolean isFollowing() {
		return following;
	}
	public void setFollowing(boolean following) {
		this.following = following;
	}
	public int getFollowers() {
		return followers;
	}
	public void setFollowers(int followers) {
		this.followers = followers;
	}
	
}
