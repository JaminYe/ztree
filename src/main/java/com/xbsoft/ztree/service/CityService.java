package com.xbsoft.ztree.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xbsoft.ztree.dao.CityDao;
import com.xbsoft.ztree.entity.City;
import com.xbsoft.ztree.util.TreeNode;

/**
 *
 * @author Jamin
 * @date 2019年5月25日 下午1:31:06
 */
@Service
public class CityService {
  @Autowired
  CityDao cityDao;

  /**
   * 查询所有
   * 
   * @return
   */
  public List<City> findList(TreeNode treeNode) {
    return cityDao.findList(treeNode);

  };

  /**
   * 查询子节点
   * 
   * @return
   */
  public int childCount(TreeNode treeNode) {
    return cityDao.childCount(treeNode);
  }
}
