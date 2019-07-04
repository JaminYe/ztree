package com.xbsoft.ztree.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.xbsoft.ztree.entity.City;
import com.xbsoft.ztree.util.TreeNode;

/**
 * 城市层接口
 * 
 * @author Jamin
 * @date 2019年5月25日 下午1:05:49
 */
@Repository
public interface CityDao {


  /**
   * 查询所有
   * 
   * @return
   */
  public List<City> findList(TreeNode treeNode);

  /**
   * 查询子节点
   * 
   * @return
   */
  public int childCount(TreeNode treeNode);

}
