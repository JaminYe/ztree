package com.xbsoft.ztree.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 城市实体类
 * 
 * @author Jamin
 * @date 2019年5月25日 下午12:23:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
  /**
   * id
   *
   */
  private String id;
  /**
   * 城市名称
   *
   */
  private String name;
  /**
   * 上级城市
   *
   */
  private String pid;

}
