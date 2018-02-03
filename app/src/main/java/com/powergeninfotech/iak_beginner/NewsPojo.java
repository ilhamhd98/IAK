package com.powergeninfotech.iak_beginner;

/**
 * Created by ilham on 2/3/18.
 */

public class NewsPojo {

    private String link_gambar;
    private String title;
    private String detail;

    public NewsPojo(String link_gambar, String title, String detail) {
        this.link_gambar = link_gambar;
        this.title = title;
        this.detail = detail;
    }

    public String getLink_gambar() {
        return link_gambar;
    }

    public void setLink_gambar(String link_gambar) {
        this.link_gambar = link_gambar;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }

    public String getDetail() {
        return detail;
    }
}
