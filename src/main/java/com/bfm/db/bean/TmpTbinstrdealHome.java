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
 * Home object for domain model class TmpTbinstrdeal.
 * @see com.bfm.db.bean.TmpTbinstrdeal
 * @author Hibernate Tools
 */
public class TmpTbinstrdealHome {

	private static final Log log = LogFactory.getLog(TmpTbinstrdealHome.class);

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

	public void persist(TmpTbinstrdeal transientInstance) {
		log.debug("persisting TmpTbinstrdeal instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TmpTbinstrdeal instance) {
		log.debug("attaching dirty TmpTbinstrdeal instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TmpTbinstrdeal instance) {
		log.debug("attaching clean TmpTbinstrdeal instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TmpTbinstrdeal persistentInstance) {
		log.debug("deleting TmpTbinstrdeal instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TmpTbinstrdeal merge(TmpTbinstrdeal detachedInstance) {
		log.debug("merging TmpTbinstrdeal instance");
		try {
			TmpTbinstrdeal result = (TmpTbinstrdeal) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TmpTbinstrdeal findById(com.bfm.db.bean.TmpTbinstrdealId id) {
		log.debug("getting TmpTbinstrdeal instance with id: " + id);
		try {
			TmpTbinstrdeal instance = (TmpTbinstrdeal) sessionFactory
					.getCurrentSession().get("com.bfm.db.bean.TmpTbinstrdeal",
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

	public List findByExample(TmpTbinstrdeal instance) {
		log.debug("finding TmpTbinstrdeal instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.bfm.db.bean.TmpTbinstrdeal")
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
