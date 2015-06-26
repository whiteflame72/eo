package com.eolinc.utility;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.eolinc.dao.BaseDao;
import com.eolinc.exception.EOLException;

public class HibernateUtil extends BaseDao{
	
	@SuppressWarnings("unchecked")
	public List findMax(String query,String[]params){
		List max = null;
		Session session = null;
		try{
			session = getSession();
			beginOperations();
			max = session.createQuery(query).setInteger(0, Integer.parseInt(params[0])).setInteger(1, Integer.parseInt(params[1])).list();
						
		}catch(Exception exception){
			exception.printStackTrace();
		}finally{
			try {
				endOperations();
			} catch (EOLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return max;
	}
	
	@SuppressWarnings("unchecked")
	public List findRecord(String query,Object[]params){
		List max = null;
		Session session = null;
		try{
			session = getSession();
			beginOperations();
			max = session.createQuery(query).
			setInteger(0, (Integer)(params[0])).
			setInteger(1, (Integer)params[1]).
			setTimestamp(2, (Date)params[2]).
			list();		
			
		}catch(Exception exception){
			exception.printStackTrace();
		}finally{
			try {
				endOperations();
			} catch (EOLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return max;
	}	
}
