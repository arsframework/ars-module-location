package ars.module.location.repository;

import ars.module.location.model.Address;
import ars.module.location.repository.AddressRepository;
import ars.database.hibernate.HibernateSimpleRepository;

/**
 * 地址数据持久抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractAddressRepository<T extends Address> extends HibernateSimpleRepository<T>
		implements AddressRepository<T> {

}
