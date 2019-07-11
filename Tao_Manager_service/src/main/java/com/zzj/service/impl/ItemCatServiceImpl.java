package com.zzj.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.domain.EasyUITreeNode;
import com.zzj.domain.TbItemCat;
import com.zzj.domain.TbItemCatExample;
import com.zzj.mapper.TbItemCatMapper;
import com.zzj.service.ItemCatService;
@Service
public class ItemCatServiceImpl implements ItemCatService{
	    @Autowired
	    private TbItemCatMapper itemCatMapper;

	    @Override
	    public List<EasyUITreeNode> getItemCatList(long parentId) {
	        //根据parentId查询分类列表
	        TbItemCatExample example = new TbItemCatExample();

	        //设置查询条件
	        TbItemCatExample.Criteria criteria = example.createCriteria();
	        criteria.andParentIdEqualTo(parentId);

	        List<TbItemCat> list = itemCatMapper.selectByExample(example);

	        //转换成EasyUITreeNode列表
	        List<EasyUITreeNode> resultList = new ArrayList<EasyUITreeNode>();
	        for (TbItemCat tbItemCat : list) {
	            EasyUITreeNode node = new EasyUITreeNode();
	            node.setId(tbItemCat.getId());
	            node.setText(tbItemCat.getName());
	            node.setState(tbItemCat.getIsParent() ? "closed" : "open");
	            resultList.add(node);
	        }

	        return resultList;
	    }

}
