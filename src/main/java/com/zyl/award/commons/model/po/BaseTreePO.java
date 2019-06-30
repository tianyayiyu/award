package com.zyl.award.commons.model.po;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;

@Data
public abstract class BaseTreePO<PK> extends BasePO<PK> implements TreePO<Integer> {

	@ApiModelProperty(value = "父ID")
	@Column(name = "parent_id")
	private Integer parentId;

}
