package com.company.project.model;

import javax.persistence.*;

@Table(name = "baliguan_news")
public class BaliguanNews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String tag;

    @Column(name = "new_url")
    private String newUrl;

    @Column(name = "new_date")
    private String newDate;

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
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * @param tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * @return new_url
     */
    public String getNewUrl() {
        return newUrl;
    }

    /**
     * @param newUrl
     */
    public void setNewUrl(String newUrl) {
        this.newUrl = newUrl;
    }

    /**
     * @return new_date
     */
    public String getNewDate() {
        return newDate;
    }

    /**
     * @param newDate
     */
    public void setNewDate(String newDate) {
        this.newDate = newDate;
    }
}