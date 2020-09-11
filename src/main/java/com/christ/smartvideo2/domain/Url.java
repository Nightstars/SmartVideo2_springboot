package com.christ.smartvideo2.domain;

public class Url {
    private String tag;
    private String link;

    public Url() {
    }

    public Url(String tag, String link) {
        this.tag = tag;
        this.link = link;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
