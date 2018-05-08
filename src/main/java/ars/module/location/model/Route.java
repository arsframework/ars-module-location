package ars.module.location.model;

import ars.database.model.AbstractModel;

/**
 * 线路数据模型
 *
 * @author wuyongqiang
 */
public class Route extends AbstractModel {
    private static final long serialVersionUID = 1L;

    private Route next; // 下一个地点
    private Address address; // 所在地址

    public Route getNext() {
        return next;
    }

    public void setNext(Route next) {
        this.next = next;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        if (this.address == null) {
            return super.toString();
        }
        StringBuilder name = new StringBuilder(this.address.toString());
        return this.next == null ? name.toString() : name.append("->").append(this.next.toString()).toString();
    }

}
