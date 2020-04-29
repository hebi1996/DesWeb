package com.xmh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xmh.entity.Admin;
import com.xmh.entity.User;

public interface UserMapper {
	
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
	User selectUserByUNAndPWD(@Param("username")String username, @Param("password")String password);
	
	/**
	 * ����Ա��¼�ж�
	 * @param username
	 * @param password
	 * @return
	 */
	Admin selectAdminByUNAndPWD(@Param("username")String username, @Param("password")String password);

	/**
	 * ��ѯ�����û�
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
	boolean deleteUser(@Param("id")Integer id);
	
	/**
	 * ��ӹ���Ա
	 * @param admin
	 * @return
	 */
	boolean adminAddAdmin(Admin admin);

	/**
	 * ɾ������Ա
	 * @param id
	 * @return
	 */
	boolean admindeleteAdmin(@Param("id")Integer id);

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
	User userInfoByUserId(@Param("userId")Integer userId);
	
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
	Admin selectAdminByUserIdAndOldPwd(@Param("id")Integer userId,@Param("oldPwd")String oldPassword);

	/**
	 * �޸�����
	 * @param userId
	 * @return
	 */
	boolean changeAdminPwd(@Param("id")Integer userId, @Param("newPwd")String newPassword);

	/**
	 * �û��޸�����ʱ��ѯԭ�����Ƿ���ȷ
	 * @param userId
	 * @param oldPassword
	 * @return
	 */
	User selectUserByUserIdAndOldPwd(@Param("id")Integer userId, @Param("oldPwd")String oldPassword);

	/**
	 * �û��޸�����
	 * @param userId
	 * @param newPassword
	 * @return
	 */
	boolean changeUserPwd(@Param("id")Integer userId, @Param("newPwd")String newPassword);

	/**
	 * ��ҳ��ѯ�����û�
	 * @param i
	 * @param size
	 * @return
	 */
	List<User> selectAllUserByPage(@Param("page")Integer page, @Param("size")Integer size);

}
