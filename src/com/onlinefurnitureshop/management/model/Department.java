package com.onlinefurnitureshop.management.model;


/**
 * @author xuzhaokai
 *  ����ʵ��
 */
public class Department  implements java.io.Serializable {

	private Integer departmentId;
	private String departmentName;
	private String departmentdsp;
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentdsp() {
		return departmentdsp;
	}
	public void setDepartmentdsp(String departmentdsp) {
		this.departmentdsp = departmentdsp;
	}
	
	
}
