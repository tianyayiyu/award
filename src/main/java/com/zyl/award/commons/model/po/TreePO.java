package com.zyl.award.commons.model.po;

public interface TreePO<PK> extends PO<PK> {

	PK getParentId();

	void setParentId(PK parentId);

}
