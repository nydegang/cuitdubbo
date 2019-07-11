package cn.edu.cuit.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.edu.cuit.ssm.entity.Goods;
/**
 * 
 * 南阳德刚版权所有<br>
 * 个人主页http://www.guodexian.com<br>
 *
 * 说明:MyBatis对goods的映射
 */
public interface GoodsMapper {
    @Select("select goods_id as id,goods_name as name,goods_price as price,goods_num as num,goods_img as img ,goods_type as type from goods")
	List<Goods> findAll();

}
