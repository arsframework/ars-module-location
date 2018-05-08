package ars.module.location.service;

import ars.invoke.local.Api;
import ars.module.location.model.Area;
import ars.database.service.TreeService;
import ars.database.service.BasicService;

/**
 * 区域业务操作接口
 *
 * @param <T> 数据模型
 * @author wuyongqiang
 */
@Api("location/area")
public interface AreaService<T extends Area> extends BasicService<T>, TreeService<T> {

}
