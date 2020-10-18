package com.java.project.HibernateAndJpa.DataAccess;

import java.util.List;
import com.java.project.HibernateAndJpa.Entities.*;

public interface ICityDal {
	
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}
