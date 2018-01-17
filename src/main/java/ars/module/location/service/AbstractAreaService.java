package ars.module.location.service;

import ars.module.location.model.Area;
import ars.module.location.service.AreaService;
import ars.database.service.StandardGeneralService;

/**
 * 区域业务操作抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractAreaService<T extends Area> extends StandardGeneralService<T> implements AreaService<T> {

}
