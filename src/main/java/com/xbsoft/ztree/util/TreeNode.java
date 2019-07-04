package com.xbsoft.ztree.util;

/**
 *
 * @author Jamin
 * @date 2019年6月22日 下午10:00:10
 */


public class TreeNode {
  /**
   * 节点id
   *
   */
  private String id;
  /**
   * 节点名
   *
   *
   */
  private String name;
  /**
   * 节点父id
   */
  private String pid;
  /**
   * 是否为父类
   */
  private boolean isParent;
  /**
   * 是否被选中
   */
  private boolean checked;

  public boolean isChecked() {
    return checked;
  }

  public void setChecked(boolean checked) {
    this.checked = checked;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public boolean getIsParent() {
    return isParent;
  }

  public void setIsParent(boolean isParent) {
    this.isParent = isParent;
  }
}
