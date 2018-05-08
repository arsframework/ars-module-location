package ars.module.location.repository;

import ars.module.location.model.Route;
import ars.database.hibernate.HibernateSimpleRepository;

/**
 * 线路数据持久抽象实现
 *
 * @param <T> 数据模型
 * @author wuyongqiang
 */
public abstract class AbstractRouteRepository<T extends Route> extends HibernateSimpleRepository<T>
    implements RouteRepository<T> {

}
