package cn.stylefeng.guns.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName("tb_class")
public class TClassResponse {
    @TableField("row_guid")
    private String rowGuid;

    @TableField("group_guid")
    private String groupGuid;

    @TableId(value = "id")
    private String id;

    /**
     * 课节名称
     */
    @TableField("t_name")
    private String tName;

    /**
     * t_teacher
     */
    @TableField("t_teacher")
    private String tTeacher;

    /**
     * 知识点
     */
    @TableField("t_point")
    private String tPoint;

    /**
     * 创作方式
     */
    @TableField("t_methods")
    private String tMethods;

    @TableField("t_update_man")
    private String updateMan;

    @TableField("t_update_date")
    private Date updateDate;

    @TableField("t_img_url")
    private String imgUrl;

    /**
     * 是否试听
     */
    @TableField("t_istest")
    private Boolean tIstest;

    @TableField("study_status")
    private Integer studyStatus;

    @TableField("t_status")
    private Integer tStatus;

    public String getRowGuid() {
        return rowGuid;
    }

    public void setRowGuid(String rowGuid) {
        this.rowGuid = rowGuid;
    }

    public String getGroupGuid() {
        return groupGuid;
    }

    public void setGroupGuid(String groupGuid) {
        this.groupGuid = groupGuid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettTeacher() {
        return tTeacher;
    }

    public void settTeacher(String tTeacher) {
        this.tTeacher = tTeacher;
    }

    public String gettPoint() {
        return tPoint;
    }

    public void settPoint(String tPoint) {
        this.tPoint = tPoint;
    }

    public String gettMethods() {
        return tMethods;
    }

    public void settMethods(String tMethods) {
        this.tMethods = tMethods;
    }

    public String getUpdateMan() {
        return updateMan;
    }

    public void setUpdateMan(String updateMan) {
        this.updateMan = updateMan;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Boolean gettIstest() {
        return tIstest;
    }

    public void settIstest(Boolean tIstest) {
        this.tIstest = tIstest;
    }

    public Integer getStudyStatus() {
        return studyStatus;
    }

    public void setStudyStatus(Integer studyStatus) {
        this.studyStatus = studyStatus;
    }

    public Integer gettStatus() {
        return tStatus;
    }

    public void settStatus(Integer tStatus) {
        this.tStatus = tStatus;
    }
}
