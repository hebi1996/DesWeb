package com.xmh.service;

import java.util.List;

import com.xmh.entity.Admin;
import com.xmh.entity.User;
import com.xmh.utils.PageHelper;

public interface UserService {
	
	/**
	 * 注册用户
	 * @param user
	 * @return 
	 */
	boolean addUser(User user);
	
	/**
	 * 用户登录判断
	 * @param username
	 * @param password
	 * @return
	 */
	User selectUserByUNAndPWD(String username, String password);
	
	/**
	 * 管理员登录
	 * @param username
	 * @param password
	 * @return
	 */
	Admin selectAdminByUNAndPWD(String username, String password);
	
	/**
	 * 查询所有用户并显示
	 * @return
	 */
	List<User> selectAllUser();
	
	/**
	 * 管理员修改用户信息
	 * @param user
	 * @return
	 */
	boolean updateUserInfo(User user);
	
	/**
	 * 管理员新增用户
	 * @param user
	 * @return
	 */
	boolean adminAddUser(User user);
	
	/**
	 * 管理员删除用户
	 * @param id
	 * @return
	 */
	boolean deleteUser(Integer id);
	
	/**
	 * 添加管理员
	 * @param admin
	 * @return
	 */
	boolean adminAddAdmin(Admin admin);
	
	/**
	 * 删除管理员账户
	 * @param id
	 * @return
	 */
	boolean admindeleteAdmin(Integer id);
	
	/**
	 * 显示所有管理员
	 * @return
	 */
	List<Admin> selectAddAdmin();
	
	/**
	 * 用户显示自己信息
	 * @param userId
	 * @return
	 */
	User userInfoByUserId(Integer userId);
	
	/**
	 * 用户修改个人信息
	 * @param user
	 * @return
	 */
	boolean editUserInfo(User user);
	
	/**
	 * 管理员修改密码时查询原密码是否正确
	 * @param userId
	 * @return
	 */
	Admin selectAdminByUserId(Integer userId, String oldPassword);

	/**
	 * 管理员修改密码
	 * @param userId
	 * @return
	 */
	boolean changeAdminPwd(Integer userId, String newPassword);

	/**
	 * 用户修改密码时查询原密码是否正确
	 * @param userId
	 * @param oldPassword
	 * @return
	 */
	User selectUserByUserIdAndOldPwd(Integer userId, String oldPassword);

	/**
	 * 用户修改密码
	 * @param userId
	 * @param newPassword
	 * @return
	 */
	boolean changeUserPwd(Integer userId, String newPassword);

	/**
	 * 分页显示所有用户
	 * @param page
	 * @return
	 */
	PageHelper<User> selectAllUserByPage(Integer page);

}
