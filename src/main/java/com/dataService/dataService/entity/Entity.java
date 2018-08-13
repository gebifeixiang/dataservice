package com.dataService.dataService.entity;

import java.io.Serializable;

/**
*
* 项目名称：dataService
* 类名称：Entity
* 类描述：
* 创建人：john
* 创建时间：2018年8月12日 下午10:43:51
* 修改人：john
* 修改时间：2018年8月12日 下午10:43:51
* 修改备注：
* @version
*
*/
public class Entity implements Serializable {
	
		 
		private static final long serialVersionUID = -763638353551774166L;
		
		public static final String INDEX_NAME = "index_entity";
		
		public static final String TYPE = "tstype";
	 
		private Long id;
		
		private String name;
		
		public Entity() {
			super();
		}
		
		public Entity(Long id, String name) {
			this.id = id;
			this.name = name;
		}
	 
		public Long getId() {
			return id;
		}
	 
		public void setId(Long id) {
			this.id = id;
		}
	 
		public String getName() {
			return name;
		}
	 
		public void setName(String name) {
			this.name = name;
		}
		
		
	}



