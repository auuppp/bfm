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
 * Home object for domain model class TmpAtbassetamorzsum.
 * @see com.bfm.db.bean.TmpAtbassetamorzsum
 * @author Hibernate Tools
 */
public class TmpAtbassetamorzsumHome {

	private static final Log log = LogFactory
			.getLog(TmpAtbassetamorzsumHome.class);

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

	public void persist(TmpAtbassetamorzsum transientInstance) {
		log.debug("persisting TmpAtbassetamorzsum instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TmpAtbassetamorzsum instance) {
		log.debug("attaching dirty TmpAtbassetamorzsum instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TmpAtbassetamorzsum instance) {
		log.debug("attaching clean TmpAtbassetamorzsum instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TmpAtbassetamorzsum persistentInstance) {
		log.debug("deleting TmpAtbassetamorzsum instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TmpAtbassetamorzsum merge(TmpAtbassetamorzsum detachedInstance) {
		log.debug("merging TmpAtbassetamorzsum instance");
		try {
			TmpAtbassetamorzsum result = (TmpAtbassetamorzsum) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TmpAtbassetamorzsum findById(com.bfm.db.bean.TmpAtbassetamorzsumId id) {
		log.debug("getting TmpAtbassetamorzsum instance with id: " + id);
		try {
			TmpAtbassetamorzsum instance = (TmpAtbassetamorzsum) sessionFactory
					.getCurrentSession().get(
							"com.bfm.db.bean.TmpAtbassetamorzsum", id);
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

	public List findByExample(TmpAtbassetamorzsum instance) {
		log.debug("finding TmpAtbassetamorzsum instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.bfm.db.bean.TmpAtbassetamorzsum")
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
