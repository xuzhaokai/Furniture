package com.onlinefurnitureshop.management.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.onlinefurnitureshop.management.model.Worker;
import com.onlinefurnitureshop.management.service.ManageService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author xuzhaokai
 *管理员登陆action
 */
public class ManageLoginAction extends ActionSupport{
	private ManageService manageService;
	private Worker worker;
	private String username;
	private String password;


	
	public ManageService getManageService() {
		return manageService;
	}

	public void setManageService(ManageService manageService) {
		this.manageService = manageService;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void validate(){
		String passwordMD5 = manageService.encoderByMd5(password);
		if(manageService.findByUserIdPwd(username, passwordMD5).isEmpty()){
			addActionError("用户名或密码错误");
		}else{
			worker = (Worker)manageService.findByUserIdPwd(username, passwordMD5).get(0);
			if(worker.getState()==0){
				addActionError("此用户已被冻结，请联系管理员!");			
				}
		}
	}
	
	public String execute() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String passwordMD5 = manageService.encoderByMd5(password);
		worker = (Worker)manageService.findByUserIdPwd(username, passwordMD5).get(0);
		System.out.println(worker.getUserName()+"---------------------------"+worker.getPassword());
		session.setAttribute("worker", worker);
		
//		Map left = manageService.manageLeft(worker);
//		session.setAttribute("title", left);
//		session.setAttribute("sub", left.keySet());
		return SUCCESS;
	}
}
