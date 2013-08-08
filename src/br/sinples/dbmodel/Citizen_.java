package br.sinples.dbmodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-08-08T15:57:26.942-0300")
@StaticMetamodel(Citizen.class)
public class Citizen_ {
	public static volatile SingularAttribute<Citizen, Integer> id;
	public static volatile SingularAttribute<Citizen, String> username;
	public static volatile SingularAttribute<Citizen, String> passwd;
	public static volatile SingularAttribute<Citizen, String> name;
	public static volatile SingularAttribute<Citizen, String> cpf;
	public static volatile SingularAttribute<Citizen, String> email;
}
