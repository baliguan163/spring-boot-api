package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "yangxian_new")
public class YangxianNew {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @Column(name = "source_in")
    private String sourceIn;

    @Column(name = "public_time")
    private Date publicTime;

    private String auth;

    private String edit;

    private String url;

    @Column(name = "img_list")
    private String imgList;

    @Column(name = "date_time")
    private Date dateTime;

    private String content;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return source_in
     */
    public String getSourceIn() {
        return sourceIn;
    }

    /**
     * @param sourceIn
     */
    public void setSourceIn(String sourceIn) {
        this.sourceIn = sourceIn;
    }

    /**
     * @return public_time
     */
    public Date getPublicTime() {
        return publicTime;
    }

    /**
     * @param publicTime
     */
    public void setPublicTime(Date publicTime) {
        this.publicTime = publicTime;
    }

    /**
     * @return auth
     */
    public String getAuth() {
        return auth;
    }

    /**
     * @param auth
     */
    public void setAuth(String auth) {
        this.auth = auth;
    }

    /**
     * @return edit
     */
    public String getEdit() {
        return edit;
    }

    /**
     * @param edit
     */
    public void setEdit(String edit) {
        this.edit = edit;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return img_list
     */
    public String getImgList() {
        return imgList;
    }

    /**
     * @param imgList
     */
    public void setImgList(String imgList) {
        this.imgList = imgList;
    }

    /**
     * @return date_time
     */
    public Date getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime
     */
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }
}