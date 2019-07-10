package cn.edu.cuit.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;

import cn.edu.cuit.ssm.entity.Goods;
import cn.edu.cuit.ssm.service.GoodsService;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService goodsService;
    @RequestMapping("/goodsList")
	public String list(Model model,@RequestParam(required=false,defaultValue="1") int pageNum) {
		PageInfo<Goods> ls = goodsService.findAll(pageNum,2);
		model.addAttribute("ls", ls);
		System.out.println(ls);
		return "goodsList";
	}
}
