package ars.module.location.repository;

import ars.module.location.model.Area;
import ars.database.hibernate.HibernateSimpleRepository;

/**
 * 区域数据持久抽象实现
 *
 * @param <T> 数据模型
 * @author wuyongqiang
 */
public abstract class AbstractAreaRepository<T extends Area> extends HibernateSimpleRepository<T>
    implements AreaRepository<T> {

}
