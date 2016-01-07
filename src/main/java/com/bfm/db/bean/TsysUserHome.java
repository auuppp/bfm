package com.bfm.db.bean;

// Generated 2015-11-18 13:54:13 by Hibernate Tools 4.0.0

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.criterion.Example;
import org.hibernate.Session;

import com.bfm.utilities.HibernateUtil;

/**
 * Home object for domain model class TsysUser.
 * @see com.bfm.db.bean.TsysUser
 * @author Hibernate Tools
 */
public class TsysUserHome {

	private static final Log log = LogFactory.getLog(TsysUserHome.class);

	public void persist(TsysUser transientInstance) {
		log.debug("persisting TsysUser instance");
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TsysUser instance) {
		log.debug("attaching dirty TsysUser instance");
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	@SuppressWarnings("deprecation")
	public void attachClean(TsysUser instance) {
		log.debug("attaching clean TsysUser instance");
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TsysUser persistentInstance) {
		log.debug("deleting TsysUser instance");
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TsysUser merge(TsysUser detachedInstance) {
		log.debug("merging TsysUser instance");
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			TsysUser result = (TsysUser) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TsysUser findById(String id) {
		log.debug("getting TsysUser instance with id: " + id);
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			TsysUser instance = (TsysUser) session.get("com.bfm.db.bean.TsysUser", id);
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

	public List findByExample(TsysUser instance) {
		log.debug("finding TsysUser instance by example");
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			List results = session.createCriteria("com.bfm.db.bean.TsysUser")
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
