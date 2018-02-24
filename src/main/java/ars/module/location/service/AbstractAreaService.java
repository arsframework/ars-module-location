package ars.module.location.service;

import java.util.Map;

import ars.invoke.request.Requester;
import ars.invoke.request.ParameterInvalidException;
import ars.database.repository.Query;
import ars.database.service.StandardGeneralService;
import ars.module.location.model.Area;
import ars.module.location.service.AreaService;

/**
 * 区域业务操作抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractAreaService<T extends Area> extends StandardGeneralService<T> implements AreaService<T> {

	@Override
	public void initObject(Requester requester, T entity, Map<String, Object> parameters) {
		super.initObject(requester, entity, parameters);
		Area parent = entity.getParent();
		Query<T> query = this.getRepository().query().ne("id", entity.getId()).eq("name", entity.getName());
		if (parent == null) {
			query.empty("parent");
		} else {
			query.eq("parent", parent);
		}
		if (query.count() > 0) {
			throw new ParameterInvalidException("name", "exist");
		}
	}

}
