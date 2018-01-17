package ars.module.location.service;

import ars.invoke.local.Api;
import ars.module.location.model.Address;
import ars.database.service.BasicService;

/**
 * 地址业务操作接口
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
@Api("location/address")
public interface AddressService<T extends Address> extends BasicService<T> {

}
