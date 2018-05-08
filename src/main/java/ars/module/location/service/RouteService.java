package ars.module.location.service;

import ars.invoke.local.Api;
import ars.module.location.model.Route;
import ars.database.service.BasicService;

/**
 * 线路业务操作接口
 *
 * @param <T> 数据模型
 * @author wuyongqiang
 */
@Api("location/route")
public interface RouteService<T extends Route> extends BasicService<T> {

}
