package ars.module.location.service;

import ars.module.location.model.Address;
import ars.module.location.service.AddressService;
import ars.database.service.StandardGeneralService;

/**
 * 地址业务操作抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractAddressService<T extends Address> extends StandardGeneralService<T>
		implements AddressService<T> {

}
