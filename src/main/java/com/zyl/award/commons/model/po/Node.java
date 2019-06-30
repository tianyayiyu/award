package com.zyl.award.commons.model.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Node<E extends TreePO> {

	private E parent;

	private List<Node<E>> children;

}
