package com.zzj.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zzj.domain.PageListRes;
import com.zzj.domain.QueryVo;
import com.zzj.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item-list")
	public String item(){
		return "item-list";
	}
	
	@RequestMapping("/item-add")
	public String itemAddShow(){
		return "item-add";
	}

	@RequestMapping("/item/list")
	@ResponseBody
	public PageListRes itemList(QueryVo vo){
		PageListRes items = itemService.selectAll(vo);
		return items;
	}
}
