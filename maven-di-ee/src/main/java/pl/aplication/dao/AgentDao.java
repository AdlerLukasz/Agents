package pl.aplication.dao;

import pl.aplication.model.Agent;

public interface AgentDao  {

	public void saveAgent (Agent agent);
	public void updateAgent (Agent agent);
	
	public Agent getId (Long id);
	public void remove(Long id);
	
	
}
