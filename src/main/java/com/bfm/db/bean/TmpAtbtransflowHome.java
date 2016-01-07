package com.bfm.db.bean;

// Generated 2015-11-18 13:54:13 by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class TmpAtbtransflow.
 * @see com.bfm.db.bean.TmpAtbtransflow
 * @author Hibernate Tools
 */
public class TmpAtbtransflowHome {

	private static final Log log = LogFactory.getLog(TmpAtbtransflowHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(TmpAtbtransflow transientInstance) {
		log.debug("persisting TmpAtbtransflow instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TmpAtbtransflow instance) {
		log.debug("attaching dirty TmpAtbtransflow instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TmpAtbtransflow instance) {
		log.debug("attaching clean TmpAtbtransflow instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TmpAtbtransflow persistentInstance) {
		log.debug("deleting TmpAtbtransflow instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TmpAtbtransflow merge(TmpAtbtransflow detachedInstance) {
		log.debug("merging TmpAtbtransflow instance");
		try {
			TmpAtbtransflow result = (TmpAtbtransflow) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TmpAtbtransflow findById(com.bfm.db.bean.TmpAtbtransflowId id) {
		log.debug("getting TmpAtbtransflow instance with id: " + id);
		try {
			TmpAtbtransflow instance = (TmpAtbtransflow) sessionFactory
					.getCurrentSession().get("com.bfm.db.bean.TmpAtbtransflow",
							id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TmpAtbtransflow instance) {
		log.debug("finding TmpAtbtransflow instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.bfm.db.bean.TmpAtbtransflow")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
