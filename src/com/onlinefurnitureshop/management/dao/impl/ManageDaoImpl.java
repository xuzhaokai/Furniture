package com.onlinefurnitureshop.management.dao.impl;


import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.onlinefurnitureshop.management.dao.ManageDAO;


public class ManageDaoImpl extends HibernateDaoSupport implements ManageDAO{
	private static final Log log = LogFactory.getLog(ManageDaoImpl.class);
	
	/**
	 * ͨ��������������ʵ��
	 * @param className
	 * @return
	 */
	public List findAllTemplateByClassName(String className,Integer beginNum){
		String queryString ="From " + className + " as model where model.objId>=" + beginNum;
		List list = getHibernateTemplate().find(queryString);
		return list;
	}
	
	/**
	 * ͨ��Id����ʵ��
	 * @param className
	 * @param objId
	 * @return
	 */
	public Object findTemplateByid(String className,Integer objId){
		Object object = getHibernateTemplate().get(className,objId);
		return object;
	}
	
	
//	/**
//	 * �ṩһ���ֶμ��ֶ�ֵ������List
//	 */
//	public List findByOneProperty(String className,String property,Object value){
//		String queryString = "From " + className + " as model where model." + property
//		+ "= '" + value + "'";
//		List results = getHibernateTemplate().find(queryString);
//		return results;
//	}
//	
	/**
	 * �ṩ�����ֶμ��ֶ�ֵ������List
	 */
	public List findByTwoProperty(String className,String property1,String property2,Object value1,Object value2){
		String queryString = "From " + className + " as model where model." + property1
		+ " = '" + value1 + "' and model." + property2 + " = '" + value2 + "'";
		List results = getHibernateTemplate().find(queryString);
		return results;
	}
//	
//	/**
//	 * �ṩ�����ֶμ��ֶ�ֵ������List
//	 */
//	public List findByThreeProperty(String className,String property1,String property2,String property3,Object value1,Object value2,Object value3){
//		String queryString = "From " + className + " as model where model." + property1
//		+ " = '" + value1 + "' and model." + property2 + " = '" + value2 + "' and model." + property3 + " = '" + value3 + "'";
//		List results = getHibernateTemplate().find(queryString);
//		return results;
//	}
//	
//	/**
//	 * ����
//	 * @param entity
//	 */
//	public void save(Object entity){
//		getHibernateTemplate().merge(entity);
//	}
//	
//	/**
//	 * ����
//	 * @param entity
//	 */
//	public void update(Object entity){
//		getHibernateTemplate().merge(entity);
//	}
//	
//	/**
//	 * ɾ��
//	 * @param entity
//	 */
//	public void delete(Object entity){
//		getHibernateTemplate().delete(entity);
//	}
//	
//	/**
//	 * �����ṩʱ��Ƚ�֧��ʱ����ͳ�����۽��
//	 * @param time1
//	 * @param time2
//	 */
//	public List<Double> statistics(String time1,String time2){
//		String querystring = "select sum(amount) from [payment] where convert(varchar(10),transTime,111)>='"+time1+"' and convert(varchar(10),transTime,111)<'"+time2+"' and paymentState=1;";
//		List<Double> amount = this.getSession().createSQLQuery(querystring).list();
//		return amount;
//	}
//	/**
//	 * ��ѯ�����ṩʱ����ڵ�Top���ʻ�
//	 * @param time1
//	 * @param time2
//	 * @return
//	 */
//	public List  findTopSellFlower(String time1,String time2){
//		String querystring1 = "select top 1 theproduct from [order] where orderstate>=2 and convert(varchar(10),ordertime,111)>='"+time1+"' and convert(varchar(10),ordertime,111)<'"+time2+"' group by theproduct order by count(theproduct)desc;";
//		List<Integer> productId = this.getSession().createSQLQuery(querystring1).list();
//		List theProduct=null;
//		if(!productId.isEmpty()){
//			String querystring2 = "from Product as model where model.objId="+productId.get(0);
//			theProduct = getHibernateTemplate().find(querystring2);
//		}
//		return theProduct;
//	} 
//	/**
//	 * �����ṩʱ����ͳ�Ʒֵ����۽��
//	 * @param time1
//	 * @param time2
//	 * @param areaId
//	 * @return
//	 */
//	public List<Double> findDivisionOrderByTime(String time1,String time2,Integer areaId){
//		String queryString = "select sum(model.amt) from Order as model where convert(varchar(10),model.orderTime,111)>='"+time1+"' and convert(varchar(10),model.orderTime,111)<'"+time2+"' and model.orderState>=2 and model.theConsignee.theArea="+areaId;
//		List<Double> amount = getHibernateTemplate().find(queryString);
//		return amount;
//	}
}
