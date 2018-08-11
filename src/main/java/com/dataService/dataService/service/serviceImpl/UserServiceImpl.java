package com.dataService.dataService.service.serviceImpl;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dataService.dataService.entity.User;
import com.dataService.dataService.mapper.UserMapper;
import com.dataService.dataService.service.UserService;

/**
*
* 项目名称：spring-web
* 类名称：UserServiceImpl
* 类描述：
* 创建人：john
* 创建时间：2018年7月28日 上午11:53:16
* 修改人：john
* 修改时间：2018年7月28日 上午11:53:16
* 修改备注：
* @version
*
*/
@Service
public class UserServiceImpl  implements  UserService{
  private static Logger logger =LoggerFactory.getLogger(UserServiceImpl.class);


	@Autowired
	private UserMapper userMapper;
	
	
	@Transactional
	public int inserUser(User user) {
		return userMapper.insertUser(user);
	}

	public User selectUserById(Integer id) {
		User user=userMapper.selectUserById(id);
		System.out.println("根据用户ID>>"+id+"查询的用户信息>>>>>."+user);
		return user;
	}

	
	public int updateUser(User user) {
		return 0;
	}

	
	public String getUser() {
		return null;
	}

	
	
	

}
