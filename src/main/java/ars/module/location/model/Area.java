package ars.module.location.model;

import ars.database.model.AbstractTreeModel;

/**
 * 区域数据模型
 * 
 * @author yongqiangwu
 *
 */
public class Area extends AbstractTreeModel<Area> {
	private static final long serialVersionUID = 1L;

	private String code; // 区域编码
	private String name; // 区域名称
	private String simplify; // 区域名称简写

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSimplify() {
		return simplify;
	}

	public void setSimplify(String simplify) {
		this.simplify = simplify;
	}

	@Override
	public String toString() {
		return this.name == null ? super.toString() : this.name;
	}

}
