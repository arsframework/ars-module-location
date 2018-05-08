package ars.module.location.model;

import ars.database.model.AbstractModel;

/**
 * 地址数据模型
 *
 * @author wuyongqiang
 */
public class Address extends AbstractModel {
    private static final long serialVersionUID = 1L;

    private Area area; // 所属区域
    private String position; // 地址位置
    private Double longitude; // 所在经度
    private Double latitude; // 所在维度

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return this.position == null ? super.toString()
            : this.area == null ? this.position
            : new StringBuilder(this.area.toString()).append(" ").append(this.position).toString();
    }

}
