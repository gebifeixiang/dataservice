package com.dataService.dataService.service;

import javax.jms.Destination;

/**
*
* 项目名称：dataService
* 类名称：MqSendService
* 类描述：
* 创建人：john
* 创建时间：2018年8月11日 下午2:06:56
* 修改人：john
* 修改时间：2018年8月11日 下午2:06:56
* 修改备注：
* @version
*
*/
public interface MqSendService {
	public void sendMsg(Destination destination, String msg);
    public void sendObject(Destination destination, Object obj);

}
