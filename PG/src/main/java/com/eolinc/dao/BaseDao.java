package com.eolinc.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;
import org.hibernate.persister.entity.AbstractEntityPersister;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.eolinc.dto.BaseDto;
import com.eolinc.dto.BasePrimaryKey;
import com.eolinc.exception.EOLException;

@Repository
@SuppressWarnings("unchecked")
public class BaseDao {
	private static Logger logger = Logger.getLogger(BaseDao.class.getName());
	private static SessionFactory sessionFactory;
	private boolean open = false;

	public Object find(Class<?> cls, long id) throws EOLException{
        try {
			beginOperations();
        	return (Serializable) getSession().get(cls, id);
        } catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
        }
        return null;
    }

	public List findByField(Class<?> cls, String fName, Object value) throws EOLException{
        try {
			beginOperations();
			Criteria criteria = getSession().createCriteria(cls);
            criteria.add(Restrictions.eq(fName, value));
            return criteria.list();
        } catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
        }
        return null;
    }

	public List findBy2Fields(Class<?> cls, String fName1, Object value1, String fName2, Object value2) throws EOLException{
		try {
			beginOperations();
			Criteria criteria = getSession().createCriteria(cls);
			criteria.add(Restrictions.eq(fName1, value1));
			criteria.add(Restrictions.eq(fName2, value2));
 		return criteria.list();
		} catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
		}
	    return null;
	}
	
	public List findByFields(Class<?> cls, Map<String, Object> params) throws EOLException{
		try {
			beginOperations();
			Criteria criteria = getSession().createCriteria(cls);
			for (String fName : params.keySet()) {
				criteria.add(Restrictions.eq(fName, params.get(fName)));
			}
 		return criteria.list();
		} catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
		}
	    return null;
	}
	
	public List findChildren(Class<?> cls, String parentkey, String key, Object value) throws EOLException{
		try {
			beginOperations();
			Query q = getSession().createQuery("SELECT parent FROM " + 
					cls.getName() + " parent, " + cls.getName() + 
					" child where child." + parentkey + " = parent." + parentkey + " AND child." + key + " =?");
			q.setParameter(0, value);
			return q.list();
		} catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
		}
	    return null;
	}
	
	public List findByJoinRelation(Class<?> cls, Class<?> relCls) throws EOLException{
		try {
			beginOperations();
			Criteria criteria = getSession().createCriteria(cls).setFetchMode(relCls.getName(), FetchMode.JOIN);
			return criteria.list();
		} catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
		}
	    return null;
	}

// It does not work properly
	public List findByExample(Object obj) throws EOLException{
		try {
			beginOperations();
			Criteria criteria = getSession().createCriteria(obj.getClass());
			criteria.add(Example.create(obj));
			return criteria.list();
		} catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
       }
	    return null;
   }

	public List findAll(Class<?> cls) throws EOLException{
        try {
			beginOperations();
        	Criteria criteria = getSession().createCriteria(cls);
        	return criteria.list();
        } catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
        }
		return null;
    }
	// Not used	
	public List findByAssociationId(Class<?> cls, String fName, long id) throws EOLException {
		try {
			beginOperations();
			Criteria criteria = getSession().createCriteria(cls);
			criteria.createCriteria(fName);
			criteria.add(Restrictions.eq("id", id));
			return criteria.list();
		} catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
		}
	    return null;
	}
	// Not used
	public List findByAssociation(Class<?> cls, String fName, Object obj) throws EOLException {
		try {
			beginOperations();
			Criteria criteria = getSession().createCriteria(cls);
			criteria.createCriteria(fName);
			criteria.add(Restrictions.eq(fName, obj));
			return criteria.list();
		} catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
		}
	    return null;
	}
	// Not used	
	public List findByAssociation(Class<?> cls, String fName, String fNamefName, Object obj) throws EOLException {
		try {
			beginOperations();
			Criteria criteria = getSession().createCriteria(cls);
			criteria.createAlias(fName, "f");
			criteria.add(Restrictions.eq("f."+fNamefName, obj));
			return criteria.list();
		} catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
		}
	    return null;
	}
	
// It needs antlr.2.7.6.jar to work. Otherwise, it returns null Exception
	public List findByQuery(Class<?> cls, String fName, Object value) throws EOLException{
		try {
			beginOperations();
			Query q = getSession().createQuery("FROM " + cls.getName() + " WHERE " + fName + " = ?");
			q.setParameter(0, value);
			return q.list();
		} catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
		}
		return null;
	}

	public List findByQuery2(Class<?> cls, String fName1, Object value1, String fName2, Object value2) throws EOLException{
		try {
			beginOperations();
			Query q = getSession().createQuery("FROM " + cls.getName() + " WHERE " + fName1 + " = ? AND "  + fName2 + " = ?");
			q.setParameter(0, value1);
			q.setParameter(1, value2);
			return q.list();
		} catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
		}
		return null;
	}

	public List findByQuery(Class<?> cls, Map<String, Object> params) throws EOLException{
		try {
			beginOperations();
			StringBuffer hqlBuf = new StringBuffer("FROM ");
			hqlBuf.append(cls.getName()).append(" WHERE ");
			for (String key : params.keySet()) {
				hqlBuf.append(key).append(" = :").append(key).append(" AND ");
			}
			hqlBuf.append("1 = 1");
			Query q = getSession().createQuery(hqlBuf.toString()); 	
			q.setProperties(params);
			return q.list();
		} catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
		}
		return null;
	}

	public List findBySQLQuery(Class<?> cls, String dbFieldName, long value) throws EOLException{
		try {
			beginOperations();
			AbstractEntityPersister persister = (AbstractEntityPersister) getSessionFactory().getClassMetadata(cls);
			String tableName = persister.getTableName();
			SQLQuery q = getSession().createSQLQuery("SELECT * FROM " + tableName + " WHERE " + dbFieldName + " = ?");
			q.setLong(0, value);
			q.addEntity(cls);
			return q.list();
		} catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
		}
		return null;
	}

	public List findByNativeSQL(String sql) throws EOLException{
		try {
			beginOperations();
			Query q = getSession().createSQLQuery(sql);
			q.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
			return q.list();
		} catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
		}
		return null;
	}

	public void runNativeSQL(String sql) throws EOLException{
		try {
			beginOperations();
			Query q = getSession().createSQLQuery(sql);
			q.executeUpdate();
		} catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
		}
	}

	public List findByNamedQuery(String qName, Map<String, String> params) throws EOLException{
		try {
			beginOperations();
			Query q = getSession().getNamedQuery(qName);
			q.setProperties(params);
			q.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
			return q.list();
		} catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
		}
		return null;
	}

	public void save(Object obj) throws EOLException{
        try {
            beginOperations();
            Long id = ((BaseDto)obj).getId();
            if(getSession().get(obj.getClass(), id) == null ) {
            	getSession().save(obj);
            } else {
            	getSession().merge(obj);
            }
        } catch (Exception e) {
			handleException(e);
        } finally {
        	endOperations();
        }
    }

	public void save(Object obj, BasePrimaryKey pk) throws EOLException{
        try {
            beginOperations();
            if(getSession().get(obj.getClass(), (Serializable) pk) == null ) {
            	getSession().save(obj);
            } else {
            	getSession().merge(obj);
            }
        } catch (Exception e) {
			handleException(e);
        } finally {
        	endOperations();
        }
    }

	public void delete(Object obj) throws EOLException{
        try {
            beginOperations();
            getSession().delete(obj);
        } catch (Exception e) {
            handleException(e);
        } finally {
        	endOperations();
        }
    }

	public void simpleDeleteAll(Class<?> cls) throws EOLException{
		try {
			beginOperations();
			AbstractEntityPersister persister = (AbstractEntityPersister) getSessionFactory().getClassMetadata(cls);
			String tableName = persister.getTableName();
			SQLQuery q = getSession().createSQLQuery("DELETE FROM " + tableName);
			q.executeUpdate();
		} catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
		}
	}
	public void deleteAll(Class<?> cls) throws EOLException{
		List objs = findAll(cls);
		if (objs.size() > 0) {
	        try {
	            beginOperations();
	            for (Object obj : objs){
	            	getSession().delete(obj);
	            }
	        } catch (Exception e) {
	            handleException(e);
	        } finally {
	        	endOperations();
	        }
		}
    }
	public int deleteByQuery(Class<?> cls, String fName, Object value) throws EOLException{
        try {
			beginOperations();
			Query q = getSession().createQuery("DELETE FROM " + cls.getName() + " WHERE " + fName + " = ?");
			q.setParameter(0, value);
			return q.executeUpdate();
		} catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
        }
        return 0;
    }
	
	public int deleteByQuery2(Class<?> cls, String fName1, Object value1, String fName2, Object value2) throws EOLException{
        try {
			beginOperations();
			Query q = getSession().createQuery("DELETE FROM " + cls.getName() + " WHERE " + fName1 + " = ? AND " + fName2 + " = ?");
			q.setParameter(0, value1);
			q.setParameter(1, value2);
			return q.executeUpdate();
		} catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
        }
        return 0;
    }

	public int deleteByQuery(Class<?> cls, Map<String, Object> params) throws EOLException{
		try {
			beginOperations();
			StringBuffer hqlBuf = new StringBuffer("DELETE FROM ");
			hqlBuf.append(cls.getName()).append(" WHERE ");
			for (String key : params.keySet()) {
				hqlBuf.append(key).append(" = :").append(key).append(" AND ");
			}
			hqlBuf.append("1 = 1");
			Query q = getSession().createQuery(hqlBuf.toString()); 	
			q.setProperties(params);
			return q.executeUpdate();
		} catch (Exception e) {
			handleException(e);
		} finally {
			endOperations();
		}
	    return 0;
	}
	
    protected void handleException(Exception e) throws EOLException {
    	getSession().getTransaction().rollback();
    	open=false;
 		logger.error("A Hibernate Exception Occurred: " + e.getMessage());
		throw new EOLException(e);
    }

    protected void beginOperations() throws EOLException {
    	try {
    		if (!open) getSession().beginTransaction();
		} catch (Exception e) {
			throw new EOLException(e);
		}
    }
    
    protected void endOperations() throws EOLException {
    	try {
    		if (!open) getSession().getTransaction().commit();
		} catch (Exception e) {
			throw new EOLException(e);
		}
    }
 

	public static SessionFactory getSessionFactory() throws EOLException{
		if (sessionFactory == null) {
			try {
				// Create the SessionFactory from hibernate.cfg.xml
//				sessionFactory = new Configuration().configure().buildSessionFactory();
				sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
			} catch (Throwable ex) {
				// Make sure you log the exception
				logger.error("Initial SessionFactory creation failed." + ex);
				throw new EOLException(ex);
			}
		}
		return sessionFactory;
	}
	public Session getSession() throws EOLException {
    	return getSessionFactory().getCurrentSession();
    }

	public boolean isOpen() {
		return open;
	}

	public void open() throws EOLException {
		open = false;
		beginOperations();
		open = true;
	}
	public void close() throws EOLException {
		open = false;
		endOperations();
	}
	
}