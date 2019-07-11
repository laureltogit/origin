package com.zzj.service;

import java.util.List;

import com.zzj.domain.EasyUITreeNode;

public interface ItemCatService {
	List<EasyUITreeNode> getItemCatList(long parentId);

}
