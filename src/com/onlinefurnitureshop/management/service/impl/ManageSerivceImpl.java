package com.onlinefurnitureshop.management.service.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.onlinefurnitureshop.management.dao.ManageDAO;
import com.onlinefurnitureshop.management.model.Worker;
import com.onlinefurnitureshop.management.service.ManageService;


public class ManageSerivceImpl implements ManageService{
	public static final String userClassName = "Worker";
	public static final String UserClassName = "com.onlinefurnitureshop.management.model.Worker";
	public static final String userId = "workerId";
	public static final String userName = "userName";
	public static final String password = "password";
//	public static final String theDivision = "theDivision";
//	public static final String theRole = "theRole";
//	public static final String theCustomerType = "theCustomerType";
//	public static final String areaClassName = "Area";
//	public static final String areaName = "name";
//	public static final String divisionClassName = "com.onlineflowershop.management.model.Division";
//	public static final String DivisionClassName = "Division";
//	public static final String roleClassName = "com.onlineflowershop.management.model.Role";
//	public static final String orderClassName = "Order";
//	public static final String OrderClassName = "com.onlineflowershop.order.model.Order";
//	public static final String orderState = "orderState";
//	public static final String RoleClassName = "Role";
//	public static final String ProductClassName = "com.onlineflowershop.product.model.Product";
	
	private ManageDAO manageDao;

	public void setManageDao(ManageDAO manageDao) {
		this.manageDao = manageDao;
	}
	
	/**
	 * �����û���������
	 * @param name
	 * @param pwd
	 * @return
	 */
	public List findByUserIdPwd(Object name,Object pwd){
		List results = manageDao.findByTwoProperty(userClassName,userName,password,name,pwd);
		return results;
	}
	
	/**
	 *��һ���ַ���������MD5�������ܺ󷵻�һ�����ܺ���ַ���
	 */
	public String encoderByMd5(String password){
		String resultString = null;
		resultString = new String(password);
		MessageDigest md;// ��ϢժҪ
		try
		{
			md = MessageDigest.getInstance("MD5");// ʵ����
			md.update(password.getBytes());
			byte[] digest = md.digest();
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < digest.length; i++)
			{
				sb.append(Integer.toHexString(((int) digest[i]) & 0xFF));
			}
			resultString = sb.toString();
		} catch (NoSuchAlgorithmException e)
		{
			e.printStackTrace();
		}
		return resultString;
	}
	
	
//	/**
//	 * ͨ���������ҵ���ʵ��
//	 * @param name
//	 * @return
//	 */
//	public List findAreaByName(Object name){
//		List results = manageDao.findByOneProperty(areaClassName,areaName,name);
//		return results;
//	}
//	
//	/**
//	 * ͨ��Division�������������зֵ�
//	 * @param className
//	 * @return
//	 */
//	public List findAllDivision(int theNum){
//		List results = manageDao.findAllTemplateByClassName(DivisionClassName,theNum);
//		return results;
//	}
//	
//	/**
//	 * ͨ��Id���ҷֲ�ʵ��
//	 * @param objId
//	 * @return
//	 */
//	public Division findDivisionByObjId(Integer objId){
//		Division division = (Division)manageDao.findTemplateByid(divisionClassName, objId);
//		return division;
//	}
//	
//	/**
//	 * ͨ��Role�������������н�ɫ
//	 * @param className
//	 * @return
//	 */
//	public List findAllRole(int theNum){
//		List results = manageDao.findAllTemplateByClassName(RoleClassName,theNum);
//		return results;
//	}
//	
//	/**
//	 * ͨ��Id���ҽ�ɫʵ��
//	 * @param objId
//	 * @return
//	 */
//	public Role findRoleByObjId(Integer objId){
//		Role role = (Role)manageDao.findTemplateByid(roleClassName, objId);
//		return role;
//	}
//	
//	/**
//	 * ͨ��Id���Һ�̨�û�ʵ��
//	 * @param objId
//	 * @return
//	 */
//	public User findUserByObjId(Integer objId){
//		User user = (User)manageDao.findTemplateByid(UserClassName, objId);
//		return user;
//	}
//	
//	/**
//	 * ͨ��role��idֵ��ѯ��̨�û�
//	 * @param objId
//	 * @return
//	 */
//	public List findUserByRoleId(Integer objId){
//		List list = manageDao.findByOneProperty(userClassName, theRole, objId);
//		return list;
//	}
//	
//	/**
//	 * ͨ��division��idֵ��ѯ��̨�û�
//	 * @param objId
//	 * @return
//	 */
//	public List findUserByDivisionId(Integer objId){
//		List list = manageDao.findByOneProperty(userClassName, theDivision, objId);
//		return list;
//	}
//	
//	/**
//	 * ͨ��userIdֵ��ѯ��̨�û�
//	 * @param objId
//	 * @return
//	 */
//	public List findUserByUserId(String objId){
//		List list = manageDao.findByOneProperty(userClassName, userId, objId);
//		return list;
//	}
//	
//	/**
//	 * ��ѯĳ���������ж���
//	 * @param objId
//	 * @return
//	 */
//	public List findOrderByArea(int theArea,int state){
//		List list = manageDao.findByTwoProperty(orderClassName, "theConsignee.theArea", orderState, theArea, state);
//		return list;
//	}
//	
//
//	/**
//	 * ��ѯĳ����ĳҵ��Ա�����ж���
//	 * @param objId
//	 * @return
//	 */
//	public List findOrderByAreaByClerk(int theArea,int theClerk,int state){
//		List list = manageDao.findByThreeProperty(orderClassName, "theConsignee.theArea", "theClerk", orderState, theArea, theClerk, state);
//		return list;
//	}
//	
//	/**
//	 * ��ѯδ���͵Ķ���
//	 * @param state
//	 * @return
//	 */
//	public List findNotDelivererOrder(int theArea,int state){
//		List list = manageDao.findByTwoProperty(orderClassName, "theConsignee.theArea", orderState, theArea, state);
//		return list;
//	}
//	
//	/**
//	 * ��ѯ�����еĶ���
//	 * @param state
//	 * @return
//	 */
//	public List findFinishDelivererOrder(int theArea,int theDeliverer,int state){
//		List list = manageDao.findByThreeProperty(orderClassName, "theConsignee.theArea", "theDeliverer", orderState, theArea, theDeliverer, state);
//		return list;
//	}
//	
//	/**
//	 * ͨ��id���Ҷ���
//	 * @param objId
//	 * @return
//	 */
//	public Order findOrderById(int objId){
//		Order order = (Order)manageDao.findTemplateByid(OrderClassName, objId);
//		return order;
//	}
//	
//	/**
//	 * ͨ��id���Ҳ�Ʒ
//	 * @param objId
//	 * @return
//	 */
//	public Product findProductById(int objId){
//		Product product = (Product)manageDao.findTemplateByid(ProductClassName, objId);
//		return product;
//	}
//	
//	/**
//	 * ����
//	 * @param entity
//	 */
//	public void update(Object entity){
//		manageDao.update(entity);
//	}
//	
//	/**
//	 * ����
//	 * @param entity
//	 */
//	public void save(Object entity){
//		manageDao.save(entity);
//	}
//	
//	/**
//	 * ɾ��
//	 * @param entity
//	 */
//	public void delete(Object entity){
//		manageDao.delete(entity);
//	}
//	/**
//	 * �����ṩʱ��Ƚ�֧��ʱ����ͳ�����۽��
//	 * @param time1
//	 * @param time2
//	 * @return
//	 */
//	public Double statistics(String time1,String time2){		
//		Double amount = manageDao.statistics(time1, time2).get(0);
//		return amount;
//	}	
//	/**
//	 * ��ѯ�����ṩʱ����ڵ�Top���ʻ�
//	 * @param time1
//	 * @param time2
//	 * @return
//	 */
//	public List  findTopSellFlower(String time1,String time2){
//		List<Product> product = manageDao.findTopSellFlower(time1,time2);
//		return product;
//	} 
//	/**
//	 * �����ṩʱ����ͳ�Ʒֵ����۽��
//	 * @param time1
//	 * @param time2
//	 * @param areaId
//	 * @return
//	 */
//	public List<Double> findDivisionOrderByTime(String time1,String time2,Integer areaId){
//		List<Double> amount = manageDao.findDivisionOrderByTime(time1, time2, areaId);
//		return amount;
//	}
//	
//	
	/**
	 * ������ߵ�����
	 * @return
	 */
	public Map manageLeft(Worker worker){
		Map left =  new LinkedHashMap();
		String title;                                            //����
//		LeftInfo leftInfo;                                      //�ӷ�����Ϣ��  
//		List<LeftInfo> subList;                                 //�����µ��ӷ�������
//		String roleName = user.getTheRole().getName().trim();
//		if(roleName.equals("�ܾ���")){
//			//��һ������
//			title = "�ֵ����";
//			subList = new ArrayList<LeftInfo>();
//			
//			leftInfo = new LeftInfo();
//			leftInfo.setName("���ӷֵ�");
//			leftInfo.setUrl("manage/manage_jsp/general_manager/manage_addBranch.jsp");
//			subList.add(leftInfo);
//			
//			leftInfo = new LeftInfo();
//			leftInfo.setName("�޸ķֵ�");
//			leftInfo.setUrl("manage/manage_jsp/general_manager/manage_updateBranch.jsp");
//			subList.add(leftInfo);
//						
//			left.put(title, subList);
//			
//			//�ڶ�������
//			title = "��Ʒά��";
//			subList = new ArrayList<LeftInfo>();
//			leftInfo = new LeftInfo();
//			leftInfo.setName("��Ӳ�Ʒ");
//			leftInfo.setUrl("manage/manage_jsp/general_manager/manage_addProduct.jsp");
//			subList.add(leftInfo);			
//						
//			leftInfo = new LeftInfo();
//			leftInfo.setName("�޸Ĳ�Ʒ");
//			leftInfo.setUrl("manage/manage_jsp/general_manager/manage_listProduct.jsp");
//			subList.add(leftInfo);
//			
//			leftInfo = new LeftInfo();
//			leftInfo.setName("��ӷ���");
//			leftInfo.setUrl("manage/manage_jsp/general_manager/manage_addProductType.jsp");
//			subList.add(leftInfo);
//			
//			leftInfo = new LeftInfo();
//			leftInfo.setName("���з���");
//			leftInfo.setUrl("manage/manage_jsp/general_manager/manage_listProductType.jsp");
//			subList.add(leftInfo);
//			
//			left.put(title, subList);
//			
//			//����������
//			title = "�û�����";
//			subList = new ArrayList<LeftInfo>();
//			leftInfo = new LeftInfo();
//			leftInfo.setName("���Ӻ�̨��Ա");
//			leftInfo.setUrl("manage/manage_jsp/general_local_manager/manage_addUser.jsp");
//			subList.add(leftInfo);
//			
//			leftInfo = new LeftInfo();
//			leftInfo.setName("���к�̨��Ա");
//			leftInfo.setUrl("manage/manage_jsp/general_manager/manage_listUser.jsp");
//			subList.add(leftInfo);
//			
//			left.put(title, subList);
//			
//			//���ĸ�����
//			title = "�������Ϲ���";
//			subList = new ArrayList<LeftInfo>();
//			leftInfo = new LeftInfo();
//			leftInfo.setName("�޸ĵ�¼����");
//			leftInfo.setUrl("manage/manage_jsp/manage_changePassword.jsp");
//			subList.add(leftInfo);
//			
//			leftInfo = new LeftInfo();
//			leftInfo.setName("�޸ĸ�����Ϣ");
//			leftInfo.setUrl("manage/manage_jsp/updateUserInfo.jsp");
//			subList.add(leftInfo);
//			
//			left.put(title, subList);
//			
//			//���������
//			title = "ͳ��ҵ��";
//			subList = new ArrayList<LeftInfo>();
//			leftInfo = new LeftInfo();
//			leftInfo.setName("��ҵ��ͳ��");
//			leftInfo.setUrl("manage/manage_jsp/general_local_manager/manage_statistics.jsp");
//			subList.add(leftInfo);
//			
//			left.put(title, subList);
			
//		}
		
//		if(roleName.equals("��������")){
//			//��һ������
//			title = "�û�����";
//			subList = new ArrayList<LeftInfo>();
//			leftInfo = new LeftInfo();
//			leftInfo.setName("���ӱ�����Ա");
//			leftInfo.setUrl("manage/manage_jsp/general_local_manager/manage_addUser.jsp");
//			subList.add(leftInfo);
//			
//			leftInfo = new LeftInfo();
//			leftInfo.setName("����������Ա");
//			leftInfo.setUrl("manage/manage_jsp/general_local_manager/manage_listUser.jsp");
//			subList.add(leftInfo);
//			
//			left.put(title, subList);
			
//			//�ڶ�������
//			title = "�������Ϲ���";
//			subList = new ArrayList<LeftInfo>();
//			leftInfo = new LeftInfo();
//			leftInfo.setName("�޸ĵ�¼����");
//			leftInfo.setUrl("manage/manage_jsp/manage_changePassword.jsp");
//			subList.add(leftInfo);
//			
//			leftInfo = new LeftInfo();
//			leftInfo.setName("�޸ĸ�����Ϣ");
//			leftInfo.setUrl("manage/manage_jsp/updateUserInfo.jsp");
//			subList.add(leftInfo);
//			
//			left.put(title, subList);
			
//			//����������
//			title = "ͳ��ҵ��";
//			subList = new ArrayList<LeftInfo>();
//			leftInfo = new LeftInfo();
//			leftInfo.setName("�ֵ�ҵ��ͳ��");
//			leftInfo.setUrl("manage/manage_jsp/general_local_manager/manage_statistics.jsp");
//			subList.add(leftInfo);
//			
//			left.put(title, subList);
//		}
		
//		if(roleName.equals("ҵ��Ա")){						
//			//��һ������
//			title = "�������Ϲ���";
//			subList = new ArrayList<LeftInfo>();
//			leftInfo = new LeftInfo();
//			leftInfo.setName("�޸ĵ�¼����");
//			leftInfo.setUrl("manage/manage_jsp/manage_changePassword.jsp");
//			subList.add(leftInfo);
//			
//			leftInfo = new LeftInfo();
//			leftInfo.setName("�޸ĸ�����Ϣ");
//			leftInfo.setUrl("manage/manage_jsp/updateUserInfo.jsp");
//			subList.add(leftInfo);
//			
//			left.put(title, subList);
			
//			//�ڶ�������
//			title = "��������";
//			subList = new ArrayList<LeftInfo>();
//			leftInfo = new LeftInfo();
//			leftInfo.setName("��������");
//			leftInfo.setUrl("manage/manage_jsp/general_local_manager/manage_sendProduction.jsp");
//			subList.add(leftInfo);
//			
//			leftInfo = new LeftInfo();
//			leftInfo.setName("��������");
//			leftInfo.setUrl("manage/manage_jsp/general_local_manager/manage_finishProduction.jsp");
//			subList.add(leftInfo);
//			
//			left.put(title, subList);
//		}
		
//		if(roleName.equals("����Ա")){	
//			//��һ������
//			title = "��������";
//			subList = new ArrayList<LeftInfo>();
//			leftInfo = new LeftInfo();
//			leftInfo.setName("���Ͷ���");
//			leftInfo.setUrl("manage/manage_jsp/deliverer_manager/manage_notDeliverer.jsp");
//			subList.add(leftInfo);
//			
//			leftInfo = new LeftInfo();
//			leftInfo.setName("�������");
//			leftInfo.setUrl("manage/manage_jsp/deliverer_manager/manage_finishDeliverer.jsp");
//			subList.add(leftInfo);
//			
//			left.put(title, subList);
			
//			//�ڶ�������
//			title = "�������Ϲ���";
//			subList = new ArrayList<LeftInfo>();
//			leftInfo = new LeftInfo();
//			leftInfo.setName("�޸ĵ�¼����");
//			leftInfo.setUrl("manage/manage_jsp/manage_changePassword.jsp");
//			subList.add(leftInfo);
//			
//			leftInfo = new LeftInfo();
//			leftInfo.setName("�޸ĸ�����Ϣ");
//			leftInfo.setUrl("manage/manage_jsp/updateUserInfo.jsp");
//			subList.add(leftInfo);
//			
//			left.put(title, subList);
//			
//			
//		}
		return left;
	}

	
}
