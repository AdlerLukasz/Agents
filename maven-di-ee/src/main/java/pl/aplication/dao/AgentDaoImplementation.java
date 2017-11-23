package pl.aplication.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import pl.aplication.model.Agent;

public class AgentDaoImplementation implements AgentDao{

	@PersistenceUnit(name = "persistanceAgent")
	private EntityManagerFactory emFactory;
	
	
	
	@Override
	public void saveAgent(Agent agent) {
		EntityManager em = emFactory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		System.out.println(agent.getAgentCode() + " ");
		em.persist(agent);
		System.out.println(agent.getAgentCode());
		tx.commit();
		em.close();
		
	
	}

	@Override
	public void updateAgent(Agent agent) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Agent getId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Long id) {
		EntityManager em = emFactory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Agent objToRemove = em.find(Agent.class, id);
        tx.begin();
        em.remove(objToRemove);
        tx.commit();
        em.close();
        System.out.println(objToRemove.getAgentCode());
		
	}

}
