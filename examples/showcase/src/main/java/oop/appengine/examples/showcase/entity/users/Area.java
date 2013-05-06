package oop.appengine.examples.showcase.entity.users;

import oop.appengine.examples.showcase.entity.IdEntity;

//@OrderBy("id asc")
public class Area extends IdEntity {

    // 上级ID
    private Integer parentId;
    // 名称
    private String areaName;
    // 类型
    private Integer areaType;

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getAreaType() {
        return areaType;
    }

    public void setAreaType(Integer areaType) {
        this.areaType = areaType;
    }

}
