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
 * Home object for domain model class TmpTbbankrealdeal.
 * @see com.bfm.db.bean.TmpTbbankrealdeal
 * @author Hibernate Tools
 */
public class TmpTbbankrealdealHome {

	private static final Log log = LogFactory
			.getLog(TmpTbbankrealdealHome.class);

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

	public void persist(TmpTbbankrealdeal transientInstance) {
		log.debug("persisting TmpTbbankrealdeal instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TmpTbbankrealdeal instance) {
		log.debug("attaching dirty TmpTbbankrealdeal instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TmpTbbankrealdeal instance) {
		log.debug("attaching clean TmpTbbankrealdeal instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TmpTbbankrealdeal persistentInstance) {
		log.debug("deleting TmpTbbankrealdeal instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TmpTbbankrealdeal merge(TmpTbbankrealdeal detachedInstance) {
		log.debug("merging TmpTbbankrealdeal instance");
		try {
			TmpTbbankrealdeal result = (TmpTbbankrealdeal) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TmpTbbankrealdeal findById(com.bfm.db.bean.TmpTbbankrealdealId id) {
		log.debug("getting TmpTbbankrealdeal instance with id: " + id);
		try {
			TmpTbbankrealdeal instance = (TmpTbbankrealdeal) sessionFactory
					.getCurrentSession().get(
							"com.bfm.db.bean.TmpTbbankrealdeal", id);
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

	public List findByExample(TmpTbbankrealdeal instance) {
		log.debug("finding TmpTbbankrealdeal instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.bfm.db.bean.TmpTbbankrealdeal")
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
