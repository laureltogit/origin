package com.zzj.service;

import java.util.List;

import com.zzj.domain.PageListRes;
import com.zzj.domain.QueryVo;
import com.zzj.domain.TbItem;

public interface ItemService {

	 	int deleteByPrimaryKey(Long id);

	    int insert(TbItem record);

	    TbItem selectByPrimaryKey(Long id);

	    PageListRes selectAll(QueryVo vo);

	    int updateByPrimaryKey(TbItem record);
}
