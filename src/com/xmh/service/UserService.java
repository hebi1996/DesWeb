package com.xmh.service;

import java.util.List;

import com.xmh.entity.Admin;
import com.xmh.entity.User;
import com.xmh.utils.PageHelper;

public interface UserService {
	
	/**
	 * ע���û�
	 * @param user
	 * @return 
	 */
	boolean addUser(User user);
	
	/**
	 * �û���¼�ж�
	 * @param username
	 * @param password
	 * @return
	 */
	User selectUserByUNAndPWD(String username, String password);
	
	/**
	 * ����Ա��¼
	 * @param username
	 * @param password
	 * @return
	 */
	Admin selectAdminByUNAndPWD(String username, String password);
	
	/**
	 * ��ѯ�����û�����ʾ
	 * @return
	 */
	List<User> selectAllUser();
	
	/**
	 * ����Ա�޸��û���Ϣ
	 * @param user
	 * @return
	 */
	boolean updateUserInfo(User user);
	
	/**
	 * ����Ա�����û�
	 * @param user
	 * @return
	 */
	boolean adminAddUser(User user);
	
	/**
	 * ����Աɾ���û�
	 * @param id
	 * @return
	 */
	boolean deleteUser(Integer id);
	
	/**
	 * ��ӹ���Ա
	 * @param admin
	 * @return
	 */
	boolean adminAddAdmin(Admin admin);
	
	/**
	 * ɾ������Ա�˻�
	 * @param id
	 * @return
	 */
	boolean admindeleteAdmin(Integer id);
	
	/**
	 * ��ʾ���й���Ա
	 * @return
	 */
	List<Admin> selectAddAdmin();
	
	/**
	 * �û���ʾ�Լ���Ϣ
	 * @param userId
	 * @return
	 */
	User userInfoByUserId(Integer userId);
	
	/**
	 * �û��޸ĸ�����Ϣ
	 * @param user
	 * @return
	 */
	boolean editUserInfo(User user);
	
	/**
	 * ����Ա�޸�����ʱ��ѯԭ�����Ƿ���ȷ
	 * @param userId
	 * @return
	 */
	Admin selectAdminByUserId(Integer userId, String oldPassword);

	/**
	 * ����Ա�޸�����
	 * @param userId
	 * @return
	 */
	boolean changeAdminPwd(Integer userId, String newPassword);

	/**
	 * �û��޸�����ʱ��ѯԭ�����Ƿ���ȷ
	 * @param userId
	 * @param oldPassword
	 * @return
	 */
	User selectUserByUserIdAndOldPwd(Integer userId, String oldPassword);

	/**
	 * �û��޸�����
	 * @param userId
	 * @param newPassword
	 * @return
	 */
	boolean changeUserPwd(Integer userId, String newPassword);

	/**
	 * ��ҳ��ʾ�����û�
	 * @param page
	 * @return
	 */
	PageHelper<User> selectAllUserByPage(Integer page);

}
