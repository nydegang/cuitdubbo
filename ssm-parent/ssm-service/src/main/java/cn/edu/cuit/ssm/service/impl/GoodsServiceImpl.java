package cn.edu.cuit.ssm.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edu.cuit.ssm.entity.Goods;
import cn.edu.cuit.ssm.mapper.GoodsMapper;
import cn.edu.cuit.ssm.service.GoodsService;
/**
 * 
 * 南阳德刚版权所有<br>
 * 个人主页http://www.guodexian.com<br>
 * 2019年7月11日上午9:51:33
 * 说明:注意修改类的注解
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
	@Autowired
   private  GoodsMapper goodsMapper;
	@Override
	public PageInfo<Goods> findAll(int pageNum,int pageSize) {
		//告诉从哪里开始
		PageHelper.startPage(pageNum, pageSize);
		List<Goods> ls=goodsMapper.findAll();
		//封装为
		PageInfo<Goods> pageInfo=new PageInfo<>(ls);
		return pageInfo;
	}

}
