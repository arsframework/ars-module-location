package ars.module.location.repository;

import ars.module.location.model.Area;
import ars.module.location.repository.AreaRepository;
import ars.database.hibernate.HibernateSimpleRepository;

/**
 * 区域数据持久抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractAreaRepository<T extends Area> extends HibernateSimpleRepository<T>
		implements AreaRepository<T> {

}
