package com.onlinefurnitureshop.management.service;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import com.onlinefurnitureshop.management.model.Worker;


public interface ManageService {

	/**
	 * �����û���������
	 * @param name
	 * @param pwd
	 * @return
	 */
	public List findByUserIdPwd(Object name,Object pwd);
	
	/**
	 * ��һ���ַ���������MD5�������ܺ󷵻�һ�����ܺ���ַ���
	 * @param password
	 * @return
	 */
	public String encoderByMd5(String password);
	
//	/**
//	 * ͨ���������ҵ���ʵ��
//	 * @param name
//	 * @return
//	 */
//	public List findAreaByName(Object name);
//	
//	/**
//	 * ͨ��Division�������������зֵ�
//	 * @param className
//	 * @return
//	 */
//	public List findAllDivision(int theNum);
//	
//	/**
//	 * ͨ��Id���ҷֲ�ʵ��
//	 * @param objId
//	 * @return
//	 */
//	public Division findDivisionByObjId(Integer objId);
//	
//	/**
//	 * ͨ��Role�������������н�ɫ
//	 * @param className
//	 * @return
//	 */
//	public List findAllRole(int theNum);
//	
//	/**
//	 * ͨ��Id���ҽ�ɫʵ��
//	 * @param objId
//	 * @return
//	 */
//	public Role findRoleByObjId(Integer objId);
//	
//	/**
//	 * ͨ��Id���Һ�̨�û�ʵ��
//	 * @param objId
//	 * @return
//	 */
//	public User findUserByObjId(Integer objId);
//	
//	/**
//	 * ͨ��role��idֵ��ѯ��̨�û�
//	 * @param objId
//	 * @return
//	 */
//	public List findUserByRoleId(Integer objId);
//	
//	/**
//	 * ͨ��division��idֵ��ѯ��̨�û�
//	 * @param objId
//	 * @return
//	 */
//	public List findUserByDivisionId(Integer objId);
//	
//	/**
//	 * ͨ��userIdֵ��ѯ��̨�û�
//	 * @param objId
//	 * @return
//	 */
//	public List findUserByUserId(String objId);
//	
//	/**
//	 * ��ѯĳ���������ж���
//	 * @param objId
//	 * @return
//	 */
//	public List findOrderByArea(int theArea,int state);
//	
//	/**
//	 * ��ѯĳ����ĳҵ��Ա�����ж���
//	 * @param objId
//	 * @return
//	 */
//	public List findOrderByAreaByClerk(int theArea,int theClerk,int state);
//	
//	/**
//	 * ��ѯδ���͵Ķ���
//	 * @param state
//	 * @return
//	 */
//	public List findNotDelivererOrder(int theArea,int state);
//	
//	/**
//	 * ��ѯ�����еĶ���
//	 * @param state
//	 * @return
//	 */
//	public List findFinishDelivererOrder(int theArea,int theDeliverer,int state);
//	
//	/**
//	 * ͨ��id���Ҷ���
//	 * @param objId
//	 * @return
//	 */
//	public Order findOrderById(int objId);
//	
//	/**
//	 * ͨ��id���Ҳ�Ʒ
//	 * @param objId
//	 * @return
//	 */
//	public Product findProductById(int objId);
//	
//	/**
//	 * ����
//	 * @param entity
//	 */
//	public void update(Object entity);
//	
//	/**
//	 * ����
//	 * @param entity
//	 */
//	public void save(Object entity);
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
//	 * @return
//	 */
//	public Double statistics(String time1,String time2);
//	/**
//	 * ��ѯ�����ṩʱ����ڵ�Top���ʻ�
//	 * @param time1
//	 * @param time2
//	 * @return
//	 */
//	public List<Product>  findTopSellFlower(String time1,String time2);
//	/**
//	 * �����ṩʱ����ͳ�Ʒֵ����۽��
//	 * @param time1
//	 * @param time2
//	 * @param areaId
//	 * @return
//	 */
//	public List<Double> findDivisionOrderByTime(String time1,String time2,Integer areaId);
	/**
	 * ������ߵ�����
	 * @return
	 */
	public Map manageLeft(Worker worker);
		
}
