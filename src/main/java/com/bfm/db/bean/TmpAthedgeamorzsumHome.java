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
 * Home object for domain model class TmpAthedgeamorzsum.
 * @see com.bfm.db.bean.TmpAthedgeamorzsum
 * @author Hibernate Tools
 */
public class TmpAthedgeamorzsumHome {

	private static final Log log = LogFactory
			.getLog(TmpAthedgeamorzsumHome.class);

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

	public void persist(TmpAthedgeamorzsum transientInstance) {
		log.debug("persisting TmpAthedgeamorzsum instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TmpAthedgeamorzsum instance) {
		log.debug("attaching dirty TmpAthedgeamorzsum instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TmpAthedgeamorzsum instance) {
		log.debug("attaching clean TmpAthedgeamorzsum instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TmpAthedgeamorzsum persistentInstance) {
		log.debug("deleting TmpAthedgeamorzsum instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TmpAthedgeamorzsum merge(TmpAthedgeamorzsum detachedInstance) {
		log.debug("merging TmpAthedgeamorzsum instance");
		try {
			TmpAthedgeamorzsum result = (TmpAthedgeamorzsum) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TmpAthedgeamorzsum findById(com.bfm.db.bean.TmpAthedgeamorzsumId id) {
		log.debug("getting TmpAthedgeamorzsum instance with id: " + id);
		try {
			TmpAthedgeamorzsum instance = (TmpAthedgeamorzsum) sessionFactory
					.getCurrentSession().get(
							"com.bfm.db.bean.TmpAthedgeamorzsum", id);
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

	public List findByExample(TmpAthedgeamorzsum instance) {
		log.debug("finding TmpAthedgeamorzsum instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.bfm.db.bean.TmpAthedgeamorzsum")
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
