package ars.module.location.repository;

import ars.module.location.model.Address;
import ars.database.repository.Repository;

/**
 * 地址数据操作接口
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public interface AddressRepository<T extends Address> extends Repository<T> {

}
