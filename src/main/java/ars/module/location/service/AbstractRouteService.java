package ars.module.location.service;

import ars.module.location.model.Route;
import ars.database.service.StandardGeneralService;

/**
 * 线路业务操作抽象实现
 *
 * @param <T> 数据模型
 * @author wuyongqiang
 */
public abstract class AbstractRouteService<T extends Route> extends StandardGeneralService<T>
    implements RouteService<T> {

}
