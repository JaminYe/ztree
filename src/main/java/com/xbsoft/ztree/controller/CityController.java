package com.xbsoft.ztree.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xbsoft.ztree.entity.City;
import com.xbsoft.ztree.service.CityService;
import com.xbsoft.ztree.util.TreeNode;
import net.sf.json.JSONArray;

/**
 * 城市实体类controller层
 * 
 * @author Jamin
 * @date 2019年5月25日 下午1:32:38
 */
@Controller
@RequestMapping("city")
public class CityController {
  @Autowired
  CityService cityService;



  /**
   * 进入界面
   * 
   * @author Jamin
   * @date 2019年5月25日下午2:01:15
   * @return
   */
  @RequestMapping("index")
  public String index() {
    return "index";
  }

  @RequestMapping("index2")
  public String index2() {
    return "index2";
  }

  @RequestMapping("treeList")
  @ResponseBody
  public String treeList(TreeNode treeNodeParent) {
    // 判断如果id为空 首次进入赋值0
    if (treeNodeParent.getId() == null) {
      treeNodeParent.setId("0");
    }
    // 用于保存节点对象
    List<TreeNode> list = new ArrayList<TreeNode>();
    // 从数据库查询所有返回city对象集合
    List<City> cityList = cityService.findList(treeNodeParent);
    // 遍历逐个赋值
    for (int i = 0; i < cityList.size(); i++) {
      TreeNode treeNode = new TreeNode();
      treeNode.setId(cityList.get(i).getId());
      treeNode.setName(cityList.get(i).getName());
      treeNode.setPid(cityList.get(i).getPid());
      // 判断是否有子节点
      treeNode.setIsParent(cityService.childCount(treeNode) > 0 ? true : false);
      list.add(treeNode);
    }
    // 使用json工具转换为json字符串这里使用的是json-lib也可以使用alibaba的fastJson
    return JSONArray.fromObject(list).toString();
  }



}
