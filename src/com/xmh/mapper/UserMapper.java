package com.xmh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xmh.entity.Admin;
import com.xmh.entity.User;

public interface UserMapper {
	
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
	User selectUserByUNAndPWD(@Param("username")String username, @Param("password")String password);
	
	/**
	 * 管理员登录判断
	 * @param username
	 * @param password
	 * @return
	 */
	Admin selectAdminByUNAndPWD(@Param("username")String username, @Param("password")String password);

	/**
	 * 查询所有用户
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
	boolean deleteUser(@Param("id")Integer id);
	
	/**
	 * 添加管理员
	 * @param admin
	 * @return
	 */
	boolean adminAddAdmin(Admin admin);

	/**
	 * 删除管理员
	 * @param id
	 * @return
	 */
	boolean admindeleteAdmin(@Param("id")Integer id);

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
	User userInfoByUserId(@Param("userId")Integer userId);
	
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
	Admin selectAdminByUserIdAndOldPwd(@Param("id")Integer userId,@Param("oldPwd")String oldPassword);

	/**
	 * 修改密码
	 * @param userId
	 * @return
	 */
	boolean changeAdminPwd(@Param("id")Integer userId, @Param("newPwd")String newPassword);

	/**
	 * 用户修改密码时查询原密码是否正确
	 * @param userId
	 * @param oldPassword
	 * @return
	 */
	User selectUserByUserIdAndOldPwd(@Param("id")Integer userId, @Param("oldPwd")String oldPassword);

	/**
	 * 用户修改密码
	 * @param userId
	 * @param newPassword
	 * @return
	 */
	boolean changeUserPwd(@Param("id")Integer userId, @Param("newPwd")String newPassword);

	/**
	 * 分页查询所有用户
	 * @param i
	 * @param size
	 * @return
	 */
	List<User> selectAllUserByPage(@Param("page")Integer page, @Param("size")Integer size);

}
