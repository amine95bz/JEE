package services;

import java.util.List;

import javax.ejb.Remote;

import DTO.Event;

public interface EventConsomationServiceRemote {
	public List<Event>  consommation1();
   	public void Create(Event p);
   	public void Update(Event p , int id);
	public void DelRequest(int id);



}

