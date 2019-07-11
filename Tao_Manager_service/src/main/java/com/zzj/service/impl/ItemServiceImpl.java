package com.zzj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzj.domain.PageListRes;
import com.zzj.domain.QueryVo;
import com.zzj.domain.TbItem;
import com.zzj.mapper.TbItemMapper;
import com.zzj.service.ItemService;
@Service
@Transactional
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(TbItem record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TbItem selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageListRes selectAll(QueryVo vo) {
		Page<Object> page = PageHelper.startPage(vo.getPage(),vo.getRows());
		List<TbItem> items = tbItemMapper.selectAll();
		
		PageListRes pageListRes = new PageListRes();
		pageListRes.setTotal(page.getTotal());
		pageListRes.setRows(items);
		return pageListRes;
	}

	@Override
	public int updateByPrimaryKey(TbItem record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
