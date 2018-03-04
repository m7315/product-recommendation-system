package com.lyu.shopping.sysmanage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lyu.shopping.common.dto.PageParam;
import com.lyu.shopping.sysmanage.entity.Category1;
import com.lyu.shopping.sysmanage.mapper.Category1Mapper;
import com.lyu.shopping.sysmanage.service.Category1Service;

/**
 * 类描述：一级类目服务接口的实现类
 * 类名称：com.lyu.shopping.sysmanage.service.impl.Category1ServiceImpl
 * @author 曲健磊
 * 2018年3月4日.下午8:56:46
 * @version V1.0
 */
@Service("category1Service")
public class Category1ServiceImpl implements Category1Service {

	@Autowired
	private Category1Mapper category1Mapper;
	
	@Override
	public PageInfo<Category1> listCategory1(Category1 category1, PageParam pageParam) {
		// 开启分页
		PageHelper.startPage(pageParam.getPageNo(), pageParam.getPageSize());
		// 查询一级类目列表
		List<Category1> category1List = this.category1Mapper.listCategory1(category1);
		// 构造分页信息对象
		PageInfo<Category1> pageInfo = new PageInfo<Category1>(category1List);
		
		return pageInfo;
	}

}
