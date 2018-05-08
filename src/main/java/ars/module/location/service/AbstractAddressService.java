package ars.module.location.service;

import ars.module.location.model.Address;
import ars.database.service.StandardGeneralService;

/**
 * 地址业务操作抽象实现
 *
 * @param <T> 数据模型
 * @author wuyongqiang
 */
public abstract class AbstractAddressService<T extends Address> extends StandardGeneralService<T>
    implements AddressService<T> {

}
