package com.dataService.dataService.service;

import java.util.List;

import com.dataService.dataService.entity.Entity;

/**
 *
 * 项目名称：dataService 类名称：CityESService 类描述： 创建人：john 创建时间：2018年8月12日 下午10:45:00
 * 修改人：john 修改时间：2018年8月12日 下午10:45:00 修改备注：
 * 
 * @version
 *
 */
public interface CityESService {
	void saveEntity(Entity entity);

	void saveEntity(List<Entity> entityList);

	List<Entity> searchEntity(String searchContent);

}
