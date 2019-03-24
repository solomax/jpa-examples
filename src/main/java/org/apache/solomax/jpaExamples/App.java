package org.apache.solomax.jpaExamples;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.solomax.jpaExamples.model.Person;

public class App {

	private static final String PERSISTENCE_UNIT_NAME = "jpaExamples";
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		final EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		final Person person = entityManager.find(Person.class, 1L);
		System.out.println(person);
		entityManager.close();
		ENTITY_MANAGER_FACTORY.close();
	}
}
