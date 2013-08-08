package br.sinples.dbmodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-08-08T15:57:26.947-0300")
@StaticMetamodel(Project.class)
public class Project_ {
	public static volatile SingularAttribute<Project, Integer> id;
	public static volatile SingularAttribute<Project, Integer> idCitizen;
	public static volatile SingularAttribute<Project, Integer> idParent;
	public static volatile SingularAttribute<Project, Boolean> sketch;
	public static volatile SingularAttribute<Project, String> text;
}
