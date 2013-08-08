package br.sinples.dbmodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-08-08T15:57:26.943-0300")
@StaticMetamodel(Comment.class)
public class Comment_ {
	public static volatile SingularAttribute<Comment, Integer> id;
	public static volatile SingularAttribute<Comment, Integer> idCitizen;
	public static volatile SingularAttribute<Comment, Integer> idProject;
	public static volatile SingularAttribute<Comment, Integer> idParent;
	public static volatile SingularAttribute<Comment, String> comment;
}
