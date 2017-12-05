package com.spring.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Article {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="Title", nullable=false)
    private String title;

    @OneToOne
    @JoinColumn(name="Content")
    private ArticleContent content;

    @Column(name="CreateDate", nullable=false)
    private Date createDate;

    @ManyToOne
    @JoinColumn(name="CreateBy", nullable=false)
    private User createBy;

    @Column(name="ModifyDate", nullable=false)
    private Date modifyDate;

//    @ManyToOne
//    @JoinColumn(name="ModifyBy", nullable=true)
//    private User modifyBy;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArticleContent getContent() {
        return content;
    }

    public void setContent(ArticleContent content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public User getCreateBy() {
        return createBy;
    }

    public void setCreateBy(User createBy) {
        this.createBy = createBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

//    public User getModifyBy() {
//        return modifyBy;
//    }
//
//    public void setModifyBy(User modifyBy) {
//        this.modifyBy = modifyBy;
//    }

}
