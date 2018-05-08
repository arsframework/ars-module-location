package ars.module.location.repository;

import ars.module.location.model.Address;
import ars.database.hibernate.HibernateSimpleRepository;

/**
 * 地址数据持久抽象实现
 *
 * @param <T> 数据模型
 * @author wuyongqiang
 */
public abstract class AbstractAddressRepository<T extends Address> extends HibernateSimpleRepository<T>
    implements AddressRepository<T> {

}
