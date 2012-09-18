package com.genscript.gsscm.order.dao;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.genscript.core.orm.hibernate.HibernateDao;
import com.genscript.gsscm.order.entity.OrderTemplate;

@Repository
public class OrderTemplateDao extends HibernateDao<OrderTemplate, Integer>{
	public Long getMyTemplateCount(Integer userId) {
		String hql = "select count(owner) from OrderTemplate where owner=:owner";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("owner", userId);
		return this.findUnique(hql, map);
	}
	
	/**
	 * 根据当前用户及tmplName查找OrderTemplate.
	 * @param owner
	 * @param tmplName
	 * @return
	 */
	public OrderTemplate getOrderTemplate(Integer owner, String tmplName) {
		String hql = "from OrderTemplate where owner=:owner and tmplName=:tmplName";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("owner", owner);
		map.put("tmplName", tmplName);
		return this.findUnique(hql, map);		
	}
	
	/**
	 * 批量删除OrderTemplate.
	 * @param ids
	 */
	public void delTemplateList(Object ids){
		String hql = "delete from OrderTemplate c where c.tmplId in (:ids)";
		Map<String,Object> map = Collections.singletonMap("ids", ids);
		batchExecute(hql, map);
	}
}
