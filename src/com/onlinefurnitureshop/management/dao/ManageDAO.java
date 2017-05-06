package com.onlinefurnitureshop.management.dao;


import java.util.List;


public interface ManageDAO {
	
	/**
	 * ͨ��������������ʵ��
	 * @param className
	 * @return
	 */
	public List findAllTemplateByClassName(String className,Integer beginNum);
	
	/**
	 * ͨ��Id����ʵ��
	 * @param className
	 * @param objId
	 * @return
	 */
	public Object findTemplateByid(String className,Integer objId);
	
//	/**
//	 * �ṩһ���ֶμ��ֶ�ֵ������List
//	 * @param property
//	 * @param value
//	 * @return
//	 */
//	public List findByOneProperty(String className,String property,Object value);
//	
	/**
	 * �ṩ�����ֶμ��ֶ�ֵ������List
	 */
	public List findByTwoProperty(String className,String property1,String property2,Object value1,Object value2);
	
//	/**
//	 * �ṩ�����ֶμ��ֶ�ֵ������List
//	 */
//	public List findByThreeProperty(String className,String property1,String property2,String property3,Object value1,Object value2,Object value3);
//	
//	/**
//	 * ����
//	 * @param entity
//	 */
//	public void save(Object entity);
//	
//	/**
//	 * ����
//	 * @param entity
//	 */
//	public void update(Object entity);
//	
//	/**
//	 * ɾ��
//	 * @param entity
//	 */
//	public void delete(Object entity);
//
//	/**
//	 * �����ṩʱ��Ƚ�֧��ʱ����ͳ�����۽��
//	 * @param time1
//	 * @param time2
//	 */
//	public List<Double> statistics(String time1,String time2);
//	/**
//	 * ��ѯ�����ṩʱ����ڵ�Top���ʻ�
//	 * @param time1
//	 * @param time2
//	 * @return
//	 */
//	public List  findTopSellFlower(String time1,String time2);
//	/**
//	 * �����ṩʱ����ͳ�Ʒֵ����۽��
//	 * @param time1
//	 * @param time2
//	 * @param areaId
//	 * @return
//	 */
//	public List<Double> findDivisionOrderByTime(String time1,String time2,Integer areaId);

}
