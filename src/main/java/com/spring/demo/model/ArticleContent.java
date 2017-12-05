package com.spring.demo.model;

import javax.persistence.*;

@Entity
public class ArticleContent {
    @Id
    @GeneratedValue
    private Integer id;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name="content", columnDefinition="TEXT", nullable=true)
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
