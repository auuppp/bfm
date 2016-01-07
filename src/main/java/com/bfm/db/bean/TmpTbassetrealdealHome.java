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
 * Home object for domain model class TmpTbassetrealdeal.
 * @see com.bfm.db.bean.TmpTbassetrealdeal
 * @author Hibernate Tools
 */
public class TmpTbassetrealdealHome {

	private static final Log log = LogFactory
			.getLog(TmpTbassetrealdealHome.class);

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

	public void persist(TmpTbassetrealdeal transientInstance) {
		log.debug("persisting TmpTbassetrealdeal instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TmpTbassetrealdeal instance) {
		log.debug("attaching dirty TmpTbassetrealdeal instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TmpTbassetrealdeal instance) {
		log.debug("attaching clean TmpTbassetrealdeal instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TmpTbassetrealdeal persistentInstance) {
		log.debug("deleting TmpTbassetrealdeal instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TmpTbassetrealdeal merge(TmpTbassetrealdeal detachedInstance) {
		log.debug("merging TmpTbassetrealdeal instance");
		try {
			TmpTbassetrealdeal result = (TmpTbassetrealdeal) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TmpTbassetrealdeal findById(com.bfm.db.bean.TmpTbassetrealdealId id) {
		log.debug("getting TmpTbassetrealdeal instance with id: " + id);
		try {
			TmpTbassetrealdeal instance = (TmpTbassetrealdeal) sessionFactory
					.getCurrentSession().get(
							"com.bfm.db.bean.TmpTbassetrealdeal", id);
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

	public List findByExample(TmpTbassetrealdeal instance) {
		log.debug("finding TmpTbassetrealdeal instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.bfm.db.bean.TmpTbassetrealdeal")
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
