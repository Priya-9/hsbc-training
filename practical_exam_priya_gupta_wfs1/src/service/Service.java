package service;

import dao.Dao;

public class Service {
	private Dao obj;
	
	public Service(Dao obj) {
		this.obj = obj;
	}
	
	public void report() {
		obj.listAll();
	}
	
	public void add() {
		obj.additem();
	}
}
