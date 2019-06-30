package com.zyl.award.commons.model.po;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;

@Data
public abstract class BaseSortTreePO<PK> extends BaseTreePO<PK> implements SortTreePO<Integer>{

	@ApiModelProperty(value = "排序值")
	@Column(name = "sort")
	private Integer sort;

}
